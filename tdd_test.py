import sys



def return_fib(input):
    if input == 1:
        return 1
    if input > 1000: #limit chosen as python's recrusionary limit
        return -1
    return input + return_fib(input-1)

#test1 - return_fib not defined, built recursive function to solve
#test2 - added 1 as input to return_fib, added base case to function
#test3 - added maxsize as input, edited function to apply empty case

def greet(input):
    returnVal = ""
    endStr = " AND HELLO "
    if input == 0:
        return "Hello, my friend."
    if isinstance(input, str):
        if input.isupper():
            returnVal += "HELLO " + input + "!"
            return returnVal
        returnVal = "Hello, "+ input

    if isinstance(input, list):
        for x in range(0, len(input)-1):
            if ", " in input[x]:
                for c in input[x].split(", "):
                    input.append(c)
            if input[x].isupper():
                endStr += input[x] + "!"
                input.remove(input[x])
        if len(input) == 2:
            returnVal += "Hello, "+input[0] + " and "+ input[1]
        else:
            returnVal += "Hello, "
            for x in range(0, len(input)):
                if x+1 == len(input):
                    returnVal += ", and " + input[x]
                elif isinstance(input[x], str) and not getword(input[x]):
                    if x > 0:
                        returnVal += ", "
                    returnVal += input[x]

    returnVal += "."
    if endStr != " AND HELLO ":
        returnVal += endStr
    return returnVal

def getword(str):
    if str.isupper():
        return True

def test_greet():
    assert greet("Bob") == "Hello, Bob."
    assert greet(0) == "Hello, my friend."
    assert greet("JERRY") == "HELLO JERRY!"
    assert greet(["Jerry", "Bob"]) == "Hello, Jerry and Bob."
    assert greet(["Amy", "Brian", "Charlotte"]) == "Hello, Amy, Brian, and Charlotte."
    assert greet(["Amy", "BRIAN", "Charlotte"]) == "Hello, Amy and Charlotte. AND HELLO BRIAN!"
    assert greet(["Bob", "Charlie, Dianne"]) == "Hello, Bob, Charlie, and Dianne."

