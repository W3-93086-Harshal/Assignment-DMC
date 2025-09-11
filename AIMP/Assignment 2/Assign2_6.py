def check_leap_year():
    
    year = int(input("Enter a year: "))

    # Leap year conditions
    if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
        print(f"{year} is a Leap Year")
    else:
        print(f"{year} is NOT a Leap Year")

check_leap_year()
