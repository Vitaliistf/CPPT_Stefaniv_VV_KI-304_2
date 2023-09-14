package KI304.Stefaniv.Lab6;

/**
 * A class to demonstrate the use of the Stack class.
 */
public class StackApp {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

        // Pushing elements onto the stack
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        System.out.println("Minimum element: " + integerStack.getMin());

        // Displaying the top element
        System.out.println("Top element: " + integerStack.peek());

        // Popping elements from the stack
        System.out.println("Popped: " + integerStack.pop());
        System.out.println("Popped: " + integerStack.pop());

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + integerStack.isEmpty());

        // Display the size of the stack
        System.out.println("Stack size: " + integerStack.size());



        Stack<String> stringStack = new Stack<>();

        // Pushing elements onto the stack
        stringStack.push("a");
        stringStack.push("b");
        stringStack.push("c");

        // Displaying the top element
        System.out.println("Top element: " + stringStack.peek());

        // Popping elements from the stack
        System.out.println("Popped: " + stringStack.pop());
        System.out.println("Popped: " + stringStack.pop());
        System.out.println("Popped: " + stringStack.pop());

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stringStack.isEmpty());

        // Display the size of the stack
        System.out.println("Stack size: " + stringStack.size());
    }
}
