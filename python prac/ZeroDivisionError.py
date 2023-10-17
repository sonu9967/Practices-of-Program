def divnum(a,b):
    try:
        res=a/b
        print("Output:",res)
    except ZeroDivisionError:
        print("Zero Exceptions Error")
a=int(input("Enter A Value: "))
b=int(input("Enter B Value: "))
divnum(a,b)