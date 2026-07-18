class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        if (numRows == 1) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(1));
            return result;
        }
        
        // ==========================================
        // BLOCK 2: THE DEEP DIVE (THE RECURSIVE CALL)
        // ==========================================
        List<List<Integer>> prevRows = generate(numRows - 1);
        
        // ==========================================
        // BLOCK 3: BUILD THE DRAFT ROW (ALL ONES)
        // ==========================================
        List<Integer> newRow = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            newRow.add(1);
        }
        
        // ==========================================
        // BLOCK 4: FIX THE MIDDLE NUMBERS
        // ==========================================
        for (int i = 1; i < numRows - 1; i++) {
            int leftAbove = prevRows.get(numRows - 2).get(i - 1);
            int rightAbove = prevRows.get(numRows - 2).get(i);
            newRow.set(i, leftAbove + rightAbove);
        }
        
        // ==========================================
        // BLOCK 5: COMBINE AND RETURN
        // ==========================================
        prevRows.add(newRow);
        return prevRows;
    }
}