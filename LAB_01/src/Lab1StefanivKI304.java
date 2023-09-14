import java.io.*;
import java.util.*;

/**
 * Lab1StefanivKI304 - A program to generate and display a pattern of characters
 * in the form of a square matrix, with user-defined size and filler character.
 * The resulting pattern is written to a text file named "MyFile.txt".
 *
 * This program prompts the user for the size of the square matrix, a filler character,
 * and generates a pattern with the specified size using the given filler character.
 * It then displays the pattern in the console and writes it to a text file.
 */
public class Lab1StefanivKI304 {
    public static void main(String[] args) throws FileNotFoundException {
        // Initialize scanner for user input and PrintWriter for file output
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        // Prompt the user for the size of the square matrix
        System.out.print("Enter the size of the square matrix: ");
        int n = in.nextInt();
        in.nextLine();

        // Calculate halfLength and coefficient for matrix construction
        int halfLength = n / 2;
        int coefficient = (n % 2 == 0) ? 1 : 0;

        // Create a 2D character array to store the pattern
        char[][] arr = new char[n][];

        // Initialize rows in the matrix
        for (int i = 0; i <= halfLength; i++) {
            int length = n - (2 * i) - 1 + coefficient;
            arr[i] = new char[length];
            arr[n - i - 1] = new char[length];
        }

        // Prompt the user for the filler character
        System.out.print("\nEnter the filler character: ");
        String filler = in.nextLine();

        // Check for valid input and generate the pattern
        if (filler.isEmpty()) {
            System.out.print("\nFiller character not entered");
        } else if (filler.length() != 1) {
            System.out.print("\nToo many filler characters entered");
        } else {
            // Generate the pattern and display/write it
            for (int i = 0; i < n; i++) {
                for (int j = 0, index = 0; j < n; j++) {
                    if ((j < halfLength - i - coefficient || j > halfLength + i) ||
                            (j < i - halfLength || j >= n - i + halfLength)) {
                        arr[i][index] = filler.charAt(0);
                        System.out.print(arr[i][index] + " ");
                        fout.print(arr[i][index++] + " ");
                    } else {
                        System.out.print("  ");
                        fout.print("  ");
                    }
                }
                System.out.print("\n");
                fout.print("\n");
            }
        }

        // Flush and close the output file
        fout.flush();
        fout.close();
    }
}
