class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] smap=new char[256];
        char[] tmap=new char[256];
        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(smap[c1]==0 && tmap[c2]==0)
            {
                smap[c1]=c2;
                tmap[c2]=c1;
            }
            else if(smap[c1]!=c2 || tmap[c2]!=c1)
            {
                 return false;
            }
        }
        return true;
    }
}