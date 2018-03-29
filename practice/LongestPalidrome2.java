public class Solution {
    public int longestPalindrome(String s) {
        int[] totalLetter = new int[52];
        int oneOddCount = 0; 
        int evenCount = 0; 
        
        for (char ch: s.toCharArray()){
            if(ch >= 97){
                totalLetter[26 + ch - 'a']++;
            }
            else{
                totalLetter[ch - 'A']++;
            }
        }
        
        for (int cnt:totalLetter){
            if(cnt != 0){
                if(cnt % 2 == 0){
                    evenCount += cnt;
                }
                else{
                    if(cnt == 1){
                    oneOddCount ++;
                    }
                    else{
                        evenCount += cnt - 1;
                        oneOddCount ++;
                    }
                }
            }
        }
        
        return oneOddCount == 0 ? evenCount: evenCount + 1; 
    }
}