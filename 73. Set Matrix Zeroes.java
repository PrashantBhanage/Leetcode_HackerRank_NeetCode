class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        for(int j = 0; j<cols; j++){
            if(matrix[0][j] == 0){
                firstRowHasZero=true;
                break;
            }
        }

        for(int i = 0; i<rows; i++){
            if(matrix[i][0] == 0){
                firstColHasZero = true;
                break;
            }
        }


        for(int i = 1; i<rows; i++){
            for(int j = 1; j<cols; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0]=0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i<rows; i++){
            for(int j = 1; j<cols;j++){
                if(matrix[i][0] == 0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstRowHasZero){
            for(int j = 0; j<cols; j++){
                matrix[0][j]=0;
            }
        }

        if(firstColHasZero){
            for(int i = 0; i<rows; i++){
                matrix[i][0]= 0;
            }
        }
    }
}







Here is the code sliced up into visual functional blocks so you can see exactly who is doing what, without the step-by-step numbers.

---

### Block 1: The Scanner Setup

This block just counts how big the box is and sets up two radar alarms (`firstRowHasZero` and `firstColHasZero`).

```java
int rows = matrix.length;
int cols = matrix[0].length;

boolean firstRowHasZero = false;
boolean firstColHasZero = false;

```

---

### Block 2: The Top Wall Guard

Here, `j` runs sideways along the very top edge (`matrix[0][j]`). If it trips over a `0`, it rings the top wall alarm.

```java
for (int j = 0; j < cols; j++) {
    if (matrix[0][j] == 0) {
        firstRowHasZero = true;
        break;
    }
}

```

---

### Block 3: The Left Wall Guard

Here, `i` runs straight down the very left edge (`matrix[i][0]`). If it trips over a `0`, it rings the left wall alarm.

```java
for (int i = 0; i < rows; i++) {
    if (matrix[i][0] == 0) {
        firstColHasZero = true;
        break;
    }
}

```

---

### Block 4: The Internal Inspector (Flag Setter)

This nested block makes `i` (rows) and `j` (columns) explore **only** the inside grid (notice they start at `1`). If they find a `0` hidden inside, they look at the outside walls and put a `0` mark at the exact start of that row and the exact top of that column.

```java
for (int i = 1; i < rows; i++) {
    for (int j = 1; j < cols; j++) {
        if (matrix[i][j] == 0) {
            matrix[i][0] = 0; // Mark the left wall
            matrix[0][j] = 0; // Mark the top wall
        }
    }
}

```

---

### Block 5: The Executioner (Wiping the Inside Grid)

This block scans the inside grid again. `i` and `j` check the walls. If the left wall marker `matrix[i][0]` is `0` **OR** the top wall marker `matrix[0][j]` is `0`, they execute the current cell and turn it to `0`.

```java
for (int i = 1; i < rows; i++) {
    for (int j = 1; j < cols; j++) {
        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
            matrix[i][j] = 0;
        }
    }
}

```

---

### Block 6: The Top Wall Cleanup

If the alarm from Block 2 went off, `j` runs sideways across the top row one last time and wipes the whole top row to `0`.

```java
if (firstRowHasZero) {
    for (int j = 0; j < cols; j++) {
        matrix[0][j] = 0;
    }
}

```

---

### Block 7: The Left Wall Cleanup

If the alarm from Block 3 went off, `i` runs down the left column one last time and wipes the whole left column to `0`.

```java
if (firstColHasZero) {
    for (int i = 0; i < rows; i++) {
        matrix[i][0] = 0;
    }
}

```
