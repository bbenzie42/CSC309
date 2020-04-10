import sys

def test_tdd():
    assert return_fib(3) == 6
    assert return_fib(1) == 1
    assert return_fib(sys.maxsize) == -1

def return_fib(input):
    if input == 1:
        return 1
    if input > 1000: #limit chosen as python's recrusionary limit
        return -1
    return input + return_fib(input-1)

#test1 - return_fib not defined, built recursive function to solve
#test2 - added 1 as input to return_fib, added base case to function
#test3 - added maxsize as input, edited function to apply empty case