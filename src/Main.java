import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");// public = access modifiers, static =  keyword, void  = functions return type, main = function name, string datatype.

        int num1 = 78;
        int num2 = 90;
        int sum = num1 + num2;
        System.out.println(sum);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        System.out.println("Enter an integer: ");
        int num_2 = input.nextInt();
        int sum_1 = num + num_2;
        System.out.println(sum_1);


        float radius = 5.5F;
        float Area = (22/7f) * radius * radius;
        System.out.println(Area);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter an radius: ");
        float radius2 = input2.nextFloat();
        float Area2 = (22/7f) * radius2 * radius2;
        System.out.println(Area2);

        int number = 4;
        if (number % 2 == 0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num3 = input3.nextInt();
        if (num3 % 2 == 0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");K
        }

    }
}
