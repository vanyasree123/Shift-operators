public class Shiftopr{
    public static void main(String[] args) {
        // Left Shift Operator (<<)
        int num1 = 5; // Binary representation: 101
        int shiftedNum1 = num1 << 1; // Shift left by 1 bit
        System.out.println("Left Shift Operator:");
        System.out.println("Original number: " + num1); // Output: 5
        System.out.println("Shifted number: " + shiftedNum1); // Output: 10
        System.out.println("Binary representation of shifted number: " + Integer.toBinaryString(shiftedNum1)); // Output: 1010

        // Right Shift Operator (>>)
        int num2 = 10; // Binary representation: 1010
        int shiftedNum2 = num2 >> 1; // Shift right by 1 bit
        System.out.println("\nRight Shift Operator:");
        System.out.println("Original number: " + num2); // Output: 10
        System.out.println("Shifted number: " + shiftedNum2); // Output: 5
        System.out.println("Binary representation of shifted number: " + Integer.toBinaryString(shiftedNum2)); // Output: 101
    }
}

