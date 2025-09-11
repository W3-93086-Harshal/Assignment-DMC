#You have sensor readings (some may be faulty):
# readings = [12, 15, 11, 120, 14, 16, 13, 200, 12, 15]
#Remove the top 2 and bottom 2 values (assume the list is large, and slicing helps).

def reading():
    reading = [12, 15, 11, 120, 14, 16, 13, 200, 12, 15]

    reading.sort()

    print("nums = ",reading.pop(0))
    print("nums = ",reading.pop(1))

    print("nums = ",reading.pop(-2))
    print("nums = ",reading.pop(-1))
    print(" readings =",reading)

reading()