print("Enter a number")
x=int(input())
for i in range(2,x):
    if(x%i==0):
        print("number is not prime")
        break
else:
    print("number is prime")    
#this program clearly indicates the use of for else loop in python  