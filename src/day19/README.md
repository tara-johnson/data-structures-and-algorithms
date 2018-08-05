#Determine if two Binary Trees have indentical structures

## Challenge
Create a method that accepts a reference to a Binary Tree and returns true if the trees have an identical structure. You may assume each Binary Tree only stores integers and is not generic.

Write at least three test assertions for each method that you define.

Example:

Input  
t01 (empty tree)  
t02 (empty tree)  

t1  
```
    8
  /   \
 2     6
```

t2  
```
    8
  /   \
 2     6
```

t3  
```
    8
  /   \
 2     6
      /
     7
```

Output
```
t01.isIdentical(t02) // (empty trees are identical to each other)
t1.isIdentical(t2) // true
t2.isIdentical(t3) // false
```

## Solution
![alt text](assets/is-identical.jpg "is-identical")