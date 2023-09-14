package KI304.Stefaniv.Lab3;

/**
 * An interface for interacting with waterproof properties.
 */
public interface Waterproofable {
    /**
     * Method to check if the object is waterproof.
     *
     * @return true if the object is waterproof; false if the object is not waterproof.
     */
    boolean isWaterproof();

    /**
     * Method to set the waterproof property of the object.
     *
     * @param waterproof The new value for waterproof property.
     */
    void setWaterproof(boolean waterproof);
}

