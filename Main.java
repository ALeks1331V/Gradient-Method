package org.example;

public class Main {
    public static void main(String[] args) {
        Gradient g1 = new Gradient(5, 5);
        System.out.println("Метод градиентного спуска для ф-ии:  f(x, y) = (x - 1)² + (y - 2)²");
        g1.solve();

        NewtonMethod n = new NewtonMethod(2);
        System.out.println("\nМетод Ньютона для нахождения корня уравнения:");
        n.solve();

        BinarySearch b = new BinarySearch(0,4);
        System.out.println("\nБинарный поиск: ");
        b.solve();
    }
}