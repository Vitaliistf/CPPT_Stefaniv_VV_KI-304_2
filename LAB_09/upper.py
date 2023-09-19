class Upper:
    def __init__(self, material):
        # Constructor method to initialize the 'material' attribute.
        self.material = material

    def get_material(self):
        # Getter method to retrieve the value of the 'material' attribute.
        return self.material

    def set_material(self, material):
        # Setter method to change the value of the 'material' attribute.
        self.material = material

    def __str__(self):
        # Special method to define the string representation of the object.
        return f"Material: {self.material}"

    def __eq__(self, other):
        # Special method to define the equality comparison for objects.
        if self is other:
            return True  # If the objects are the same instance, they are equal.
        if not isinstance(other, Upper):
            return False  # If 'other' is not an instance of 'Upper', they are not equal.
        return self.material == other.material  # Check if 'material' attributes are equal.

    def __hash__(self):
        # Special method to define the hash value of the object.
        return hash(self.material)
