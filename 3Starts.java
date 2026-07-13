class Patterns {
    // We pass 'n' to decide how big the pattern grid should be (e.g., 5x5)
    public void printSquarePattern(int n) {
        // Outer loop: Controls the ROWS
        for (int i = 0; i < n; i++) {
            
            // Inner loop: Controls the COLUMNS in each row
            for (int j = 0; j < n; j++) {
                System.out.print("* "); // Notice it's .print(), NOT .println(). Keeps stars on the same line!
            }
            
            // Once the inner loop finishes printing a row, move to the next line
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        // 1. Create an instance of the class
        Patterns solution = new Patterns();
        
        // 2. Call the pattern method with a size of 5
        System.out.println("Printing a 5x5 Square Pattern:");
        solution.printSquarePattern(5);
    }
}
