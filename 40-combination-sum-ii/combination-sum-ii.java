class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res=new ArrayList<>();
        Arrays.sort(candidates);
        util(candidates,0,0,target,new ArrayList<>());
        return res;
    }
    public void util(int[] candidates,int sum,int idx, int target,ArrayList<Integer> list)
    {
        if(sum==target)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        if(sum>target)
        {
            return;
        }
        for(int i=idx;i<candidates.length;i++)
        {
            if(i>idx && candidates[i]==candidates[i-1])
            {
                continue;
            }
            list.add(candidates[i]);
            util(candidates,sum+candidates[i],i+1,target,list);
            list.remove(list.size()-1);
        }
    }
}