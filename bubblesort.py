print("bubblesort")

list = []
num = 8

for k in range(num):
    list.append(int(input()))

print("unsorted list :", list)


def bubbleSort(A):
    for j in range(len(list)-1, 0, -1):
        for i in range(j):
            if A[i] > A[i+1]:
                A[i], A[i+1] = A[i+1], A[i]


bubbleSort(list)

print("sorted list :", list)


