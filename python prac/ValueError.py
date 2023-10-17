
# Sure, here is a Python program that asks for an integer input from the user and throws a ValueError exception if the input is invalid:
def get_integer_input():
  while True:
    try:
      user_input = input("Enter an integer: ")
      integer_input = int(user_input)
      return integer_input
    except ValueError:
      print("Invalid input. Please enter an integer.")

integer_input = get_integer_input()
print("The integer input is: {}".format(integer_input))
