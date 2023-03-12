#To find square root for the positive numbers

num = float(4)
num_sqrt = num**0.5
print ('The square root of %0.3f is %0.3f'%(num,num_sqrt))

#To Find square root for real and complex numbers.
#cmath is used

import cmath
num1 = 1+2j
num1_sqrt = cmath.sqrt(num1)

print('The square root of {0} is {1:0.3f}+{2:0.3f}j'.format(num1,num1_sqrt.real,num1_sqrt.imag))

