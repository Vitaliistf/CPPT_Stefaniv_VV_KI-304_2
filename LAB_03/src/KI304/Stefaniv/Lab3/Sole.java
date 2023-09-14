package KI304.Stefaniv.Lab3;

import java.util.Objects;

/**
 * The `Sole` class represents the sole of footwear with properties such as material and the presence of a tread.
 */
public class Sole {
    private String material;
    private boolean hasTread;

    /**
     * Constructor for initializing a sole object with specified properties.
     *
     * @param material   The material of the sole.
     * @param hasTread   The presence of a tread on the sole.
     */
    public Sole(String material, boolean hasTread) {
        this.material = material;
        this.hasTread = hasTread;
    }

    /**
     * Method for getting the material of the sole.
     *
     * @return The material of the sole.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Method for setting the material of the sole.
     *
     * @param material The new material of the sole.
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Method for checking the presence of a tread on the sole.
     *
     * @return true if the sole has a tread, otherwise false.
     */
    public boolean hasTread() {
        return hasTread;
    }

    /**
     * Method for setting the presence of a tread on the sole.
     *
     * @param hasTread The presence of a tread on the sole.
     */
    public void setTread(boolean hasTread) {
        this.hasTread = hasTread;
    }

    /**
     * Overridden method for getting the string representation of the sole.
     *
     * @return The string representation of the sole.
     */
    @Override
    public String toString() {
        return "Material: " + material + ", " + "has tread: " + hasTread;
    }

    /**
     * Overridden method for comparing sole objects.
     *
     * @param o The object to compare the sole with.
     * @return true if the sole is identical to the specified object, otherwise false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sole sole)) return false;
        return hasTread == sole.hasTread && Objects.equals(material, sole.material);
    }

    /**
     * Overridden method for calculating the hash code of the sole.
     *
     * @return The hash code of the sole.
     */
    @Override
    public int hashCode() {
        return Objects.hash(material, hasTread);
    }
}
