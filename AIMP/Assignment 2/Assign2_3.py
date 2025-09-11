# Conversion Functions

def km_to_m(km):
    return km * 1000

def m_to_cm(m):
    return m * 100

def cm_to_mm(cm):
    return cm * 10

def feet_to_inches(feet):
    return feet * 12

def inches_to_cm(inches):
    return inches * 2.54

# General Converter Function

def distance_converter(value, conversion_type, conversion_function):
    result = conversion_function(value)
    print(f"{value} {conversion_type.split(' to ')[0]} is equal to {result} {conversion_type.split(' to ')[1]}")

# Main Program

def  conv():
    try:
        value = float(input("Enter a distance value: "))
    except ValueError:
        print("Invalid input. Please enter a numeric value.")
        return
    distance_converter(value, "km to m", km_to_m)
    distance_converter(value, "m to cm", m_to_cm)
    distance_converter(value, "cm to mm", cm_to_mm)
    distance_converter(value, "feet to inches", feet_to_inches)
    distance_converter(value, "inches to cm", inches_to_cm)


conv()
