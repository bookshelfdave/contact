package com.basho.contact.commands.params;

import com.basho.contact.actions.ActionParams;
import com.basho.contact.actions.Binding;
import com.google.common.base.Predicate;
import org.reflections.ReflectionUtils;
import org.reflections.Reflections;
import static org.reflections.Reflections.*;
import javax.annotation.Nullable;
import java.lang.reflect.Field;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenDocs {
    //http://basho.github.com/riak-java-client/1.1.0/com/basho/riak/client/IRiakClient.html
    public static class Doc {
        public Doc(String id) {
            this.id = id;
        }

        public Doc(String id, String clazz) {
            this.id = id;
            this.clazz = clazz;
        }
        String id;
        String clazz;
        List<Doc> pres = new ArrayList<Doc>();
        List<Doc> posts = new ArrayList<Doc>();
    }

    public static String linkifyClasses(String s) {
        if(s.startsWith("class")) {
            s = s.substring(6);
        } else if(s.startsWith("interface")) {
            s = s.substring(10);
        }
        Pattern p = Pattern.compile("([\\p{L}_$][\\p{L}\\p{N}_$]*\\.)*[\\p{L}_$][\\p{L}\\p{N}_$]*");
        Matcher m = p.matcher(s);

        StringBuffer docString = new StringBuffer();
        while(m.find()) {
            String classname = m.group();
            String url = "";
            if(classname.startsWith("java")) {
                // http://docs.oracle.com/javase/7/docs/api/java/lang/String.html
                url = "http://docs.oracle.com/javase/7/docs/api/" + classname.replace(".", "/") + ".html";
            } else if(classname.startsWith("com.basho")) {
                if(!classname.endsWith("RuntimeContext")) {
                    url = "http://basho.github.com/riak-java-client/1.1.0/" + classname.replace(".", "/") + ".html";
                }
            }
            String data = "[" + s.substring(m.start(), m.end()) + "]("+url+")";
            // [example](http://url.com/ "Title")
            m.appendReplacement(docString, data);
        }
        m.appendTail(docString);
        return docString.toString();
    }
    public static void main(String args[]) {
        //linkifyClasses("java.util.Map<java.lang.String, java.lang.Object>");
        //linkifyClasses("class com.basho.contact.RuntimeContext");
        //linkifyClasses("interface com.basho.riak.client.IRiakObject");
        Reflections reflections = new Reflections("com.basho.contact.commands.params");
        Map<String, Doc> params = new HashMap<String, Doc>();
        Set<Class<? extends ActionParams>> subTypes =
                reflections.getSubTypesOf(ActionParams.class);
        for(Class<? extends ActionParams> c : subTypes) {
            Set<Field> fields = ReflectionUtils.getAllFields(c, withAnnotation(Binding.class));
            for(Field f : fields) {
                String cname = c.getName().substring(c.getName().lastIndexOf(".")+1);
                String xname = c.getEnclosingClass().getName().substring(c.getEnclosingClass().getName().lastIndexOf(".")+1).toLowerCase();
                String name = xname.substring(0, xname.indexOf("params"));
                if(!params.containsKey(name)) {
                    params.put(name, new Doc(name));
                }
                Doc doc = params.get(name);
                Binding b = f.getAnnotation(Binding.class);
                Doc item = new Doc(b.name(), f.getGenericType().toString());
                if(cname.endsWith("Pre")) {
                    doc.pres.add(item);
                } else {
                    Doc post = new Doc(b.name());
                    doc.posts.add(item);
                }
                //System.out.println(cname + ":" + );
                //params.put(cname, f.getName());
            }
        }
        for(String k : params.keySet()) {
            System.out.println("* **" + k + "**");
            System.out.println("    * **Pre** parameters");
            for(Doc d : params.get(k).pres) {
                System.out.println("        * " + d.id + " : *" + linkifyClasses(d.clazz) + "*");
            }
            System.out.println("    * **Post** parameters");
            for(Doc d : params.get(k).posts) {
                System.out.println("        * " + d.id + " : *" + linkifyClasses(d.clazz) + "*");
            }
            System.out.println("");
        }
    }

}
