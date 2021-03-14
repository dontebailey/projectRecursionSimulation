package net.datastructures;

import java.util.Scanner;

public class FibStack {

    public static void main(String[]args){
        ArrayStack<MyRecursionSnapShot> stack = new ArrayStack<>();
        int n;
        int stage = 0;
        int value = 0;
        int result = 0;
        MyRecursionSnapShot temp1;
        MyRecursionSnapShot temp2;



        // Prompt the user for n.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter non-negative integer n: ");
        n = input.nextInt();

        if(n<0) {
            throw new IllegalArgumentException("n must be non-negative");

        }
        // Push snapshots into the stack, starting from the user's input.
        while (n>0){
            stack.push(new MyRecursionSnapShot(n, stage));
            n--;
            stage++;
        }
        if(n == 0){
            result =0;
        }
        else if(n == 1){
            result = 1;
        }
        else {
            while (!stack.isEmpty()) {
                temp1 = stack.shift();
                value = temp.getValue();
                result *= value;
            }
        }

        System.out.println(result);


    }




}
