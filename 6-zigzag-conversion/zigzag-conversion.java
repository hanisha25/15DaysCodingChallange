class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder[] arr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
        }
        int i=0;
        while(i<s.length())
        {
            for(int idx=0;idx<numRows && i<s.length();idx++)
            {
                arr[idx].append(s.charAt(i++));
            }
            for(int idx=numRows-2;idx>0 && i<s.length();idx--)
            {
                arr[idx].append(s.charAt(i++));
            }
        }
        StringBuilder sb=new StringBuilder("");
        for(StringBuilder a:arr)
        {
            sb.append(a);
        }
        return sb.toString();
    }
}