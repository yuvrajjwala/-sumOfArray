
input_str = input('Enter elements of a list separated by space: ')
print("\n")
list1 = input_str.split()  # to convert the input string to list

print('list: ', list1)

for i in range(len(list1)):  # to convert each element to integer type
    list1[i] = int(list1[i])

sum = 0;

# loop to calculate sum of elements of array
for i in range(0, len(list1)):
    sum = sum + list1[i];

print("Sum of all the elements of an array: " + str(sum));

arr = []
arr = [12, 3, 4, 15]
ans = sum(arr)
  
# display sum
print ('Sum of the array is ',ans)

