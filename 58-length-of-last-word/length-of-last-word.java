class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
       String res=str[str.length-1];
       res=res.trim();
       return res.length();
    }
}