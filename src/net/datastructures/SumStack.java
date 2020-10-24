package net.datastructures;

import java.util.Scanner;

public class SumStack {

    public static void main(String[]args){
        ArrayStack<MyRecursionSnapShot> stack = new ArrayStack<>();
        int n;
        int stage = 0;
        int sum = 0;
        int value;
        MyRecursionSnapShot temp;

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

        while(!stack.isEmpty()){
            temp = stack.pop();
            value = temp.getValue();
            sum += value;
        }

        System.out.println(sum);


    }












}
