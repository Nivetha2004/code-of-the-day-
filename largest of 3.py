# python program to find the laargest of 3
num1 = float(input("Enter 1st number:"))
num2 = float(input("Enter 2nd number:"))
num3 = float(input("Enter 3rd number:"))
if(num1>=num2)and(num1>=num3):
    largest=num1
elif(num2>=num2)and (num2>=num3):
    largest=num2
else:
    largest=num3

print("The largest number is",largest)