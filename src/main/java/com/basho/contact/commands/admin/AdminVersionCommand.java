package com.basho.contact.commands.admin;

import com.basho.contact.RuntimeContext;
import com.ericsson.otp.erlang.OtpErlangList;
import com.ericsson.otp.erlang.OtpErlangObject;
import com.ericsson.otp.erlang.OtpErlangTuple;

import java.util.Iterator;

public class AdminVersionCommand  extends AdminCommand {

    public AdminVersionCommand() {
        super("application","which_applications");
    }

    @Override
    public OtpErlangList preprocess(RuntimeContext ctx, String connid) {
        return new OtpErlangList();
    }

    @Override
    public void postprocess(RuntimeContext ctx, OtpErlangObject result) {
        OtpErlangList l = (OtpErlangList)result;
        Iterator<OtpErlangObject> it = l.iterator();
        while(it.hasNext()) {
            OtpErlangTuple t = (OtpErlangTuple)it.next();
            System.out.println(t.elementAt(0) + ":" + t.elementAt(2));

        }
    }
}
