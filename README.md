INRODUCTION:

NON-DETERMINISTIC SORTING:
Non-deterministic means that an output can not be determined from a given input. 
By definition, sorting means getting a desired output and is therefore deterministic.


The language of non-deterministic algorithms consists of three reserved words: choose, fail, succeed. These are defined as follows:
•	select :- Choose up random elements from the array .
•	fail The current thread fails.
•	succeed The current thread succeeds and terminates. 


IMPLEMENTATION:

Here we take array as input then using random function we pick up elements from it and put it in another array ,
in second array element should not be repeat.after that we check that if array created is sorted or not .
If yes then success() we print the array but if not then failure condition then we have to recall function but this will give error as stack overflow so we just write print statement as failure.


ALGORITHM:




