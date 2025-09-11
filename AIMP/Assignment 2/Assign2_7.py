def calculate_grade():
    # Input marks for 3 subjects
    m1 = float(input("Enter marks for Subject 1: "))
    m2 = float(input("Enter marks for Subject 2: "))
    m3 = float(input("Enter marks for Subject 3: "))

    
    average = (m1 + m2 + m3) / 3

   
    if 90 <= average <= 100:
        grade = "A"
    elif 80 <= average < 90:
        grade = "B"
    elif 70 <= average < 80:
        grade = "C"
    elif 60 <= average < 70:
        grade = "D"
    else:
        grade = "F"

    
    print(f"Average Marks = {average:.2f}")
    print(f"Grade = {grade}")

calculate_grade()
