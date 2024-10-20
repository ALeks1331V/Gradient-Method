package org.example;

public class BinarySearch {
    private double start;
    private double end;
    private final double err = 1.0E-6;

    public BinarySearch(double start, double end){
        this.start = start;
        this.end = end;
    }

    private double fx(double x){
        return (Math.pow(x,2) - 2);
    }

    public void solve(){
        double root = (start + end)/2;
        while (Math.abs(fx(root)) > err){
            if ((fx(root) - err) > 0){
                end = root;
            }

            else{
                start = root;
            }
            root = (start + end)/2;
        }
        System.out.println("Root = " + root);
    }
}