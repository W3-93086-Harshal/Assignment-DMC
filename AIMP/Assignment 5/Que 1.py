import numpy as np

# Centigrade values
celsius = np.array([-17.78, -11.11, 7.34, 1.11, 37.73, 0.])

# Conversion formula: F = C * 9/5 + 32
fahrenheit = celsius * 9 / 5 + 32

# Print results rounded to 2 decimal places
print("Centigrade:", celsius)
print("Fahrenheit:", np.round(fahrenheit, 2))