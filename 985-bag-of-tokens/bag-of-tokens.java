class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0,max=0,n=tokens.length;
        Arrays.sort(tokens);
        int left=0,right=n-1;
        while(left<=right)
        {
            if(power>=tokens[left])
            {
                power-=tokens[left++];
                score++;
            }
            else if(score>=1)
            {
                 power+=tokens[right];
                 score--;
                 right--;
            }
            else
            {
                break;
            }
            max=Math.max(max,score);
        }
        return max;
    }
}