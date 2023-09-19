import sys
# A program to generate and display a pattern of characters
# in the form of a square matrix, with user-defined size and filler character.

# Prompt the user for the size of the square matrix
n = int(input("Enter the size of the square matrix: "))

# Calculate halfLength and coefficient for matrix construction
halfLength = n // 2
coefficient = 1 if n % 2 == 0 else 0

# Create a 2D character array to store the pattern
arr = [[] for i in range(n)]

# Prompt the user for the filler character
filler = input("\nEnter the filler character: ")

# Check for valid input and generate the pattern
if not filler:
    print("\nFiller character not entered")
    sys.exit(1)
elif len(filler) != 1:
    print("\nToo many filler characters entered")
    sys.exit(1)
else:
    # Generate the pattern and display/write it
    for i in range(n):
        index = -1
        for j in range(n):
            if (j < halfLength - i - coefficient or j > halfLength + i) or \
               (j < i - halfLength or j >= n - i + halfLength):
                arr[i].append(filler)
                print(arr[i][++index], end=" ")
            else:
                print(" ", end=" ")
        print()
