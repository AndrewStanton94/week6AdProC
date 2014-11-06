/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangles;

/**
 *
 * @author up683693
 */
public class Triangle {
    double a, b, c;
    String type = "Scalene";
    
    public Triangle(double a, double b, double c){           
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double perimiter(){
        return a + b + c;
    }
    
    public double area(){
        double p = perimiter() / 2;
        double ans = p * (p-a) * (p-b) * (p-c);
        return Math.sqrt(ans);
    }
    
    public void info(){
        System.out.println("Type: " + type);
        System.out.println("Perimiter: " + perimiter());
        System.out.println("Area: " + area());
    }
}
