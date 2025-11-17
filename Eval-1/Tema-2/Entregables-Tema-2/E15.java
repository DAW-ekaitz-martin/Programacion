import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero natural entre el 1 y el 3999: ");
        int num = scanner.nextInt();

        if (num < 1 || num > 3999) {
            System.out.println("El número no está en el rango indicado");
        }
        else {
            if (num >= 1000) {
                if (num >= 3000) {
                System.out.print("MMM");
                num -= 3000;
                }
                else if (num >= 2000) {
                System.out.print("MM");
                num -= 2000;}
                else {
                    System.out.print("M");
                num -= 1000;
                }
            }
            if (num >= 900) {
                System.out.print("CM");
                num -= 900;
            }
            if (num >= 500) {
                System.out.print("D");
                num -= 500;
            }
            if (num >= 100) {
                if (num >= 400) {
                System.out.print("CD");
                num -= 400;
                }
                else if (num >= 300) {
                System.out.print("CCC");
                num -= 300;
                }
                else if (num >= 200) {
                System.out.print("CC");
                num -= 200;
                }
                else {
                System.out.print("C");
                num -= 100;
                }
            }
            if (num >= 90) {
                System.out.print("XC");
                num -= 90;
            }
            if (num >= 50) {
                System.out.print("L");
                num -= 50;
            }
            if (num >= 10) {
                if (num >= 40) {
                System.out.print("XL");
                num -= 40;
                }
                else if (num >= 30) {
                System.out.print("XXX");
                num -= 30;
                }
                else if (num >= 20) {
                System.out.print("XX");
                num -= 20;
                }
                else {
                System.out.print("X");
                num -= 10;
                }
            }
            if (num >= 5) {
                if (num == 9) {
                    System.out.print("IX");
                    num -= 9;
                }
                else if (num == 8) {
                    System.out.print("VIII");
                    num -= 8;
                }
                else if (num == 7) {
                    System.out.print("VII");
                    num -= 7;
                }
                else if (num == 6) {
                    System.out.print("VI");
                    num -= 6;
                }
                else {
                    System.out.print("V");
                    num -= 5;
                }
            }
            if (num < 5) {
                if (num == 4) {
                   System.out.print("IV"); 
                   num -= 4;
                }
                else if (num == 3) {
                   System.out.print("III"); 
                   num -= 3;
                }
                else if (num == 2) {
                   System.out.print("II"); 
                   num -= 2;
                }
                else if (num == 1) {
                   System.out.print("I"); 
                   num -= 1;
                }
            }
            scanner.close();
        }
    }
}
