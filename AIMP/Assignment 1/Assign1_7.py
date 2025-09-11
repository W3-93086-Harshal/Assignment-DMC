Num1=int(input("Enter Four Digit Number :"))
digit1 = (Num1)// 1000
print("digit1",digit1)
digit2 = (Num1 % 1000) // 100
print("digit2",digit2)
digit3 = (Num1 % 100) // 10
print("digit3",digit3)
digit4 = (Num1 % 10)
print("digit4",digit4)
Add= digit1 + digit2 + digit3 + digit4
print("Sum of Digits of Given Number is :",Add)