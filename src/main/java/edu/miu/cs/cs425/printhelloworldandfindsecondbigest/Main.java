package edu.miu.cs.cs425.printhelloworldandfindsecondbigest;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {5, 7, 10, 14, 35, 40, 49, 70};
        printHelloWorld(numbers);

        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println("Second biggest number: " + findSecondBiggest(nums1));

        int[] nums2 = {19, 9, 11, 0, 12};
        System.out.println("Second biggest number: " + findSecondBiggest(nums2));
    }

    public static void printHelloWorld(int[] numbers) {
        for (int num : numbers) {
            if (num % 5 == 0 && num % 7 == 0) {
                System.out.println("HelloWorld");
            } else if (num % 5 == 0) {
                System.out.println("Hello");
            } else if (num % 7 == 0) {
                System.out.println("World");
            }
        }
    }

    public static int findSecondBiggest(int[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("Array must have at least two numbers.");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        return secondMax;
    }


}
