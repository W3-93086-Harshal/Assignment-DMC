class Distance:
    def __init__(self, feet, inches):
        self.feet = feet
        self.inches = inches

def add_distances(d1, d2):
    total_feet = d1.feet + d2.feet
    total_inches = d1.inches + d2.inches
    if total_inches >= 12:
        total_feet += total_inches // 12
        total_inches = total_inches % 12

    return Distance(total_feet, total_inches)
d1 = Distance(3, 5)
d2 = Distance(4, 8)
result = add_distances(d1, d2)
print(f"{result.feet}'{result.inches}\"")