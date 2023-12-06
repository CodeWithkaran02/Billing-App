import java.util.*;

public class ClassA {

    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;

    void meth(int rs) {
        int bill = rs * 100;
        if (bill >= 100) {
            int discount = (bill / 100) * 10;
            System.out.println("your final-bill is :" + (bill - discount));
            System.out.println("conglution your have saved " + discount + " on your final bill");
        } else {
            System.out.println("you final bill is :" + bill);
        }

    }

    void meth1() {

        System.out.println("Friute ");
        System.out.println("Vegetable");
        System.out.println("Cosmetics");
        System.out.println("Masala powder");

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        if (a == 1) {

            int key = 101;

            switch (key) {
                case 101:
                    System.out.println();

                    break;

                case 102:
                    System.out.println();

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

        } else if (b == 2) {

        } else if (c == 3) {

        } else if (d == 4) {

        }

        else {
            System.out.println("Please Enter right input ");
        }
    }

    public static void main(String[] args) {
        System.out.println("====Welcome to Orgranic Store====");

        ClassA aobj = new ClassA();
        aobj.meth1();
        Scanner sc = new Scanner(System.in);
        // sc.nextLine();

    }
}
