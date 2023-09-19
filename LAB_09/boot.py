from footwear import Footwear


class Boot(Footwear):
    # Initialize a Boot object with brand, model, size, sole, laces, upper, and waterproof attributes.
    def __init__(self, brand, model, size, sole, laces, upper, waterproof):
        # Call the constructor of the parent class (Footwear) using super() and pass relevant attributes.
        super().__init__(brand, model, size, sole, laces, upper)
        # Set the 'waterproof' attribute of the Boot.
        self.waterproof = waterproof

    # Method to check if the Boot is waterproof.
    def is_waterproof(self):
        return self.waterproof

    # Method to set the 'waterproof' attribute of the Boot.
    def set_waterproof(self, waterproof):
        self.waterproof = waterproof
