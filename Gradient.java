package org.example;

public class Gradient {
    private final double l = 0.1;
    private final double err = 1.0E-6;
    private double startX;
    private double startY;

    public Gradient(double x, double y){
        startX = x;
        startY = y;
    }

    private double fxy(double x, double y){
        return Math.pow((x-1),2) + Math.pow((y-2),2);
    }

    private double dX(double x, double y){

        return (fxy(x + err,y) - fxy(x,y))/(err);
    }

    private double dY(double x, double y){
        //double epsilon = 0.000001;
        return (fxy(x,y + err) - fxy(x,y))/(err);
    }

    public void solve(){
        double x = startX;
        double y = startY;
        double checkErr = 1;
        while(checkErr > err){
            double tempX = x - l*dX(x,y);
            double tempY = y - l*dY(x,y);
            checkErr = Math.sqrt(Math.pow((x-tempX),2)*Math.pow((y-tempY),2));
            x = tempX;
            y = tempY;
        }
        System.out.println("x: " + x + "\ny: " + y);
        System.out.println("Знаечние в минимуме: " + fxy(x, y));
    }
}
