package problems.medium;

public class MergeSortedArray_88 {
    public void merge(int nums1[], int m, int nums2[], int n) {
        int i = m - 1, j = n - 1, lenArr = nums1.length - 1;
        while (i != -1 || j != -1) {
            if (i == -1) nums1[lenArr--] = nums2[j--];
            else if (j == -1) nums1[lenArr--] = nums1[i--];
            else if (nums1[i] > nums2[j]) nums1[lenArr--] = nums1[i--];
            else nums1[lenArr--] = nums2[j--];
        }
    }
}