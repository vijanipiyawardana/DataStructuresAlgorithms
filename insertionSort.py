print("insertion sort")

list = []
num = 8

for k in range(num):
    list.append(int(input()))

print("unsorted list :", list)


def insertionSort(A):
    for i in range(1, len(A)):
        current = A[i]
        pos = i
        while current < A[pos - 1] and pos>0:
            A[pos] = A[pos - 1]
            pos = pos - 1
        A[pos] = current
        


insertionSort(list)

print("sorted list :", list)

