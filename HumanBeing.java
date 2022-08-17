package stack;

import java.util.Arrays;
import java.util.Stack;

public class HumanBeing {
    public static void main(String[] args) {
        Stack<String> humanBeing = new Stack<>();
        // add elememts to stack
        humanBeing.push("male");
        humanBeing.push("female");

        System.out.println("Stack:"+ humanBeing);

        //pop method;
        String element = humanBeing.pop();
        System.out.println("remove element:"+ element);

        //peek method
        String item = humanBeing.peek();
        System.out.println("Item at the top:"+ item);

        // search method
        int position = humanBeing.search("female");
        System.out.println("Position of female: "  + position);

        // empty method
        boolean result = humanBeing.empty();
        System.out.println("Is the stack empty? "  + result);

    }
}
