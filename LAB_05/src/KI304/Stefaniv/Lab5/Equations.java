package KI304.Stefaniv.Lab5;

import java.io.*;
import java.util.Scanner;

/**
 * The Equations class provides methods for performing mathematical calculations
 * and storing the results in different file formats.
 * This class includes methods for calculating y = tan(x) * (1 / tan(2x)). based on
 * a given input 'x', storing the result in a private field 'result', and saving
 * and loading this result to/from text and binary files.
 * Usage:
 * 1. Create an instance of the Equations class.
 * 2. Use the calculate() method to compute the result for a given 'x' value.
 * 3. Save the result to a text or binary file using the writeResTxt() or
 *    writeResBin() methods, respectively.
 * 4. Load a previously saved result from a text or binary file using the
 *    readResTxt() or readResBin() methods, respectively.
 * 5. Retrieve the computed result using the getResult() method.
 */
public class Equations {

    private double result;

    /**
     * Writes the current 'result' value to a text file.
     *
     * @param fName The name of the text file where the result will be saved.
     * @throws FileNotFoundException If the specified file cannot be found.
     */
    public void writeResTxt(String fName) throws FileNotFoundException {
        try (PrintWriter f = new PrintWriter(fName)) {
            f.printf("%f ", result);
        }
    }

    /**
     * Reads the 'result' value from a text file and sets it as the current result.
     *
     * @param fName The name of the text file from which to read the result.
     */
    public void readResTxt(String fName) throws FileNotFoundException {
        File f = new File(fName);
        if (f.exists()) {
            Scanner s = new Scanner(f);
            result = s.nextDouble();
        } else {
            throw new FileNotFoundException("File " + fName + " not found");
        }
    }

    /**
     * Writes the current 'result' value to a binary file.
     *
     * @param fName The name of the binary file where the result will be saved.
     * @throws IOException If an I/O error occurs while writing to the file.
     */
    public void writeResBin(String fName) throws IOException {
        try (DataOutputStream f = new DataOutputStream(new FileOutputStream(fName))) {
            f.writeDouble(result);
        }
    }

    /**
     * Reads the 'result' value from a binary file and sets it as the current result.
     *
     * @param fName The name of the binary file from which to read the result.
     */
    public void readResBin(String fName) throws IOException {
        File f = new File(fName);
        if (f.exists()) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(f));
            result = dataInputStream.readDouble();
        } else {
            throw new FileNotFoundException("File " + fName + " not found");
        }
    }

    /**
     * Get the current 'result' value.
     *
     * @return The current result value.
     */
    public double getResult() {
        return result;
    }

    /**
     * Calculates the result based on the input 'x' value and stores it in 'result'.
     *
     * @param x The input value for the mathematical calculation.
     * @throws CalcException If an error occurs during the calculation or if 'x' is NaN.
     */
    public void calculate(double x) throws CalcException {
        if (Double.isNaN(x)) {
            throw new CalcException("Invalid input x.");
        }
        double y;
        try {
            y = Math.tan(x) * (1 / Math.tan(2 * x));
        } catch (ArithmeticException e) {
            throw new CalcException(e.getMessage(), e);
        }
        if (Double.isNaN(y)) {
            throw new CalcException("Invalid input x.");
        }
        result = y;
    }
}
