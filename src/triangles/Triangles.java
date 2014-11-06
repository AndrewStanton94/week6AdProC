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
    public static void main(String[] args) {
//        Triangle scalene = new Triangle(2, 4, 5);
//        scalene.info();
//
//        RightAngleTriangle ra = new RightAngleTriangle(3, 4);
//        ra.info();
//
//        EquilateralTriangle equi = new EquilateralTriangle(2);
//        equi.info();
        Triangle t = getTriangle();
        t.info();
    }

    static Triangle getTriangle() {
        double[] sides = new double[3];
        Scanner console = new Scanner(System.in);
        boolean repeat;

        do {
            repeat = false;
            System.out.println("Enter 1 .. 3 Triangle sides. Append non numeric character if inputs < 3");
            try {
                for (int i = 0; i < 3; i++) {
                    sides[i] = console.nextDouble();
                }
            }

            catch (InputMismatchException ex) {
                System.err.println(ex + "Precise catch");
                switch (sides.length) {
                    case 0:
                        repeat = true;
                        break;
                    case 1:
                        System.out.println("equi");
                        return new EquilateralTriangle(sides[0]);
                    case 2:
                        System.out.println("RA");
                        return new RightAngleTriangle(sides[0], sides[1]);
                    default:
                        System.err.println("Done goofed (?)");
                        break;
                }
            }

            catch (Exception ex) {
                System.err.println(ex + "vague catch");
            }
            console.nextLine();
        }
        while (repeat);

        return new Triangle(sides[0], sides[1], sides[2]);
    }
}
