class Sole:
    # Constructor for the Sole class
    def __init__(self, material, has_tread):
        # Initialize instance variables material and has_tread
        self.material = material
        self.has_tread = has_tread

    # Getter method for material
    def get_material(self):
        return self.material

    # Setter method for material
    def set_material(self, material):
        self.material = material

    # Getter method for has_tread
    def has_tread(self):
        return self.has_tread

    # Setter method for has_tread
    def set_tread(self, has_tread):
        self.has_tread = has_tread

    # String representation of the Sole object
    def __str__(self):
        return f"Material: {self.material}, Has Tread: {self.has_tread}"

    # Equality comparison method for Sole objects
    def __eq__(self, other):
        # Check if the objects are the same instance in memory
        if self is other:
            return True
        # Check if the other object is an instance of the Sole class
        if not isinstance(other, Sole):
            return False
        # Compare the material and has_tread attributes for equality
        return self.has_tread == other.has_tread and self.material == other.material

    # Hashing method for Sole objects
    def __hash__(self):
        # Generate a hash based on the material and has_tread attributes
        return hash((self.material, self.has_tread))
