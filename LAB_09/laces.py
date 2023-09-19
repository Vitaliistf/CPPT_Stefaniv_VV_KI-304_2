class Laces:
    # Initialize the Laces object with a given length and color.
    def __init__(self, length, color):
        # Check if the length is less than or equal to 0, and raise a ValueError if so.
        if length <= 0:
            raise ValueError("Laces cannot be less than or equal to 0")
        # Set the length and color attributes of the Laces object.
        self.length = length
        self.color = color

    # Getter method to retrieve the length of the laces.
    def get_length(self):
        return self.length

    # Setter method to update the length of the laces, with validation to ensure it's not less than or equal to 0.
    def set_length(self, length):
        if length <= 0:
            raise ValueError("Laces cannot be less than or equal to 0")
        self.length = length

    # Getter method to retrieve the color of the laces.
    def get_color(self):
        return self.color

    # Setter method to update the color of the laces.
    def set_color(self, color):
        self.color = color

    # Custom string representation of the Laces object.
    def __str__(self):
        return f"Length: {self.length}, Color: {self.color}"

    # Custom equality comparison method for Laces objects.
    def __eq__(self, other):
        # Check if the objects are identical in memory.
        if self is other:
            return True
        # Check if the other object is an instance of Laces, and compare length and color attributes.
        if not isinstance(other, Laces):
            return False
        return self.length == other.length and self.color == other.color

    # Custom hash method to allow Laces objects to be used in sets and dictionaries.
    def __hash__(self):
        # Use a tuple of length and color to generate a hash value.
        return hash((self.length, self.color))
