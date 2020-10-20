package net.datastructures;


import java.util.Scanner;

public class SumSimulated {

        public static int myRecursion(int n) {
            if (n <= 1)
                return n;
            else
                return n + myRecursion(n - 1);
        }

        public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter non-negative integer: ");

                System.out.println(myRecursion(input.nextInt()));
        }



}
