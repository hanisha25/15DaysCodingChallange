class Solution {
    public String convertToTitle(int columnNumber) {
        HashMap<Integer,Character> map=new HashMap<>();
        int i=1;
        for(char ch='A';ch<='Z';ch++)
        {
            map.put(i++,ch);
        }
        StringBuilder sb=new StringBuilder("");
        int n=columnNumber;
        while(n>0)
        {
            int temp=n%26;
            if(temp==0) 
            {
                sb.append("Z"); 
                n=n-1;
            }
            else sb.append(map.get(temp));
            n=n/26;
        }
        return sb.reverse().toString();
    }
}