num1 = int(input("enter num1"))
num2 = int(input("enter num2"))
num3 = int(input("enter num3"))
# without using logical operators
if num1 < num2:
    if num1 < num3:
        print("num1 is min number")
        print("num1 =",num1)
    else:
        print("num3 is min number")
        print("num3 =",num3)
elif num2 < num3:
    print("num2 is min number")
    print("num2 =",num2)
else:
    print("num3 is min number")
    print("num3 =",num3) 