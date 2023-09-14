package KI304.Stefaniv.Lab2;

import java.util.Objects;

/**
 * The `Upper` class represents the upper material of footwear with the property - material.
 */
public class Upper {
    private String material;

    /**
     * Constructor for initializing an upper material object with the specified material.
     *
     * @param material The material of the upper material.
     */
    public Upper(String material) {
        this.material = material;
    }

    /**
     * Method for getting the material of the upper material.
     *
     * @return The material of the upper material.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Method for setting the material of the upper material.
     *
     * @param material The new material of the upper material.
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Overridden method for getting the string representation of the upper material.
     *
     * @return The string representation of the upper material.
     */
    @Override
    public String toString() {
        return "Material: " + material;
    }

    /**
     * Overridden method for comparing the upper material of footwear.
     *
     * @param o The object to compare the material with.
     * @return true if the material is identical to the specified object, otherwise false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Upper upper)) return false;
        return Objects.equals(material, upper.material);
    }

    /**
     * Overridden method for calculating the hash code of the upper material.
     *
     * @return The hash code of the upper material.
     */
    @Override
    public int hashCode() {
        return Objects.hash(material);
    }
}
