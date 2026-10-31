def mystery2(ls):
    x = ls[0]
    s = 0
    for p in ls:
        if p > x:
            x = p
            s = 0
        s += p
    return s

#Function that adds the sum of all the numbers in a list from the largest number to the end of the list.
def mystery2a(numList):
    init = numList[0]                        #initializes the list in the function and starts from the 0 position.
    output = 0                               #defines the number that the output will reset to once newest large number is found.

    # VV For loop to ensure that only the addition of the largest number and on is output.
    for digit in numList:
        if digit > init:  #Checks for largest number
            init = digit  #creates new starting point to search from
            output = 0    #If new largest number, counter resets
        output += digit   #Adds all new numbers to the output every time the loop iterates.
    return output         #final result
    
#Function that multiplies all the numbers in a list from the smallest number to the end of the list.
def mystery2b(numList):
    init = numList[0]                        #initializes the list in the function and starts from the 0 position.
    output = 1                               #defines the number that the output will reset to once newest large number is found.

    # VV For loop to ensure that only the multiplication of the smallest number and on is output.
    for digit in numList:
        if digit < init:  #Checks for smallest number
            init = digit  #creates new starting point to search from
            output = 1    #If new smallest number, counter resets
        output *= digit   #multiplies all new numbers to the output every time the loop iterates.
    return output         #final result


#function to add all numbers between a defined minimum and maximum
def mystery3(minNum, maxNum, numList):
    output = 0                       #defining an output container to put results into
    minFloat = float(minNum)         #minFloat and maxFloat ensure that not only integers can be processed.
    maxFloat = float(maxNum)

    #VV For loop to check each number in list for size
    for digit in numList:
        tempFloat = float(digit)     # ensures that both float and int inputs can be processed.
        if minFloat < tempFloat < maxFloat:  #if statement designed to weed out any numbers too large or too small
            output += digit          #adds qualified numbers together
    return output                    #final result

print(mystery2a([10,20,30,40,50])) #testing mystery2a
print(mystery2b([10,20,30,40,50])) #testing mystery2b
print(mystery3(15,40,[10,20,33.32,30,40,50])) #testing mystery3
