package com.jakubwasikowski;

public class Comet extends HeavenlyBody {
    public Comet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.COMET);
    }
}
