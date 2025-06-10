def convert_units(value, from_unit, to_unit):
    # Conversion dictionaries
    length_to_m = {
        "m": 1,
        "km": 1000,
        "cm": 0.01,
        "mm": 0.001,
        "mi": 1609.34,
        "ft": 0.3048,
        "in": 0.0254
    }

    weight_to_kg = {
        "kg": 1,
        "g": 0.001,
        "lb": 0.453592,
        "oz": 0.0283495
    }

    # Handle length conversion
    if from_unit in length_to_m and to_unit in length_to_m:
        value_m = value * length_to_m[from_unit]
        return value_m / length_to_m[to_unit]

    # Handle weight conversion
    if from_unit in weight_to_kg and to_unit in weight_to_kg:
        value_kg = value * weight_to_kg[from_unit]
        return value_kg / weight_to_kg[to_unit]

    # Handle temperature conversion
    if from_unit in ["c", "f", "k"] and to_unit in ["c", "f", "k"]:
        return convert_temperature(value, from_unit, to_unit)

    return None  # Invalid conversion

def convert_temperature(value, from_unit, to_unit):
    # Normalize input
    from_unit = from_unit.lower()
    to_unit = to_unit.lower()

    # Convert to Celsius
    if from_unit == "f":
        value = (value - 32) * 5/9
    elif from_unit == "k":
        value = value - 273.15

    # Convert from Celsius to target unit
    if to_unit == "f":
        return (value * 9/5) + 32
    elif to_unit == "k":
        return value + 273.15
    elif to_unit == "c":
        return value

    return None

# Main program
print("Welcome to the Multi Unit Converter!")
print("\n Supported Units:")
print("Length:m, km, cm, mm, mi, ft, in")
print("Weight: kg, g, lb, oz")
print("Temperature: c, f, k \n")
value = float(input("Enter the value to convert: "))
from_unit = input("Convert from (e.g., m, km, g, lb, c, f, k): ").lower()
to_unit = input("Convert to (e.g., m, km, g, lb, c, f, k): ").lower()

result = convert_units(value, from_unit, to_unit)

if result is not None:
    print(f"{value} {from_unit} = {result:.4f} {to_unit}")
else:
    print("Invalid or unsupported unit conversion.")