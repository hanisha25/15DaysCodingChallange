class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum3(int k, int n) {
         res=new ArrayList<>();
         int arr[]={1,2,3,4,5,6,7,8,9};
        util(arr,0,0,n,new ArrayList<>(),k);
        return res;
    }
    public void util(int[] candidates,int sum,int idx, int target,ArrayList<Integer> list,int k)
    {
        if(sum==target && list.size()==k)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        if(sum>target || list.size() > k)
        {
            return;
        }
        for(int i=idx;i<candidates.length;i++)
        {
            list.add(candidates[i]);
            util(candidates,sum+candidates[i],i+1,target,list,k);
            list.remove(list.size()-1);
        }
    }
}