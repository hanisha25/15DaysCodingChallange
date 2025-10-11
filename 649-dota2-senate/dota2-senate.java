class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> qD=new LinkedList<>();
        Queue<Integer> qR=new LinkedList<>();
        int n=senate.length();
        for(int i=0;i<senate.length();i++)
        {
            if(senate.charAt(i)=='D')
            {
                qD.add(i);
            }
            else
            {
                qR.add(i);
            }
        }
        while(!qD.isEmpty() && !qR.isEmpty())
        {
            int d=qD.remove(),r=qR.remove();
            if(d<r)
            {
                qD.add(d+n);
            }
            else
            {
                qR.add(r+n);
            }
        }
        return qD.isEmpty()?"Radiant":"Dire";
    }
}