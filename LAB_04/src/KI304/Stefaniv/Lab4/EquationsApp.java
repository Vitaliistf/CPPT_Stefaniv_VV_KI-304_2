package KI304.Stefaniv.Lab4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * The EquationsApp class is a command-line application that allows users to input a value 'x',
 * calculate the result of the equation, and write the result to a file named "result.txt".
 * If any exceptions occur during the calculation or file operations, appropriate error messages are displayed.
 */
public class EquationsApp {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            PrintWriter fout = new PrintWriter("result.txt");
            try {
                try {
                    Equations eq = new Equations();
                    System.out.print("Enter X: ");
                    fout.print(eq.solve(in.nextDouble()));
                } finally {
                    fout.flush();
                    fout.close();
                }
            } catch (CalcException ex) {
                System.out.print(ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            System.out.print("File not found.");
        }
    }
}
