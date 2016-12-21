package com.mapzen.nativelibrary;

public class Cuber {

    static {
        System.loadLibrary("nativelibrary");
    }

    public static native int cube(int number);
}
