public class Solution {
    public int isPalindrome(String str) {
        str=str.toLowerCase();
        str = str.replaceAll("[^A-Za-z0-9]", ""); 
        int i = 0, j = str.length() - 1; 
  
        while (i < j) { 
  
            if (str.charAt(i) != str.charAt(j)) 
                return 0; 
  
            i++; 
            j--; 
        } 
  
        return 1;
    }
}
