# create a python program that processes a list action and handles an indexError exception if the index is outisde of bounds

def process_list_action(list_name, index, action):

  try:
    list_element = list_name[index]
    result = action(list_element)
    return result
  except IndexError:
    print("IndexError: list index out of range.")
    return None

list_name = ["a", "b", "c"]

# Get the element at index 1.
result = process_list_action(list_name, 4, lambda x: x.upper())

# Print the result.
if result is not None:
  print(result)
else:
  print("Index out of bounds.")



















  """Processes a list action, handling an `IndexError` exception if the index is out of bounds.

  Args:
    list_name: The name of the list to process.
    index: The index of the element in the list to process.
    action: The action to perform on the element at the given index.

  Returns:
    The result of processing the list action, or `None` if an `IndexError` exception was raised.
  """