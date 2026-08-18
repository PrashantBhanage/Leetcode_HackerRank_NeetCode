class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] abc = new int[26];

        for(int i= 0; i<s.length(); i++){
            abc[s.charAt(i) - 'a']++;
            abc[t.charAt(i) - 'a']--;
        } 

        for(int b : abc){
            if(b != 0){
                return false;
            }
        }
        return true;
    }
}