# find factorials from 0 to 10 using a loop

def factorial(n):
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result

for num in range(11):
    print(f"Factorial of {num} is {factorial(num)}")
