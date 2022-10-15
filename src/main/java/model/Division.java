package model;

import java.io.IOException;

public class Division implements calculator{
    private int a;
    private int b;

    public Division(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double perform() throws IOException {
        if(a==0) throw new IOException();
        return a/b;
    }
}
