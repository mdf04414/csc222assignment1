# Java Programming Problems

### Problem Statement
Complete the code present in execute() for the Solution class for the following conditions
- **Input:** An Array of Array of integers
    - Ex: `[[1, 4], [5, 3]]`
- **Output:** An Array of Array of integers
    - Ex: `[[4, 3],[1, 5]]`
- **Process:** Given an array of, two array of integer as input where the min length of each array is 1, Create an array of, two array of integer as output where each array in the output array is a pair from of elements from input and output integer arrays which is also sorted using the second element of each pair, any pairs that cannot be formed due to length not being the same will be left out.
  ```
  Example - 1:
    In Input: [[1, 4], [5, 3]]
    [1, 5] -> first element pair from the arrays 
    [4, 3] -> second element pair from the arrays 
    Now we have to arrange these arrays ascendingly according to the second element of the arrays
    Since in [1, 5] and [4, 3]. 3 < 5 -> [[4, 3],[1, 5]] should be the order
    Hence Output: [[4, 3],[1, 5]]
  
  Example - 2:
    In Input: [[19], [12, 241]]
    [19, 12] -> first element pair from the arrays 
    241 -> second element has no pair and will be left out
    Now we have to arrange these arrays ascendingly according to the second element of the arrays
    Since there is only one pair [19, 12] -> [[19, 12]] should be the order
    Hence Output: [[19, 12]]
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
cd Java2021AssignmentQuestions/assignment-1/Problem-2/
# Execute the java program
javac Main.java && java Main
```

---

TEST CASES:

```
Input Array: [[1, 3], [4, 5]]
Ouput Array: [[1, 4], [3, 5]]

Input Array: [[1, 7, 72, 92], [24, 66]]
Ouput Array: [[1, 24], [7, 66]]

Input Array: [[19], [12, 241]]
Ouput Array: [[19, 12]]
```
---

Hint: 
- You can use for() loop and .length to process the array and design the solution for this problem since these are inbuilt methods which do not require any imports.
- You can come up with a solution that does not use this hint but it should satisfy all the TEST CASES.