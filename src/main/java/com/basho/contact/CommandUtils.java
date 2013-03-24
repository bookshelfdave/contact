package com.basho.contact;

public class CommandUtils {

    // TODO: don't throw a runtime exception here
    public static int objectToInt(Object o) {
        if (o instanceof String) {
            return Integer.parseInt((String) o);
        } else if (o instanceof Integer) {
            return ((Integer) o).intValue();
        } else {
            throw new RuntimeException("Invalid option value " + o);
        }
    }

    // TODO: don't throw a runtime exception here
    public static boolean objectToBoolean(Object o) {
        if (o instanceof String) {
            return Boolean.parseBoolean((String) o);
        } else if (o instanceof Boolean) {
            return ((Boolean) o).booleanValue();
        } else {
            throw new RuntimeException("Invalid option value " + o);
        }
    }

}
