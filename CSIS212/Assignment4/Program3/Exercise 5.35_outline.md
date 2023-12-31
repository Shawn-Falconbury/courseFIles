    1. Start by defining a class named Exercise535.

    2. Inside the class, define a method generateQuestion that uses a Random object to generate two positive 1-digit integers. This method should print a question asking the user to multiply these two integers.

    3. In the main method, create a Scanner instance to read the user's input and a Random instance to generate random numbers.

    4. Start a loop that will continue until the program is manually stopped. Within each iteration:

       4a.  Call generateQuestion to pose a multiplication question to the user.

        4b. Read the user's answer.

        4c. If the answer is correct, print a congratulatory message and continue to the next iteration (which will generate a new question due to the loop).

        4d. If the answer is not correct, print a message asking the user to try again and repeat the same question (the loop will not generate a new question because we're still in the same iteration).

