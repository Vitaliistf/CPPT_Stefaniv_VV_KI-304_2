package KI304.Stefaniv.Lab3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * The `Footwear` class represents shoes with various properties such as brand, model, size, sole,
 * laces, upper material, and lace status. It provides methods for getting and setting these properties,
 * lacing and unlacing the footwear, and overridden methods for comparison, hash code, and
 * string representation.
 */
public abstract class Footwear {

    private String brand;
    private String model;
    private int size;
    private Sole sole;
    private Laces laces;
    private Upper upper;
    private boolean laced;

    /**
     * Constructor for initializing a footwear object with specified properties.
     *
     * @param brand  The brand of the footwear.
     * @param model  The model of the footwear.
     * @param size   The size of the footwear.
     * @param sole   The sole of the footwear.
     * @param laces  The laces of the footwear.
     * @param upper  The upper material of the footwear.
     * @throws IllegalArgumentException Thrown if the size value is less than or equal to zero.
     */
    public Footwear(String brand, String model, int size, Sole sole, Laces laces, Upper upper) {
        if(size <= 0) {
            throw new IllegalArgumentException("Size cannot be less than or equal to 0");
        }
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.sole = sole;
        this.laces = laces;
        this.upper = upper;
        this.laced = false;
    }

    /**
     * Constructor for creating a footwear object with default values.
     */
    public Footwear() {
        this.brand = "none";
        this.model = "none";
        this.size = 40;
        this.sole = new Sole("Rubber", true);
        this.laces = new Laces(40, "Black");
        this.upper = new Upper("Leather");
        this.laced = false;
    }

    // Methods for getting and setting properties

    /**
     * Method for getting the upper material of the footwear.
     *
     * @return The upper material of the footwear.
     */
    public Upper getUpper() {
        writeToLogFile("getUpper");
        return upper;
    }

    /**
     * Method for setting the upper material of the footwear.
     *
     * @param upper The new upper material of the footwear.
     */
    public void setUpper(Upper upper) {
        writeToLogFile("setUpper");
        this.upper = upper;
    }

    /**
     * Method for getting the brand of the footwear.
     *
     * @return The brand of the footwear.
     */
    public String getBrand() {
        writeToLogFile("getBrand");
        return brand;
    }

    /**
     * Method for setting the brand of the footwear.
     *
     * @param brand The new brand of the footwear.
     */
    public void setBrand(String brand) {
        writeToLogFile("setBrand");
        this.brand = brand;
    }

    /**
     * Method for getting the model of the footwear.
     *
     * @return The model of the footwear.
     */
    public String getModel() {
        writeToLogFile("getModel");
        return model;
    }

    /**
     * Method for setting the model of the footwear.
     *
     * @param model The new model of the footwear.
     */
    public void setModel(String model) {
        writeToLogFile("setModel");
        this.model = model;
    }

    /**
     * Method for getting the size of the footwear.
     *
     * @return The size of the footwear.
     */
    public int getSize() {
        writeToLogFile("getSize");
        return size;
    }

    /**
     * Method for setting the size of the footwear.
     *
     * @param size The new size of the footwear.
     * @throws IllegalArgumentException Thrown if the size value is less than or equal to zero.
     */
    public void setSize(int size) {
        writeToLogFile("setSize");
        if(size <= 0) {
            throw new IllegalArgumentException("Size cannot be less than or equal to 0");
        }
        this.size = size;
    }

    /**
     * Method for getting the sole of the footwear.
     *
     * @return The sole of the footwear.
     */
    public Sole getSole() {
        writeToLogFile("getSole");
        return sole;
    }

    /**
     * Method for setting the sole of the footwear.
     *
     * @param sole The new sole of the footwear.
     */
    public void setSole(Sole sole) {
        writeToLogFile("setSole");
        this.sole = sole;
    }

    /**
     * Method for getting the laces of the footwear.
     *
     * @return The laces of the footwear.
     */
    public Laces getLaces() {
        writeToLogFile("getLaces");
        return laces;
    }

    /**
     * Method for setting the laces of the footwear.
     *
     * @param laces The new laces of the footwear.
     */
    public void setLaces(Laces laces) {
        writeToLogFile("setLaces");
        this.laces = laces;
    }

    /**
     * Method for lacing up the footwear.
     */
    public void laceUp() {
        writeToLogFile("laceUp");
        laced = true;
    }

    /**
     * Method for getting status of laces.
     *
     * @return Laces status of the footwear.
     */
    public boolean isLacedUp() {
        writeToLogFile("isLaceUp");
        return laced;
    }

    /**
     * Method for unlacing the footwear.
     */
    public void unlace() {
        writeToLogFile("unlace");
        laced = false;
    }

    /**
     * Overridden method for comparing footwear objects.
     *
     * @param o The object to compare the footwear with.
     * @return true if the footwear is identical to the specified object, otherwise false.
     */
    @Override
    public boolean equals(Object o) {
        writeToLogFile("equals");
        if (this == o) return true;
        if (!(o instanceof Footwear footwear)) return false;
        return size == footwear.size &&
                Objects.equals(brand, footwear.brand) &&
                Objects.equals(model, footwear.model) &&
                Objects.equals(sole, footwear.sole) &&
                Objects.equals(laces, footwear.laces);
    }

    /**
     * Overridden method for calculating the hash code of the footwear.
     *
     * @return The hash code of the footwear.
     */
    @Override
    public int hashCode() {
        writeToLogFile("hashCode");
        return Objects.hash(brand, model, size, sole, laces);
    }

    /**
     * Overridden method for getting the string representation of the footwear.
     *
     * @return The string representation of the footwear.
     */
    @Override
    public String toString() {
        writeToLogFile("toString");
        return "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Size: " + size + "\n" +
                "Laced: " + laced + "\n" +
                "Sole: (" + sole + ")" + "\n" +
                "Laces: (" + laces + ")" + "\n" +
                "Upper Material: (" + upper + ")" + "\n";
    }

    /**
     * Private method for writing messages to a log file.
     *
     * @param message The message to write.
     */
    private void writeToLogFile(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String timestamp = now.format(formatter);
            writer.write(timestamp + ": " + message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
