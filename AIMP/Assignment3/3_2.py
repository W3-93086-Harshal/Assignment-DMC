list11 = []
def substract():
    list1 = [11,22,33,44]
    list2 = [44,55,66,77]
    

    for item in list1:
        if item not in list2:
            list11.append(item)

    # for item in list2:
    #     if item not in list1:
    #         substract.append(item)

substract()
print(list11)