def convert_temperature(value, scale):
    """
    Convert temperature between Celsius and Fahrenheit.
    
    Parameters:
        value (float): Temperature value to convert
        scale (str): Target scale - 'C' for Celsius, 'F' for Fahrenheit
    
    Returns:
        float: Converted temperature
    """
    if scale.upper() == "F":
        # Celsius to Fahrenheit
        return (value * 1.8) + 32
    elif scale.upper() == "C":
        # Fahrenheit to Celsius
        return (value - 32) / 1.8
    else:
        raise ValueError("Invalid scale. Use 'C' for Celsius or 'F' for Fahrenheit.")


# Example usage
celsius = 25
fahrenheit = convert_temperature(celsius, "F")
print(f"{celsius}°C = {fahrenheit}°F")

fahrenheit_value = 77
celsius_value = convert_temperature(fahrenheit_value, "C")
print(f"{fahrenheit_value}°F = {celsius_value}°C")