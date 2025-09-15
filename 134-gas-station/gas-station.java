class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int tank=0;
        int n=gas.length;
        int totGas=0;
        int totCost=0;
        for(int i=0;i<n;i++)
        {
            tank+=gas[i]-cost[i];
            totGas+=gas[i];
            totCost+=cost[i];
            if(tank<0)
            {
                tank=0;
                start=i+1;
            }
        }
        return (totCost>totGas)?-1:start;
    }
}