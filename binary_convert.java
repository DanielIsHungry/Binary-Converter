import java.util.Scanner; // Import Scanner for user inputs.
import java.util.List;      // Import lists and arrays.
import java.util.ArrayList; // Import lists and arrays.
import java.util.Collections; // For reversing the list.

public class binary_convert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Initialize the list.

        System.out.println("Enter an integer from 1 to 255");
        int count = scan.nextInt(); // Scan for user input

        double num = 300 * 1.0;
        System.out.println(num);

        List<Integer> numbers = new ArrayList<>(); // Creates an empty ArrayList of Strings.

        for (int i = 0; i < 8; i++) {

            numbers.add(count % 2);
            System.out.printf("%s / 2 = %s with a remeinder of %s%n", count, count / 2, count % 2); // Shows process to get to binary number.

            count = count / 2;
            if (count == 0) { break; } // Check when to stop

        }

        Collections.reverse(numbers); // Reverse the numbers

        for (int j = 0; j < numbers.size(); j++) {
            System.out.print(numbers.get(j)); // Print the list
        }
    }
}
