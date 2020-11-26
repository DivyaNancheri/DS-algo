import sys
sys.stdout = open('SI/basic-reverse-array-rec/output.txt', 'w')
sys.stdin = open('SI/basic-reverse-array-rec/input.txt', 'r')

def reverseList(A, start, end):
    if start >= end:
        return
    A[start], A[end] = A[end], A[start]
    reverseList(A, start+1, end-1)
 
n = int(input())
x = [int(i) for i in input().split()]
reverseList(x, 0, n-1)
print(x)

