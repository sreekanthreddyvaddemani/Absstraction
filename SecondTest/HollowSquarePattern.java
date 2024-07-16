package SecondTest;
public class HollowSquarePattern {
    public static void main(String[] args) {
        int size = 5; // Change this value to adjust the size of the square
        
        // Outer loop for rows
        for (int i = 0; i < size; i++) {
            // Inner loop for columns
            for (int j = 0; j < size; j++) {
                // Print stars only if it's the first or last row, or first or last column
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces for the hollow part
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
