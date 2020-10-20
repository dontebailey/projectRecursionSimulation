package net.datastructures;

/* Sample class to store the values of local variables of the myRecursion function.
 * @ author ckn
 *
 * Modified by Laura K. Gross
 * Bridgewater State University
 * October 2020
 */

public class MyRecursionSnapShot {

    /**
     * define all local variables as private members
     */

    private int stage;
    private int value;


    public MyRecursionSnapShot(int value, int stage) {
        this.value = value;
        this.stage = stage;
    }

    /**
     * public get methods to obtain the values of the variable
     */

    public int getValue() {
        return value;
    }

    /**
     * public get methods to obtain the value of the stage
     */

    public int getStage() {
        return stage;
    }

    /**
     * public set methods to assign the values of the variables
     */

    public void setValue(int value) {
        this.value = value;
    }

    /**
     * public set methods to assign the value of the stage
     */

    public void setStage(int stage) {
        this.stage = stage;
    }
}
