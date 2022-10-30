def div(a,b):
    # if a<b:
    #     a,b=b,a                                                                           #simple code to swap two numbers
    print(a/b)
div(4,2)
div(2,4)  
#Suppose we want to have numerator to be bigger than denominator always. 
# #Using decorator wecan swap value without having access to function we can add extra features to function using decorators.
def smart_div(func):                                           #smart_div is a decorator 
    def inner(a,b):                                            #This inner function will take same argument as function to be decorated.We can have any name.
         if a<b:
              a,b=b,a
         return func(a,b)
    return inner    

#We can write function inside a function, that's the beauty of python.
div=smart_div(div)                                              #here we are passing div function. LHS is new function.
#The amazing part of decorators is that we can change the behaviour of a function at compile time itself.
#We are creating a new function which takes function as a parameter then we are defining a function which is actually replacing code of div.
div(2,4)
