package com.driver;

public class Main {
    public static void main(String[] args) {
   Product p = new Product();
   p.product(5,6);
   p.product(5,6,7);
   p.product(6.2,7.5);

    }
}
class Product{
    public int product(int x, int y) {
        int ans =  x*y;
        return ans;
    }
    public int product(int x, int y, int z) {
        int ans = x*y*z;
        return ans;
    }
    public double product(double x, double y) {
        double ans = x*y;
        return ans;
    }
}