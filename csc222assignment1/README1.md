# Java Programming Problems

### Problem Statement
Complete the code present in execute() for the Solution class for the following conditions
- **Input:** Array of integers
    - Ex: `[1, 3, 4, 5]`
- **Output:** Array of string
    - Ex: `["odd", "odd", "even", "odd"]`
- **Process:** Given an array of integer as input, Create an array of strings as output where each integer from input is mapped to a string in the output which indicates if the integer value is true or not, Example working as below
  ```
  Example-1:
    In Input: [1, 3, 4, 5]
    1 -> Odd 
    3 -> Odd
    4 -> even
    5 -> Odd
    Hence Output: ["odd", "odd", "even", "odd"]
  
  Example-2:
    In Input: [19, 12, 241]
    19 -> Odd 
    12 -> even
    241 -> Odd
    Hence Output: ["odd", "even", "odd"]
  ```

---

### Rules to follow:
- The output should be a data structure specifically mentioned in the above question.
- Inbuilt functions which require no import and Datatype methods can be used to solve this problem but No arbitray functions or library can be used.
- No other function name can be defined/declared than the ones asked to be declared in any of the questions presented in this readme.
- The code you write should pass all the test cases given. There will be hidden test cases to check the accuracy of your solution.

### Commands
```shell
# Change directory into the programming problem
cd Java2021AssignmentQuestions/assignment-1/Problem-1/
# Execute the java program
javac Main.java && java Main
```

---

TEST CASES:

```
Input Array: [1, 3, 4, 5]
Ouput Array: [odd, odd, even, odd]

Input Array: [7, 1, 72, 92]
Ouput Array: [odd, odd, even, even]

Input Array: [1, 12, 241, 192]
Ouput Array: [odd, even, odd, even]
```
---

Hint: 
- You can use for() loop and .length to process the array and design the solution for this problem since these are inbuilt methods which do not require any imports.
- You can come up with a solution that does not use this hint but it should satisfy all the TEST CASES.