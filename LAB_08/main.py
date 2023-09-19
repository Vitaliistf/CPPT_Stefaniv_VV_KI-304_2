import os
import struct
import sys
import math


# Custom exception class for calculator-related errors
class CalcException(Exception):
    pass


# Function to write the result to a text file
def writeResTxt(fName, result):
    with open(fName, 'w') as f:
        f.write(str(result))


# Function to read the result from a text file
def readResTxt(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'r') as f:
                result = f.read()
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result


# Function to write the result to a binary file
def writeResBin(fName, result):
    with open(fName, 'wb') as f:
        f.write(struct.pack('f', result))


# Function to read the result from a binary file
def readResBin(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'rb') as f:
                result = struct.unpack('f', f.read())[0]
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result


# Function to perform a calculation based on input 'x'
def calculate(x):
    if math.isnan(x):
        raise CalcException("Invalid input x.")

    try:
        y = math.tan(x) * (1 / math.tan(2 * x))
    except ZeroDivisionError as e:
        raise CalcException(str(e))

    if math.isnan(y):
        raise CalcException("Result is not a number.")

    return y


# Main program
if __name__ == "__main__":
    data = float(input("Enter data: "))
    result = calculate(data)
    print(f"Result is: {result}")
    try:
        writeResTxt("textRes.txt", result)
        writeResBin("binRes.bin", result)
        print("Result is: {0}".format(readResBin("binRes.bin")))
        print("Result is: {0}".format(readResTxt("textRes.txt")))
    except FileNotFoundError as e:
        print(e)
    sys.exit(1)
