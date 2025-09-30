class Solution {
    public String getHint(String secret, String guess) {
        int n=secret.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int cows=0,bulls=0;
        for(int i=0;i<n;i++)
        {
             char s=secret.charAt(i),g=guess.charAt(i);
             if(s==g)
             {
                bulls++;
             }
             else
             {
                map.put(s,map.getOrDefault(s,0)+1);
             }
        }
        for(int i=0;i<n;i++)
        {
            char s=secret.charAt(i),g=guess.charAt(i);
             if(s==g)
             {
                continue;
             }
            if(map.containsKey(g))
            {
                cows++;
                map.put(g,map.getOrDefault(g,0)-1);
                if(map.get(g)==0) map.remove(g);
            }
        }
        return bulls+"A"+cows+"B";
    }
}