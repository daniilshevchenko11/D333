import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
        example7();
        example8();
        example9();
        System.out.print("Programm is finished");
    }




    private static void example1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x");
        double x = input.nextDouble();
        System.out.print("Enter y");
        double y = input.nextDouble();
        double a = 3 * Math.pow(x, (double)1/3);
        System.out.println("a="+a);
        System.out.println("_______________________________________________");
    }
    private static void example2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x");
        double x = input.nextDouble();
        System.out.print("Enter y");
        double y = input.nextDouble();
        double b = 4 * x * 3 - 12 * y;
        System.out.println("b="+b);
        System.out.println("_______________________________________________");
    }
    private static void example3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x");
        double x = input.nextDouble();
        System.out.print("Enter y");
        double y = input.nextDouble();
        double c = Math.sin(x*(-3+2*y)+1);
        System.out.println("c="+c);
        System.out.println("_______________________________________________");
    }
    private static void example4() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x");
        double x = input.nextDouble();
        System.out.print("Enter y");
        double y = input.nextDouble();
        double d = 122 * Math.pow(x, -2)  ;
        System.out.println("d="+d);
        System.out.println("_______________________________________________");
    }
    private static void example5() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x");
        double x = input.nextDouble();
        System.out.print("Enter y");
        double y = input.nextDouble();
        double e = Math.pow(x, 4)* Math.abs(485 - 179*y);
        System.out.println("e="+e);
        System.out.println("_______________________________________________");
    }
    private static void example6() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x");
        double x = input.nextDouble();
        System.out.print("Enter y");
        double y = input.nextDouble();
        double f = 3 + Math.pow(9, x) - 5/x - 1 ;
        System.out.println("f="+f);
        System.out.println("_______________________________________________");
    }
    private static void example7() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x");
        double x = input.nextDouble();
        System.out.print("Enter y");
        double y = input.nextDouble();
        double g = 2.5*(4-6*x)-5 ;
        System.out.println("g="+g);
        System.out.println("_______________________________________________");
    }
    private static void example8() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x");
        double x = input.nextDouble();
        System.out.print("Enter y");
        double y = input.nextDouble();
        double h = Math.cos(x/2)+Math.sin(x/4)+3*x/6;
        System.out.println("h="+h);
        System.out.println("_______________________________________________");
    }
    private static void example9() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x");
        double x = input.nextDouble();
        System.out.print("Enter y");
        double y = input.nextDouble();
        double i = Math.abs(5*x-3/(x*x)+6+7*Math.pow(x,3)-12) ;
        System.out.println("i="+i);
        System.out.println("_______________________________________________");
    }








}