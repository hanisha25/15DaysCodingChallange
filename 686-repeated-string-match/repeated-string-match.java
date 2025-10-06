class Solution {
    public int repeatedStringMatch(String a, String b) {
        int n=a.length(),m=b.length();
        int rep=(int)Math.ceil((double)m/n);
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<rep;i++)
        {
           sb.append(a);
        }
        if(sb.toString().contains(b))
        {
            return rep;
        }
        sb.append(a);
        if(sb.toString().contains(b))
        {
            return rep+1;
        }
        return -1;
    }
}