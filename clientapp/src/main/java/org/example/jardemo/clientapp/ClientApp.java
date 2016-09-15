package org.example.jardemo.clientapp;

import org.example.jardemo.common.Jar2Class;

public class ClientApp {

    public static void main(String[] args) throws Exception {

        boolean randomTrue = Math.random() > 0.5D;
        System.out.println("Jar1Class " + ((randomTrue) ? "will" : "will not") + " be loaded on this run.");
        if (randomTrue) {
            /*
             * This loads a class that is in a jar that also has a Jar2Class in
             * it.
             */
            Class.forName("org.example.jardemo.common.Jar1Class");
        }

        Jar2Class jar2Class = new Jar2Class();

        jar2Class.whichOneIsIt();
    }

}
