package KI304.Stefaniv.Lab2;

import java.util.Objects;

/**
 * The `Laces` class represents shoe laces with properties such as length and color.
 */
public class Laces {
    private int length;
    private String color;

    /**
     * Constructor for initializing a laces object with specified properties.
     *
     * @param length The length of the laces.
     * @param color  The color of the laces.
     * @throws IllegalArgumentException Thrown if the length value is less than or equal to zero.
     */
    public Laces(int length, String color) {
        if(length <= 0) {
            throw new IllegalArgumentException("Laces cannot be less than or equal to 0");
        }
        this.length = length;
        this.color = color;
    }

    /**
     * Method for getting the length of the laces.
     *
     * @return The length of the laces.
     */
    public int getLength() {
        return length;
    }

    /**
     * Method for setting the length of the laces.
     *
     * @param length The new length of the laces.
     * @throws IllegalArgumentException Thrown if the length value is less than or equal to zero.
     */
    public void setLength(int length) {
        if(length <= 0) {
            throw new IllegalArgumentException("Laces cannot be less than or equal to 0");
        }
        this.length = length;
    }

    /**
     * Method for getting the color of the laces.
     *
     * @return The color of the laces.
     */
    public String getColor() {
        return color;
    }

    /**
     * Method for setting the color of the laces.
     *
     * @param color The new color of the laces.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Overridden method for getting the string representation of the laces.
     *
     * @return The string representation of the laces.
     */
    @Override
    public String toString() {
        return "Length: " + length + ", " + "color: " + color;
    }

    /**
     * Overridden method for comparing laces objects.
     *
     * @param o The object to compare the laces with.
     * @return true if the laces are identical to the specified object, otherwise false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laces laces)) return false;
        return length == laces.length && Objects.equals(color, laces.color);
    }

    /**
     * Overridden method for calculating the hash code of the laces.
     *
     * @return The hash code of the laces.
     */
    @Override
    public int hashCode() {
        return Objects.hash(length, color);
    }
}
