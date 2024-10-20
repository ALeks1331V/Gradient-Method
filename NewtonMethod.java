package org.example;

public class NewtonMethod {
    private final double err = 1.0E-6;
    private double startX;

    public NewtonMethod(double startX){
        this.startX = startX;
    }

    private double fx(double x){
        return (Math.pow(x,2) - 2);
    }

    private double dF(double x){
        return (fx(x+err) - fx(x))/err;
    }

    public void solve(){
        double x = 0;
        double nextX = startX;
        while (Math.abs(x-nextX) > err){
            x = nextX;
            nextX = x - (fx(x)/dF(x));
        }
        System.out.println("root = " + x);
    }
}
