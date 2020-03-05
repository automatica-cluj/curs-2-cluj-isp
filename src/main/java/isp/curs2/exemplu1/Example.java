package isp.curs2.exemplu1;


import java.util.logging.Logger;

/**
 * @author mihai.hulea
 */
public class Example {

    public static void main(String[] args) {
        Robot r1 = new Robot(); //instantiere obiect
        Robot r2 = new Robot();
        Robot r3 = null;

        r1.x = 10;
        r2.x = 20;
        //r3.x = 9; NullPointerExcetion

        // accesarea
        System.out.println(r1);
        System.out.println(r2);

        System.out.println(r1.x);
        System.out.println(r2.x);

        r1 = r2;
        System.out.println(r1.x);
        System.out.println(r2.x);

        System.out.println(r1);
        System.out.println(r2);

        //cum functioneaza static //definim x static si vedem diferenta
        System.out.println(".........");
        r3 = new Robot();
        r3.x = 40;
        System.out.println(r3);
        System.out.println(r2);

        /////// constructori

        Robot r4 = new Robot(10);
        System.out.println(r4);

        ////// metode

        r4.move();

        System.out.println("Distance:" + r4.computeDistance(r3));
    }
}
