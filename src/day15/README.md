#Eeeney Meeney Minney Moe

## Challenge
Write a function that accepts a list of strings and an int 'n'. Starting at the beginning of the list, count to 'n' and
remove the person at the current index from the list. Keep counting from that index and count up to 'n' over and over
until only one person is left in the list. Return a string with the name of the last person in the list.

Write at least three test assertions for each method that you define.

Example:

```
n = 3

[A, B, C, D, E] // 1A, 2B, 3C
[A, B, _, D, E] // C was removed
[_, B, _, D, E] // A was removed
[_, B, _, D, _] // E was removed
[_, _, _, D, _] // B was removed
                // only D is left

return D
```

## Solution
![alt text](assets/eeney_meeney.jpg "eeney_meeney")