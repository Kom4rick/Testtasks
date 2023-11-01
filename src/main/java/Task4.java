package main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Task4 {
    public static void main(String[] args) throws IOException {
        changeArray(args[0]);
    }

    public static void changeArray(String str) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(str));
        ArrayList<Integer> numsList = new ArrayList();
        while (br.ready()) {
            numsList.add(Integer.parseInt(br.readLine()));
        }
        int[] nums = new int[numsList.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsList.get(i);
        }

        int avgElement = 0;
        int[] nums1 = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums1);
        if (nums.length % 2 == 0) {
            avgElement = Math.round((nums1[nums1.length / 2] + nums1[(nums1.length / 2 - 1)]) / 2);
        } else {
            avgElement = Math.round(nums1[(nums1.length - 1) / 2] / 2);
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != avgElement) {
                if (nums[i] < avgElement) {
                    nums[i] += 1;
                    count++;
                } else {
                    nums[i] -= 1;
                    count++;
                }
            }
        }
        br.close();
        System.out.println(count);
    }
}
