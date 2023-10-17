def bubbleSort(array):
  for i in range(len(array)):
    for j in range(0, len(array)-i- 1):
      if array[j] > array[j + 1]:
        temp = array[j]
        array[j] = array[j+1]
        array[j+1] = temp
        
data = [4,2,9,5,1,8,0,2,2]
bubbleSort(data)

print('Sorted Array in Ascending Order:')
print(data)