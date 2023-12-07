import java.util.*;

public class ClassA {

    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;

    void meth(int repeis) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("How much you need?");
        // System.out.println("Enter the unit:");
        int unit = sc.nextInt();
        sc.nextLine();

        int bill = unit * repeis;
        if (bill >= 100) {
            int discount = (bill / 100) * 10;
            System.out.println("your final-bill is :" + (bill - discount));
            System.out.println("conglution your have saved " + discount + " on your final bill");
        } else {
            System.out.println("you final bill is :" + bill);
        }

    }

    void called() {
        Scanner cl = new Scanner(System.in);
        System.out.println("Press the valid Call");
        System.out.println("Press 01 is Continue:");
        System.out.println("Press 02 is stop:");

        int a = 01;
        // cl.nextLine();
        int b = 02;
        // cl.nextLine();

        if (a == 01) {
            System.out.println(a);

            new ClassA().meth1();
        } else if (a == 02) {
            System.out.println(b);

            new ClassA().address();

        } else {
            System.out.println("Wrong input");
        }

    }

    void meth1() {

        System.out.println("1) Friute ");
        System.out.println("2) Vegetable");
        System.out.println("3) Cosmetics");
        System.out.println("4) Masala powder");
        System.out.println("-----------------------");
        System.out.println("Plese Enter a Valid Option");

        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();
        // sc.nextLine();

        ClassA obj = new ClassA();

        System.out.println("--------------------------");

        if (option == 1) {
            System.out.println("Furite 1");

            System.out.println("101) Apple");
            System.out.println("102) Banana");
            System.out.println("103) Grapes");
            System.out.println("104) Mango");
            System.out.println("105) Orange");

            System.out.println("-----------------------");
            System.out.println("Plese Enter a Valid Option");

            int option1 = sc.nextInt();
            sc.nextLine();

            System.out.println("--------------------------");

            switch (option1) {
                case 101:

                    System.out.println("apple is good for the health");
                    System.out.println("how much you need?");
                    int unit = sc.nextInt();
                    // sc.nextInt();
                    System.out.println("Your unit is:" + unit);
                    ClassA aobj101 = new ClassA();

                    aobj101.meth(100);
                    aobj101.called();

                    break;

                case 102:
                    System.out.println("Banana is good for the health");
                    System.out.println("how much you need?");
                    int unit1 = sc.nextInt();
                    System.out.println("Your unit is:" + unit1);
                    ClassA aobj102 = new ClassA();
                    aobj102.called();

                    aobj102.meth(60);

                    break;
                case 103:
                    System.out.println();

                    break;
                case 104:
                    System.out.println();

                    break;
                case 105:
                    System.out.println();

                    break;
                default:
                    break;
            }

        } else if (option == 2) {
            System.out.println(" Vegetable 2");

        } else if (option == 3) {
            System.out.println(" Cosmetics 3");

        } else if (option == 4) {
            System.out.println(" Masala powder 4");

        }

        else {
            System.out.println("Please Enter right input ");
        }
    }

    void address() {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

    }

    public static void main(String[] args) {
        System.out.println("====Welcome to Orgranic Store====");

        ClassA aobj = new ClassA();
        aobj.meth1();
        Scanner sc = new Scanner(System.in);
        // sc.nextLine();

    }
}
