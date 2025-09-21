import pandas as pd

df = pd.read_csv('Salaries.csv')

print("First five records:")
print(df.head(5))

print("First ten records:")
print(df.head(10))

print("Last five records:")
print(df.tail(5))


print("Last ten records:")
print(df.tail(10))
print("Columns in the dataset:")
print(df.columns)

print("Shape of the dataset:")
print(df.shape)

print("Description of the dataset:")
print(df.describe(include='all'))

print("Info about the dataset:")
df.info()

print("Data types of each column:")
print(df.dtypes)

print("Maximum values:")
print(df.max(numeric_only=True))
print("Minimum values:")
print(df.min(numeric_only=True))
print("Mean values:")
print(df.mean(numeric_only=True))
print("Median values:")
print(df.median(numeric_only=True))
print("Standard deviation values:")
print(df.std(numeric_only=True))

for col in df.columns:
    if df[col].isnull().any():
        if df[col].dtype == 'O':
            mode_val = df[col].mode()[0]
            df[col].fillna(mode_val, inplace=True)
        else:
            mean_val = df[col].mean()
            df[col].fillna(mean_val, inplace=True)

print("Null values replaced. Sample data:")
print(df.head())
