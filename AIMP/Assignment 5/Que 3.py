import pandas as pd

empids = [101, 102, 103, 104, 105, 106, 107, 108, 109, 110]
names = ['Alice', 'Bob', 'Charlie', 'David', 'Eva', 'Frank', 'Grace', 'Helen', 'Ivy', 'Jack']
empid_series = pd.Series(empids, name='EmpID')
name_series = pd.Series(names, name='Name')
print("Type of empid_series:", type(empid_series))
print("Type of name_series:", type(name_series))
employee_df = pd.DataFrame({'EmpID': empid_series, 'Name': name_series})
print("All employee records:")
print(employee_df)

employee_df.to_csv('MyRecord.csv', index=False)
print("Records saved to MyRecord.csv")
