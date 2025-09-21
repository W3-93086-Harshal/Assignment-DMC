import numpy as np

array1 = np.array([0, 10, 20, 40, 60])
array2 = np.array([0, 40])

result = np.in1d(array1, array2)

print("Array1:", array1)
print("Array2:", array2)
print("Result:", result)
