#Circular Reference in Linked List
Identify a circular reference in a linked list.

## Challenge
Write a method for the Linked List class called hasLoop which takes no arguments. Return a boolean that indicates whether or not a circular reference or loop is present in the linked list. Your implementation must not use any additional memory or modify the nodes of the linked list.

Write at least three test assertions for each method that you define.

Example:

Input: ```head -> [1] -> [3] -> [2] -> x```
Output: ```False```

Input: ```head -> [1] -> [7] -> [2] -> [3] -> [5] -> [7] -> [2] -> [3] -> [5] -> [7] -> [2] -> etc``` . 
Output: ```True```

## Solution
![alt text](assets/ll_detect_loop.jpg "ll_detect_loop")
