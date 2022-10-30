#function without name are called anonymous function or lambda expression or lambda function.
#we use this for smaller functions i.e. functions with less lines of code or when we are using only once.
#The way we pass values we can also pass function to a function in python as function are objects in python.
f=lambda a:a*a                                                            #function accepting a and returning a*a i.e. square of a number.
result=f(5)
g=lambda a,b:a+b
print(result)
result=g(4,5)
print(result)
