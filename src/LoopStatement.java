import java.util.Scanner;
public class LoopStatement {
    public static void main(String[] args) {
//        for (int i = 1; i < 101; i++) {
//            System.out.println(i);
//        }
//        for (int i = 2; i < 101; i+=2) {
//            System.out.println(i);
//        }
//        for (int i = 1; i < 101; i+=2) {
//            System.out.println(i);
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//        for (int i = 1; i <= num; i++) {
//            System.out.println("ram");
//        }
//        int i = 1;
//        while(i < 101){
//            System.out.println(i);
//            i++;
//        }
//        int j = 2;
//        while(j < 101){
//            System.out.println(j);
//            j+=2;
//
//        }
//        int k = 1;
//        while(k < 101){
//            System.out.println(k);
//            k+=2;
//
//        }
//        int l = 1;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number");
//        int n = sc.nextInt();
//        while(l<=n){
//            System.out.println("ram");
//            l++;
//        }
        int i;
        for(i = 1; i <= 100; i++){
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");

            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }

        }
    }
}
