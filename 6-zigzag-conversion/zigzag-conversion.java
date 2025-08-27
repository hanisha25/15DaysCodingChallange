class Solution {
    public String convert(String s, int numRows) {
        String[] arr=new String[numRows];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]="";
        }
        int i=0;
        while(i<s.length())
        {
            for(int idx=0;idx<numRows && i<s.length();idx++)
            {
                arr[idx]+=s.charAt(i++);
            }
            for(int idx=numRows-2;idx>0 && i<s.length();idx--)
            {
                arr[idx]+=s.charAt(i++);
            }
        }
        StringBuilder sb=new StringBuilder("");
        for(String a:arr)
        {
            sb.append(a);
        }
        return sb.toString();
    }
}