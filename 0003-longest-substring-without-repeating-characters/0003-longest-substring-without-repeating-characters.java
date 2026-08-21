class Solution {
    public int lengthOfLongestSubstring(String s) {
        String current = "";
        int maxLength = 0;
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(current.indexOf(ch) == -1){
                current += ch;
            }else{
                current = current.substring(current.indexOf(ch)+1);
                current +=ch;
            }
            maxLength = Math.max(maxLength,current.length());
        }
        return maxLength;
    }
}