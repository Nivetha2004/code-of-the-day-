#Python program to display all prime numbers in an interval
low = 2
upper = 11
print("Prime numbers btw",low,"and",upper,"are:")
for num1 in range(low,upper+1):
    #all prime numbers must be greater than 1
    if num1>1:
       for i in range(2,num1):
         if(num1%i)==0:
             break
         else:
           print(num1)
