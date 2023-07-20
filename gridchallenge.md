# Grid challenge

Given a square grid of characters in the range ascii[a-z], rearrange elements of each row alphabetically, ascending. Determine if the columns are also in ascending alphabetical order, top to bottom. Return `YES` if they are or `NO` if they are not.

**Example**

<img width="202" alt="Screenshot 2023-07-20 at 20 40 39" src="https://github.com/LuuNgocLan/hackerrank-resolved/assets/29207172/8c4444fe-afd3-46ef-8785-99cd1548d894">


The grid is illustrated below.

```
a b c
a d e
e f g
```

The rows are already in alphabetical order. The columns `a a e`, `b d f` and `c e g` are also in alphabetical order, so the answer would be `YES`. Only elements within the same row can be rearranged. They cannot be moved to a different row.

**Function Description**

Complete the *gridChallenge* function in the editor below.

gridChallenge has the following parameter(s):

- *string grid[n]:* an array of strings

**Returns**

- *string:* either `YES` or `NO`

**Input Format**

The first line contains , the number of testcases.

Each of the next  sets of lines are described as follows:

- The first line contains , the number of rows and columns in the grid.
- The next  lines contains a string of length

**Constraints**

*Each string consists of lowercase letters in the range ascii[a-z]*

**Output Format**

For each test case, on a separate line print `YES` if it is possible to rearrange the grid alphabetically ascending in both its rows and columns, or `NO` otherwise.

**Sample Input**

```jsx
STDIN   Function
-----   --------
1       t = 1
5       n = 5
ebacd   grid = ['ebacd', 'fghij', 'olmkn', 'trpqs', 'xywuv']
fghij
olmkn
trpqs
xywuv
```

**Sample Output**

```jsx
YES
```

**Explanation**

The x grid in the  test case can be reordered to

```
abcde
fghij
klmno
pqrst
uvwxy

```

This fulfills the condition since the rows 1, 2, ..., 5 and the columns 1, 2, ..., 5 are all alphabetically sorted.

##Test case

Input (stdin)

```jsx
3
3
abc
lmp
qrt
3
mpxz
abcd
wlmf
4
abc
hjk
mpq
rtv
```

Expected Output

```jsx
YES

NO

YES
```
