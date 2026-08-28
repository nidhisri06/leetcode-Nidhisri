// Last updated: 28/08/2026, 09:46:46
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6        int first = 1;
7        int last = n;
8
9        while (first < last) {
10            int mid = first + (last - first) / 2;
11
12            if (isBadVersion(mid)) {
13                last = mid; // The first bad version could be mid or before.
14            } else {
15                first = mid + 1; // The first bad version must be after mid.
16            }
17        }
18
19        return first; // At the end, first will be the first bad version.
20    }
21}