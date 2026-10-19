import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Test - 41

        Scanner scr = new Scanner(System.in);
        System.out.println("Ədəd daxil edin: ");

        int num = scr.nextInt();


        if (num % 2 == 0) {
            System.out.println(num + " - cüt ədəddir.");
        } else {
            System.out.println(num + " - cüt ədəddir.");
        }

        // Test - 42

        Scanner scr1 = new Scanner(System.in);

        System.out.println("Ədəd daxil edin: ");

        int n = scr1.nextInt();

        int sum = 0;

        for (int i = 1; i<= n; i++) {
            sum = sum + i;
        }

        System.out.println("1-dən " + n + "-ə qədər olan ədədlərin cəmi = " + sum);

        // Test - 43

        int[] arr = {5, 43, 12, 44, 677, 1, 20};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Ən kiçik element: " + min);
        System.out.println("Ən böyük element: " + max);

        // Test - 44

        Scanner scr2 = new Scanner(System.in);

        System.out.println("Ədəd daxil edin: ");
        int num2 = scr2.nextInt();

        if (num2 == 1) {
            System.out.println("1 sadə ədəd deyil.");
        } else {
            for (int i = 2; i < num2; i++) {
                if (num2 % i == 0) {
                    System.out.println(num2 + " sadə ədəd deyil.");
                    return;
                }
            }
            System.out.println(num2 + " sadə ədəddir.");
        }

        // Test 45

        int m = 10;
        System.out.println("Faktorial: " + factorial(m));

        // Test 46

        String word = "hello";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        System.out.println("Tərsinə: " + reversed);


    }
    public static int factorial(int m) {
        int result = 1;
        for (int i = 1; i <= m; i++) {
            result = result * i;
        }
        return result;
    }
}