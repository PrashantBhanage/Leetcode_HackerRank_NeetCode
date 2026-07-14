class Solution {
    public int reverse(int x) {
        int reversed=0;

        while(x != 0){
            //1. Pop the last digit off x
            int pop = x % 10;
            x /= 10;

            //2.Check for postv overflow before multiplying
            //Integer.MAX_VALUE / 10 is 214748364
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            // 3. Check for Negative Underflow before multiplying
            // Integer.MIN_VALUE / 10 is -214748364
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            //4. Safe to multiply and add the digit
            reversed = (reversed * 10)+pop;
        }
        return reversed;
    }
}
