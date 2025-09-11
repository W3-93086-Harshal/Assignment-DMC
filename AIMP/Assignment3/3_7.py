#Write a Python program to calculate the average value of the numbers in a given tuple of tuples.
# - Input: ((10, 10, 10, 12), (30, 45, 56, 45), (81, 80, 39, 32), (1, 2, 3, 4))
# - Output: [30.5, 34.25, 27.0, 23.25]

input = ((10, 10, 10, 12), (30, 45, 56, 45), (81, 80, 39, 32), (1, 2, 3, 4))
Output = []

for i in input:
    sum=0
    for item in i:
        sum = sum + item
    average = sum/len(i)
    Output.append(average)


print(Output)