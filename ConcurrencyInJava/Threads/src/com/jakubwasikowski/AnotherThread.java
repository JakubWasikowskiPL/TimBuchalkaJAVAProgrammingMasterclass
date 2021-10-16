package com.jakubwasikowski;
import static com.jakubwasikowski.ThreadColor.ANSI_BLUE;
public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from another thread.");
    }
}
