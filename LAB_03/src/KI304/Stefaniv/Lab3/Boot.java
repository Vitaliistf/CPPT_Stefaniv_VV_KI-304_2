package KI304.Stefaniv.Lab3;

/**
 * The `Boot` class represents boot. It extends the `Footwear` class and implements `Waterproofable` interface.
 */
public class Boot extends Footwear implements Waterproofable {
    private boolean waterproof;

    /**
     * Constructor to initialize a boot object with specified properties.
     *
     * @param brand     The brand of the boot.
     * @param model     The model of the boot.
     * @param size      The size of the boot.
     * @param sole      The type of sole of the boot.
     * @param laces     The type of laces of the boot.
     * @param upper     The upper material of the boot.
     * @param waterproof Whether the boots are waterproof.
     * @throws IllegalArgumentException An exception that is thrown if the size value is less than or equal to zero.
     */
    public Boot(String brand, String model, int size, Sole sole, Laces laces, Upper upper, boolean waterproof) {
        super(brand, model, size, sole, laces, upper);
        this.waterproof = waterproof;
    }

    /**
     * Method to check if the boots are waterproof.
     *
     * @return true if the boots are waterproof; false if the boots are not waterproof.
     */
    @Override
    public boolean isWaterproof() {
        return waterproof;
    }

    /**
     * Method to set the waterproof property of the boots.
     *
     * @param waterproof The new value for waterproof property.
     */
    @Override
    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }
}
