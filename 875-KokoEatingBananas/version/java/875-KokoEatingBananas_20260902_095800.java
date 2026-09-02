// Last updated: 02/09/2026, 09:58:00
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int mid,m1,m2;
4        int l=0,r=nums.length-1;
5        while(l!=r)
6        {
7            mid=(l+r)/2;
8            if(nums[mid]==nums[mid-1])
9            {
10                m1=(mid-1)-l;
11                m2=r-mid;
12                if(m1%2!=0)
13                {
14                    r=mid-2;
15                }
16                else if(m2%2!=0)
17                {
18                    l=mid+1;
19                }
20            }
21            else if(nums[mid]==nums[mid+1])
22            {
23                m1=mid-l;
24                m2=r-(mid+1);
25                if(m2%2!=0)
26                {
27                    l=mid+2;
28                }
29                else if(m1%2!=0)
30                {
31                    r=mid-1;
32                }
33            }
34            else return nums[mid];
35        }
36        return nums[l];
37    }
38}