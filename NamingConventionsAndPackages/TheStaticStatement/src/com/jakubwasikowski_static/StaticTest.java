package com.jakubwasikowski_static;

public class StaticTest {
    private static int numInstances=0; //without word static numInstance is incremented one time no matter how many instances were
    // created and it`s equal 1, with word static variable is incremented each time when new instance is created
    // (ex. 3 instances created, variable is equal 3)
    // one variable in memory ,and it`s copy is sheared
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
