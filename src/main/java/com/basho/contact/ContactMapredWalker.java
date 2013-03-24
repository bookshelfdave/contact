package com.basho.contact;

import com.basho.contact.ContactParser.*;
import com.basho.contact.mr.MRPhase;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.List;

public class ContactMapredWalker extends ContactBaseListener {
    ParseTreeProperty<Object> values = new ParseTreeProperty<Object>();

    public RuntimeContext runtimeCtx = null;

    public ContactMapredWalker(RuntimeContext ctx) {
        this.runtimeCtx = ctx;
    }

    public void setValue(ParseTree node, Object value) {
        values.put(node, value);
    }

    public Object getValue(ParseTree node) {
        return values.get(node);
    }

    @Override
    public void exitMapred(MapredContext ctx) {
        if (ctx.mapred_inputs() != null) {
            //List<Pair> inputs = (List<Pair>)getValue(ctx.mapred_inputs());

        } else if (ctx.mapred_bucket() != null) {
            System.out.println("Mapred bucket = " + getValue(ctx.mapred_bucket()));
        }
        List<Mapred_phaseContext> phases = ctx.mapred_phase();
        System.out.println("Total MR phases " + phases.size());
        for (Mapred_phaseContext phase : phases) {
            MRPhase p = (MRPhase) getValue(phase);
            System.out.println(p.toString());
        }
        super.exitMapred(ctx);
    }

    @Override
    public void exitMapred_inputs(Mapred_inputsContext ctx) {
        // can't use a map here because the same key can be used many times
        List<Pair> pairs = new ArrayList<Pair>();
        for (PairContext pc : ctx.ins) {
            Pair p = (Pair) getValue(pc);
            pairs.add(p);
        }
        setValue(ctx, pairs);
        super.exitMapred_inputs(ctx);
    }


    @Override
    public void exitPair(PairContext ctx) {
        Object o = getValue(ctx.pairValue());
        if (ctx.name != null) {
            String name = stripQuotes(ctx.name.getText());
            Pair p = new Pair(name, o);
            trace("New pair " + p);
            setValue(ctx, p);
        } else {
            String name = ctx.id.getText();
            Pair p = new Pair(name, o);
            trace("New id pair " + p);
            setValue(ctx, p);
        }
        super.exitPair(ctx);
    }

    // TODO: move to a base class
    @Override
    public void exitPairStringValue(PairStringValueContext ctx) {
        setValue(ctx, stripQuotes(ctx.stringValue.getText()));
        super.exitPairStringValue(ctx);
    }

    // TODO: move to a base class
    @Override
    public void exitPairIntValue(PairIntValueContext ctx) {
        setValue(ctx, Integer.parseInt(ctx.intValue.getText()));
        super.exitPairIntValue(ctx);
    }

    // TODO: move to a base class
    @Override
    public void exitPairBoolValue(PairBoolValueContext ctx) {
        setValue(ctx, Boolean.parseBoolean(ctx.boolValue.getText()));
        super.exitPairBoolValue(ctx);
    }


    @Override
    public void exitMapred_keyfilter_args(Mapred_keyfilter_argsContext ctx) {
        // TODO Auto-generated method stub
        super.exitMapred_keyfilter_args(ctx);
    }

    @Override
    public void exitMapred_input_join(Mapred_input_joinContext ctx) {
        // TODO Auto-generated method stub
        super.exitMapred_input_join(ctx);
    }

    @Override
    public void exitMapred_bucket(Mapred_bucketContext ctx) {
        setValue(ctx, stripQuotes(ctx.name.getText()));
        super.exitMapred_bucket(ctx);
    }

    @Override
    public void exitMapred_keyfilter(Mapred_keyfilterContext ctx) {
        // TODO Auto-generated method stub
        super.exitMapred_keyfilter(ctx);
    }

    @Override
    public void exitMapred_keyfilters(Mapred_keyfiltersContext ctx) {
        // TODO Auto-generated method stub
        super.exitMapred_keyfilters(ctx);
    }

    @Override
    public void exitMapred_keyfilter_arg(Mapred_keyfilter_argContext ctx) {
        // TODO Auto-generated method stub
        super.exitMapred_keyfilter_arg(ctx);
    }


    @Override
    public void exitMapred_phase(Mapred_phaseContext ctx) {
        Constants.MRLang lang = (Constants.MRLang) getValue(ctx.mapred_lang());
        Constants.MRPhaseType phaseType = (Constants.MRPhaseType) getValue(ctx.mapred_phase_type());
        boolean keep = false;
        if (ctx.mapred_phase_keep() != null) {
            keep = (Boolean) getValue(ctx.mapred_phase_keep());
        }
        String content = getDataContent(ctx.DATA_CONTENT().getText());
        MRPhase phase = new MRPhase(content, lang, phaseType, keep);
        setValue(ctx, phase);
        super.exitMapred_phase(ctx);
    }


    @Override
    public void exitMapRedPhaseTypeLink(MapRedPhaseTypeLinkContext ctx) {
        setValue(ctx, Constants.MRPhaseType.LINK);
        super.exitMapRedPhaseTypeLink(ctx);
    }


    @Override
    public void exitMapRedPhaseTypeMap(MapRedPhaseTypeMapContext ctx) {
        setValue(ctx, Constants.MRPhaseType.MAP);
        super.exitMapRedPhaseTypeMap(ctx);
    }

    @Override
    public void exitMapRedPhaseTypeReduce(MapRedPhaseTypeReduceContext ctx) {
        setValue(ctx, Constants.MRPhaseType.REDUCE);
        super.exitMapRedPhaseTypeReduce(ctx);
    }


    @Override
    public void exitMapRedLangErlang(MapRedLangErlangContext ctx) {
        setValue(ctx, Constants.MRLang.ERLANG);
        super.exitMapRedLangErlang(ctx);
    }

    @Override
    public void exitMapRedLangJavascript(MapRedLangJavascriptContext ctx) {
        setValue(ctx, Constants.MRLang.JAVASCRIPT);
        super.exitMapRedLangJavascript(ctx);
    }

    @Override
    public void exitMapred_phase_keep(Mapred_phase_keepContext ctx) {
        // If this node exists, then it's true
        setValue(ctx, true);
        super.exitMapred_phase_keep(ctx);
    }

    @Override
    public void exitBool(BoolContext ctx) {
        // TODO Auto-generated method stub
        super.exitBool(ctx);
    }


    // TODO: move to a common base class
    public String stripQuotes(String rawVal) {
        // should probably check if it's an empty string and all that..
        if (rawVal.length() == 2) {
            return "";
        } else if (rawVal.length() == 3) {
            return rawVal.substring(1, 2);
        } else {
            return rawVal.substring(1, rawVal.length() - 1);
        }
    }

    // TODO: move to a common base class
    public String getDataContent(String content) {
        // TODO: replace escaped content, etc
        return content.substring(3, content.length() - 3);
    }

    // TODO: move to a common base class
    private void trace(String msg) {
        if (runtimeCtx.trace) {
            System.out.println("TRACE:" + msg);
        }
    }

}
