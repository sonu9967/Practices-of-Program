# def isPalindrome(string):
#     if (string == string[::-1]) :
#         return "The string is a palindrome."
#     else:
#         return "The string is not a palindrome."
# string = input ("Enter string: ")
# print(isPalindrome(string))

# 2nd Method
str=input("Enter the String : ")
if(len(str)==1 & len(str)==0):
    print("The Given String ",str," is Palindrome")
if(str==str[::-1]):
    print("The Given String ",str," is Palindrome")
else:
    print("The Given String ",str," is not Palindrome")