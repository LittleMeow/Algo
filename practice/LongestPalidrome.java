public class Solution {
    /**
     * @param s: input string
     * @return: the longest palindromic substring
     */
    public String longestPalindrome(String s) {
        // write your code here
        if (s == null || s.length() == 0)
            return s;
        int longest = 0;
        String lp = "";
        for (int i = 0; i < s.length(); i++){
            for(int j = i; j <s.length(); j++){
                if(isPalindrome(s, i, j)){
                    if (longest <= (j - i + 1)){
                       longest = j - i + 1; 
                       lp = s.substring(i, j + 1);
                    }
                // longest = Math.max(longest, j - i + 1);
                }
            }
        }
         return lp;   
    }
    
    public boolean isPalindrome(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    
}