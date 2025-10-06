class Solution {
    public String countAndSay(int n) {
        String str="1";
        for (int i = 1; i < n; i++) {
            str = count(str);
        }
        return str;
    }
    public String count(String str)
    {
        StringBuilder sb=new StringBuilder();
        Integer freq=1;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i-1)==str.charAt(i))
            {
                freq++;
            }
            else
            {
                sb.append(freq).append(str.charAt(i-1));
                freq=1;
            }
        }
        sb.append(freq).append(str.charAt(str.length() - 1));
        return sb.toString();
    }
}