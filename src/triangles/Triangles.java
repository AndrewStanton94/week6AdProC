/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangles;

import java.util.*;


/**
 *
 * @author up683693
 */
public class Triangles {
    /**
     * @param args the command line arguments
     */
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        double perimiter = 0;
        double area = 0;
        ArrayList<Triangle> tri = new ArrayList();
        
        System.out.println("Number of triangles to add: ");
        int lim = console.nextInt();
        console.nextLine();
        
        for (int i = 0; i < lim; i++){
            Triangle t = getTriangle();
            tri.add(t);
            t.info();
            perimiter += t.perimiter();
            area += t.area();
            System.out.println();
        }
        System.out.println("Total perimiter: " + perimiter);
        System.out.println("Total area: " + area);
        
        
    }

    static Triangle getTriangle() {
        double[] sides = new double[3];
        
        boolean repeat;

        do {
            repeat = false;
            System.out.println("Enter Triangle sides.");
            try {
                for (int i = 0; i < 3; i++) {
                    sides[i] = console.nextDouble();
                }
            }

            catch (InputMismatchException ex) {
                System.err.println("Invalid inputs: " + ex);
                repeat = true;
            }
            console.nextLine();
        }
        while (repeat);

        if (sides[0] == sides[1] && sides[1] == sides[2])
            return new EquilateralTriangle(sides[0]);
        if (sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2])
            return new RightAngleTriangle(sides[0], (sides[0] == sides[1]) ? sides[2] : sides[1]); 
        return new Triangle(sides[0], sides[1], sides[2]);
    }
}
