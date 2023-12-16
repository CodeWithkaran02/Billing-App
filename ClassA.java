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
        // sc.nextLine();

        int bill = unit * repeis;
        if (bill >= 100) {
            int discount = (bill / 100) * 10;
            called();

            System.out.println("your final-bill is :" + (bill - discount));

            System.out.println("conglution your have saved " + discount + " on your final bill");
        } else {
            System.out.println("you final bill is :" + bill);
        }

    }

    void called() {
        Scanner cl = new Scanner(System.in);
        System.out.println("-----------------------");
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

            ClassA ao = new ClassA();
            ao.address();
            ao.bill();

        } else {
            System.out.println("Wrong input");
        }

    }

    void meth1() {

        System.out.println("-----------------------");
        System.out.println("1) Friute ");
        System.out.println("2) Vegetable");
        System.out.println("3) Cosmetics");
        System.out.println("4) Masala powder");
        System.out.println("-----------------------");
        System.out.println("Plese Enter a Valid Option");
        System.out.println("-----------------------");

        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();
        // sc.nextLine();

        ClassA obj = new ClassA();

        System.out.println("--------------------------");

        if (option == 1) {
            System.out.println("Furite 1");

            System.out.println("-----------------------");
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
                    ClassA aobj101 = new ClassA();
                    System.out.println("apple is good for the health");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");
                    int unit = sc.nextInt();
                    aobj101.address();
                    // sc.nextInt();
                    System.out.println("Your unit is:" + unit);

                    aobj101.meth(100);
                    // aobj101.called();

                    break;

                case 102:
                    System.out.println("Banana is good for the health");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");
                    int unit1 = sc.nextInt();

                    System.out.println("Your unit is:" + unit1);
                    ClassA aobj102 = new ClassA();
                    aobj102.called();

                    aobj102.meth(60);

                    break;
                case 103:
                    System.out.println("Grapas is impontant for teeth");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");

                    int unit2 = sc.nextInt();

                    System.out.println("Your unit is:" + unit2);
                    meth(140);

                    break;
                case 104:
                    System.out.println("Mango is king for Furite");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");
                    int unit3 = sc.nextInt();

                    System.out.println("Your unit is:" + unit3);
                    meth(60);
                    break;
                case 105:
                    System.out.println("Orange is good in Winter ");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");
                    int unit4 = sc.nextInt();

                    System.out.println("Your unit is:" + unit4);
                    meth(60);

                    break;
                default:
                    break;
            }

        } else if (option == 2) {
            System.out.println(" Vegetable 2");
            System.out.println("-----------------------");
            System.out.println("201) Patato");
            System.out.println("202) Cauliflower");
            System.out.println("203) Tamato ");
            System.out.println("204) Onion");
            System.out.println("205) Gralic");
            System.out.println("-----------------------");
            System.out.println("Plese Enter a Valid Option");

            int option2 = sc.nextInt();
            sc.nextLine();
            switch (option2) {
                case 201:
                    ClassA aobj101 = new ClassA();
                    System.out.println("Patato is king of Vegetable ");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");
                    int unit = sc.nextInt();
                    aobj101.address();
                    // sc.nextInt();
                    System.out.println("Your unit is:" + unit);

                    aobj101.meth(80);
                    // aobj101.called();

                    break;

                case 202:
                    System.out.println("Cauliflower is love for test");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");
                    int unit1 = sc.nextInt();

                    System.out.println("Your unit is:" + unit1);
                    ClassA aobj102 = new ClassA();
                    aobj102.called();

                    aobj102.meth(60);

                    break;
                case 203:
                    System.out.println("Tamato is vegetables by nutritionists");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");

                    int unit2 = sc.nextInt();

                    System.out.println("Your unit is:" + unit2);
                    meth(40);

                    break;
                case 204:
                    System.out.println("Onion is are a root vegetable");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");
                    int unit3 = sc.nextInt();

                    System.out.println("Your unit is:" + unit3);
                    meth(50);
                    break;
                case 205:
                    System.out.println("Gralic is herbs around the word ");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");
                    int unit4 = sc.nextInt();

                    System.out.println("Your unit is:" + unit4);
                    meth(200);

                    break;
                default:
                    break;
            }

        } else if (option == 3) {
            System.out.println(" Cosmetics 3");
            System.out.println("-----------------------");
            System.out.println("301) Compact");
            System.out.println("302) lipstic");
            System.out.println("303) eyeLiner");
            System.out.println("304) Kajal");
            System.out.println("305) Moisturizer");
            System.out.println("-----------------------");
            System.out.println("Plese Enter a Valid Option");

            int option3 = sc.nextInt();
            sc.nextLine();
            switch (option3) {
                case 301:
                    ClassA aobj101 = new ClassA();
                    System.out.println("Compact");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");
                    int unit = sc.nextInt();
                    aobj101.address();
                    // sc.nextInt();
                    System.out.println("Your unit is:" + unit);

                    aobj101.meth(250);
                    // aobj101.called();

                    break;

                case 302:
                    System.out.println("lipstic ");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");
                    int unit1 = sc.nextInt();

                    System.out.println("Your unit is:" + unit1);
                    ClassA aobj102 = new ClassA();
                    aobj102.called();

                    aobj102.meth(140);

                    break;
                case 303:
                    System.out.println("eyeLiner ");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");

                    int unit2 = sc.nextInt();

                    System.out.println(" unit is:" + unit2);
                    meth(140);

                    break;
                case 304:
                    System.out.println("Kajal ");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");
                    int unit3 = sc.nextInt();

                    System.out.println("Your unit is:" + unit3);
                    meth(50);
                    break;
                case 305:
                    System.out.println("Moisturizer ");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");
                    int unit4 = sc.nextInt();

                    System.out.println("Your unit is:" + unit4);
                    meth(60);

                    break;
                default:
                    break;
            }

        } else if (option == 4) {
            System.out.println(" Masala powder 4");
            System.out.println("-----------------------");
            System.out.println("401) Black peporment");
            System.out.println("402) Thikha lal ");
            System.out.println("403) Mix Masala");
            System.out.println("404) Dhaniya Powder");
            System.out.println("405) Orange");
            System.out.println("-----------------------");
            System.out.println("Plese Enter a Valid Option");

            int option4 = sc.nextInt();
            sc.nextLine();
            switch (option4) {
                case 401:
                    ClassA aobj101 = new ClassA();
                    System.out.println("Black peporment 4");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");
                    int unit = sc.nextInt();
                    aobj101.address();
                    // sc.nextInt();
                    System.out.println("Your unit is:" + unit);

                    aobj101.meth(250);
                    // aobj101.called();

                    break;

                case 402:
                    System.out.println("Thikha lal ");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");
                    int unit1 = sc.nextInt();

                    System.out.println("Your unit is:" + unit1);
                    ClassA aobj102 = new ClassA();
                    aobj102.called();

                    aobj102.meth(140);

                    break;
                case 403:
                    System.out.println("Mix Masala ");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");

                    int unit2 = sc.nextInt();

                    System.out.println(" unit is:" + unit2);
                    meth(140);

                    break;
                case 404:
                    System.out.println("Dhaniya Powder");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");
                    int unit3 = sc.nextInt();

                    System.out.println("Your unit is:" + unit3);
                    meth(50);
                    break;
                case 405:
                    System.out.println("Jira powder ");
                    System.out.println("-----------------------");
                    System.out.println("how much you need?");
                    int unit4 = sc.nextInt();

                    System.out.println("Your unit is:" + unit4);
                    meth(60);

                    break;
                default:
                    break;
            }

        }

        else {
            System.out.println("Please Enter right input ");
        }
    }

    void address() {

        System.out.println("-----------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("Enter your Number:");
        String num = sc.nextLine();
        System.out.println(num);
        System.out.println("-----------------------");

    }

    void bill() {

        System.out.println("=====================");
        new ClassA().address();
    }

    public static void main(String[] args) {

        System.out.println("====Welcome to Orgranic Store====");

        ClassA aobj = new ClassA();
        aobj.meth1();
        Scanner sc = new Scanner(System.in);
        // sc.nextLine();

    }
}
