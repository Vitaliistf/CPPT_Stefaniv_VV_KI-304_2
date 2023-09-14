package KI304.Stefaniv.Lab5;

import java.io.IOException;
import java.util.Scanner;

/**
 * The `EquationsApp` class represents an application for calculating equations and saving results in different formats.
 * It utilizes the `Equations` class for equation calculations and exception handling.
 * The application allows the user to input data, calculate the result using the `Equations` class,
 * save the results in both text and binary files, and then read these results from the files.
 * The class contains a `main` method, which serves as the entry point of the program and contains the main logic of the application.
 * The program's logic is as follows:
 * 1. First, an instance of the `Equations` class is created.
 * 2. The user is prompted to enter some data through the console input.
 * 3. The data is passed to the `calculate` method of the `Equations` object, and any `CalcException` that may occur during calculation is caught and its message is displayed.
 * 4. The result of the calculation is displayed to the console.
 * 5. The program then proceeds to save the results in both text and binary files using the `writeResTxt` and `writeResBin` methods.
 * 6. It subsequently reads the saved results from the text and binary files using the `readResBin` and `readResTxt` methods.
 * 7. In case of any `IOException` during file operations, a `RuntimeException` is thrown.
 * 8. Finally, the program displays the result from the `Equations` object to the console twice.
 */
public class EquationsApp {

    public static void main(String[] args) {
        Equations obj = new Equations();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter data: ");
        double data = s.nextDouble();
        try {
            obj.calculate(data);
        } catch (CalcException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Result is: " + obj.getResult());

        try {
            obj.writeResTxt("textRes.txt");
            obj.writeResBin("BinRes.bin");
            obj.readResBin("BinRes.bin");
            obj.readResTxt("textRes.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Result is: " + obj.getResult());
        System.out.println("Result is: " + obj.getResult());
    }
}

