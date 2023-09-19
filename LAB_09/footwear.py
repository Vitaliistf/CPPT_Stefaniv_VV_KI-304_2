class Footwear:
    # Constructor for the Footwear class
    def __init__(self, brand, model, size, sole, laces, upper):
        # Check if the size is less than or equal to 0 and raise a ValueError if so
        if size <= 0:
            raise ValueError("Size cannot be less than or equal to 0")

        # Initialize instance variables
        self.brand = brand
        self.model = model
        self.size = size
        self.sole = sole
        self.laces = laces
        self.upper = upper
        self.laced = False  # Initialize laced attribute as False

    # Getter method for upper
    def get_upper(self):
        return self.upper

    # Setter method for upper
    def set_upper(self, upper):
        self.upper = upper

    # Getter method for brand
    def get_brand(self):
        return self.brand

    # Setter method for brand
    def set_brand(self, brand):
        self.brand = brand

    # Getter method for model
    def get_model(self):
        return self.model

    # Setter method for model
    def set_model(self, model):
        self.model = model

    # Getter method for size
    def get_size(self):
        return self.size

    # Setter method for size
    def set_size(self, size):
        # Check if the new size is less than or equal to 0, and raise a ValueError if so
        if size <= 0:
            raise ValueError("Size cannot be less than or equal to 0")
        self.size = size

    # Getter method for sole
    def get_sole(self):
        return self.sole

    # Setter method for sole
    def set_sole(self, sole):
        self.sole = sole

    # Getter method for laces
    def get_laces(self):
        return self.laces

    # Setter method for laces
    def set_laces(self, laces):
        self.laces = laces

    # Method to lace up the footwear
    def lace_up(self):
        self.laced = True

    # Method to check if the footwear is laced up
    def is_laced_up(self):
        return self.laced

    # Method to unlace the footwear
    def unlace(self):
        self.laced = False

    # Equality comparison method for Footwear objects
    def __eq__(self, other):
        # Check if the objects are the same instance in memory
        if self is other:
            return True
        # Check if the other object is an instance of the Footwear class
        if not isinstance(other, Footwear):
            return False
        # Compare various attributes for equality
        return (
                self.size == other.size and
                self.brand == other.brand and
                self.model == other.model and
                self.sole == other.sole and
                self.laces == other.laces
        )

    # Hashing method for Footwear objects
    def __hash__(self):
        # Generate a hash based on multiple attributes
        return hash((self.brand, self.model, self.size, self.sole, self.laces))

    # String representation of the Footwear object
    def __str__(self):
        return f"Brand: {self.brand}\n" \
               f"Model: {self.model}\n" \
               f"Size: {self.size}\n" \
               f"Laced: {self.laced}\n" \
               f"Sole: ({self.sole})\n" \
               f"Laces: ({self.laces})\n" \
               f"Upper Material: ({self.upper})"
