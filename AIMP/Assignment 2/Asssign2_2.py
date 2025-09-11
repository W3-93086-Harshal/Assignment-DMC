def recursive_power(base, exponent):
    if exponent == 0:
        return 1
    else:
        return base * recursive_power(base, exponent - 1)

base = int(input("Enter the base value :")) 
exponent = int(input("Enter the exponent : "))
result = recursive_power(base, exponent)
print(f"{base} raised to the power of {exponent} is {result}")