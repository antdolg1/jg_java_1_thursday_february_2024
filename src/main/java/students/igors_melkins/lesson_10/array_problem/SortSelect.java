package students.igors_melkins.lesson_10.array_problem;

import java.util.Arrays;

public class SortSelect {
    public int [] maxProductPair(int[] nums){
        Arrays.sort(nums);

        int lenght = nums.length;
        if(nums[0] * nums[1] > nums[lenght - 1 ]* nums[lenght -2]){
            return new int[]{nums[0],nums[1]};

        } else {
            return new int[] {nums[lenght- 1],nums[ lenght-2]};
        }


    }
}
