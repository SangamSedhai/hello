import java.util.Scanner;
public class IF_CONDITION {
    public static void main(String[] args) {
        int number = 9;
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        int age = 17;
        if (age >= 18) {
            System.out.println("you can vote");
        } else {
            System.out.println("you can't vote");
        }
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");

        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter a number");
        int num1 = sc1.nextInt();

        if (num1 > 1000) {
            int num2 = num1 / 1000;
            num1 = num1 - (num2 * 500);


            if (num1 > 500) {
                int num3 = num1 / 500;
                num1 = num1 - (num3 * 100);


                if (num1 > 100) {
                    int num4 = num1 / 100;
                    num1 = num1 - (num4 * 10);



                        }
                    }
                }
        System.out.println(num1);

            }

        }


