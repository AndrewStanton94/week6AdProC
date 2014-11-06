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
public class RightAngleTriangle extends Triangle{

    public RightAngleTriangle(double a, double b) {
        super(a, b, b);
        type = "Right Angle";
    }
    
    public double area(){
        return a*b / c;
    }
}
