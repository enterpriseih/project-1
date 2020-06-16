package com.project.growing.demo.leetcode.perday;

import java.util.Arrays;

/**
 * @author 87799
 * @date 2020/6/14
 * @description: 转变数组后最接近目标值的数组和(枚举)
 * 给你一个整数数组 arr 和一个目标值 target ，请你返回一个整数 value ，使得将数组中所有大于 value 的值变成 value 后，数组的和最接近  target （最接近表示两者之差的绝对值最小）。
 * 如果有多种使得和最接近 target 的方案，请你返回这些整数中的最小值。
 * 请注意，答案不一定是 arr 中的数字。
 * 示例 1：
 * 输入：arr = [4,9,3], target = 10
 * 输出：3
 * 解释：当选择 value 为 3 时，数组会变成 [3, 3, 3]，和为 9 ，这是最接近 target 的方案。
 * 示例 2：
 * 输入：arr = [2,3,5], target = 10
 * 输出：5
 * 示例 3：
 * 输入：arr = [60864,25176,27249,21296,20204], target = 56803
 * 输出：11361
 **/

public class Demo15 {
    public static int findBestValue(int[] arr, int target) {
        // 递增排序
        Arrays.sort(arr);
        int len = arr.length;
        int curSum = 0;
        for (int i = 0; i < len; i++) {
            // 剩余数字平均值
            int curAve = (target - curSum) / (len - i);
            // 当前当前值 >= 平均值 终止查询
            // 再继续 之后数值只会越来越大
            if (curAve <= arr[i]) {
                // 判断小数 取整
                double curAveDou = (target * 1.0 - curSum) / (len - i);
                if (curAveDou - curAve <= 0.5) {
                    return curAve;
                } else {
                    return curAve + 1;
                }
            }
            // 小于 继续查询
            curSum += arr[i];
        }
        return arr[len - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1547,83230,57084,93444,70879};
        int target = 71237;
        int result = findBestValue(arr, target);
        System.out.println(result);
    }
}
