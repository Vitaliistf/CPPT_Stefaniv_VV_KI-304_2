from boot import Boot

if __name__ == "__main__":
    # Create an instance of the Boot class with specified attributes
    boot = Boot(brand="Example Brand", model="Example Model", size=42, sole="Rubber", laces=True, upper="Leather", waterproof=True)

    # Display information about the boots
    print("Boot Information:")
    print(boot)

    # Check if the boots are waterproof and print the result
    if boot.is_waterproof():
        print("These boots are waterproof.")
    else:
        print("These boots are not waterproof.")

    # Change the brand of the boots and check the updated brand
    boot.set_brand("New Brand")
    print(f"Updated Brand: {boot.get_brand()}")

    # Unlace the boots and check their lacing status
    boot.unlace()
    if not boot.is_laced_up():
        print("The boots are not laced up.")

    # Lace up the boots again and check their lacing status
    boot.lace_up()
    if boot.is_laced_up():
        print("The boots are laced up.")

    # Attempt to set an invalid size and handle the error
    try:
        boot.set_size(-5)
    except ValueError as e:
        print(f"Error: {e}")

    # Check information about the upper material of the boots
    print(f"Upper Material: {boot.get_upper()}")

    # Check information about the sole material of the boots
    print(f"Sole Material: {boot.get_sole()}")