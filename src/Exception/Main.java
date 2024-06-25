package Exception;

import java.util.Scanner;

public class Main {
    public static int index = 0;
    public static int[] ints = new int[10];

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                fillArray();
            }
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
        for (int i : ints)
            System.out.println(i);
    }

    public static int readNumber() throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }

    public static void fillArray() throws NegativeNumberException {
        int number = readNumber();
        ints[index++] = number;
    }
}
