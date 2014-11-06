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
public class EquilateralTriangle extends Triangle{
    

    public EquilateralTriangle(double a) {
        super(a, a, a);
        type = "Equilateral";
    }
    
    public double area(){
        return Math.pow(a, 2) * Math.sqrt(3) / 4;
    }
    
}
