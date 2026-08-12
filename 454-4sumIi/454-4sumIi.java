// Last updated: 12/08/2026, 18:30:15
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        // //brute force approach
        // int count=0;
        // for(int i=0;i<nums1.length;i++)
        // {
        //     for(int j=0;j<nums2.length;j++)
        //     {
        //         for(int k=0;k<nums3.length;k++)
        //         {
        //             for(int l=0;l<nums4.length;l++)
        //             {
        //                 if(nums1[i]+nums2[j]+nums3[k]+nums4[l]==0)
        //                 {
        //                     count++;
        //                 }
        //             }
        //         }
        //     }
        // }
        // return count;

        // //Better solution
        // int count=0;
        // for(int i=0;i<nums1.length;i++)
        // {
        //     for(int j=0;j<nums2.length;j++)
        //     {
        //         for(int k=0;k<nums3.length;k++)
        //         {
        //             int rem=nums1[i]+nums2[j]+nums3[k];
        //             for(int l=0;l<nums4.length;l++)
        //             {
        //                 if(rem+nums4[l]==0)count++;
        //             }
        //         }
        //     }
        // }
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                int sum=nums1[i]+nums2[j];
                if(map.containsKey(sum))
                {
                    int freq=map.get(sum);
                    map.put(sum,freq+1);
                }
                else
                {
                    map.put(sum,1);
                }
            }
        }
        for(int i=0;i<nums3.length;i++)
        {
            for(int j=0;j<nums4.length;j++)
            {
                int sum=nums3[i]+nums4[j];
                if(map.containsKey(-sum) )
                {
                    count+=map.get(-sum);
                }
            }
        }
        return count;

    }
}