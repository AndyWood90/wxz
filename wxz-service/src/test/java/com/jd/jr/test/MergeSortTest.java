package com.jd.jr.test;

/**
 * Created by wuxiaozhou on 2017/10/21.16:55
 */
public class MergeSortTest {
    public static void main(String[] args) {
        int[] data = new int[]{5, 3, 6, 0, 1, 9, 4, 8, 7};
        print(data);
        mergerSort(data);
        print(data);
    }

    private static void mergerSort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    private static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        sort(nums, low, mid);
        sort(nums, mid + 1, high);
        merge(nums, low, mid, high);
        print(nums);
    }

    private static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[nums.length];
        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= high) {
            temp[k++] = nums[j++];
        }
        int k2 = low;
        while (k2 <= high) {
            nums[k2] = temp[k2++];
        }
    }

    private static void print(int[] data) {
        for (int aData : data) {
            System.out.print(aData + "\t");
        }
        System.out.println();
    }
}
