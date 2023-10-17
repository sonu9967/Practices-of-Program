# def a():
#     try:
#         f(x,4)
#     finally:
#         print('after fff')
#     print('after f?')
    
# a()

# def f(x):
#     for i in range(5):
#         yield i
# g=f(8)
# print(list(g))

# import itertools
# l1=(1,2,3)
# l2=[4,5,6]
# l=itertools.chain(l1,l2)
# print(next(l1))
# g=(i for i in range(5))
# type(g)

# a=2
# type(a)

# try:
#     if '1' != 1:
#         raise "someError"
#     else:
#         print("soemeerror has nit occured")
# except "someError":
#     print("soeError has occured")

# a=False
# while not a:
#     try:
#         f_n=input("enter file name")
#         i_f=open(f_n,'r')
#     except:
#         print("input file not fojund")

# code1
# import math
# num=int(input("enter a value as num: "))
# print(math.factorial(num))

# def getMonth(m):
#     if m<1 or m>12:
#         raise ValueError("invalid")
#     print(m)
# getMonth(6)

valid= False
while not valid:
    try:
        n=int(input("emte a number"))
        while n%2 == 0:
            print("bye")
        valid=True
        
    except ValueError:
        print("invalid")   #for odd nothinh will print tghier and foe even infine time

