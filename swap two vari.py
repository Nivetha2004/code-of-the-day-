#Python program to swap two variables
#To take inputs from the user
X =input('Enter the value of X:')
Y =input('Enter the value of Y:')

#Create a temporary variable and swap the values
temp =X
X =Y
Y =temp

print('The value of X after swapping:{}'.format(X))
print('The value of Y after swapping:{}'.format(Y))
