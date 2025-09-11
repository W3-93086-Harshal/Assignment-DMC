length=int(input("Enter length"))
breadth=int(input("Enter breadth"))

def area(length,breadth):
    print("Area = ",length * breadth)

area(length,breadth)

def perimeter(length, breadth):
    print("perimeter = ", (2 * (length + breadth)))

perimeter(length,breadth)