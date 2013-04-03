package com.basho.contact;

import sun.misc.Signal;
import sun.misc.SignalHandler;

public class ConsoleSignalHander implements SignalHandler{
    RuntimeContext ctx;

    public void handle(Signal signal) {
        if(ctx.getExecutor().getCurrentFuture() != null) {
            try {
                System.err.println("Cancelling current command.");
                ctx.getExecutor().getCurrentFuture().cancel(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("No running command, exiting.");
            oldHandler.handle(signal);
        }
    }

    private SignalHandler oldHandler;

    // Static method to install the signal handler
    public static ConsoleSignalHander install(String signalName, RuntimeContext ctx) {
        Signal diagSignal = new Signal(signalName);
        ConsoleSignalHander handler = new ConsoleSignalHander();
        handler.oldHandler = Signal.handle(diagSignal,handler);
        handler.ctx = ctx;
        return handler;
    }
}
