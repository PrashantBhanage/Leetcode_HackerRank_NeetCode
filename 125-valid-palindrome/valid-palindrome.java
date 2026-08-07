class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();

        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                cleaned.append(Character.toLowerCase(ch));
            }
        }
        //reversed
        String reversed = new StringBuilder(cleaned).reverse().toString();

        //compare both strings
        return cleaned.toString().equals(reversed);
    }
}