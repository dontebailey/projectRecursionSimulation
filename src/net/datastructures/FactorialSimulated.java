package net.datastructures;

/* Our goal in projectRecursionSimulation is to re-write recursive function
 * using stacks and while loops.
 *
 * The idea is to simulate (think "imitate") the
 * stacked recursive function call in Java.
 *
 * In order to create the user defined stack,
 * we need to first define a class whose object stores the
 * current values of local variables used inside the recursion function.
 *
 * We also need to store the stage of the current recursion
 * if a recursive call can start more than one recursion
 * (multiple recursions). Thus, we would need only one stack to perform
 * even multiple recursions.
 */

import java.util.Scanner;

public class FactorialSimulated {

    /* Create an object containing the current status values
     * of local variables and push it to the stack
     * before executing the deeper recursive function calls.
     */

    public static void main(String[] args) {

        // Declare/initialize some variables.
        ArrayStack<MyRecursionSnapShot> stack = new ArrayStack<>();
        int n;
        int value = 1;
        int product = 1;
        MyRecursionSnapShot temp;
        int stage = 0;

        // Prompt the user for n.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter non-negative integer n: ");
        n = input.nextInt();

        if(n<0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        // Push snapshots into the stack.
        while (n>0){
            stack.push(new MyRecursionSnapShot(n, stage));
            n--;
            stage++;
        }

        // Empty the stack, reading values of snapshots popped
        // and keeping a running product.
        while(!stack.isEmpty()){
            temp = stack.pop();
            value = temp.getValue();
            product *= value;
        }

        System.out.println(product);
    }

}
