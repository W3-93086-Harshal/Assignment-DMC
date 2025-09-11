#Define a procedure histogram() that takes a list of integers and prints a histogram to the screen.
#  For example, histogram([4, 9, 7]) should print the following:
#    4: ****
#    9: *********
#    7: *******

def histogram(inputList):
 
    for i in range(len(inputList)):
        print (inputList[i]*'*')
 
 
List = [4,9,7]

histogram(List)