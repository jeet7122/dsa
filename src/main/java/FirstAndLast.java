import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 12;
        int [] range = searchRange(nums, target);
        System.out.println(Arrays.toString(range));
    }

    private static int[] searchRange(int[] nums, int target) {
        int firstOccurrence = Occurrence(nums, target, true);
        int lastOccurrence = Occurrence(nums, target, false);
        return new int[]{firstOccurrence, lastOccurrence};
    }


    static int Occurrence(int[] nums, int target, boolean findStartIndex){
        int occurrence = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
             if (target < mid) {
                right = mid - 1;
            }
            if (target == nums[mid]){
                occurrence = mid;
                if(findStartIndex){
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            else {
                left = mid + 1;
            }
        }
        return occurrence;
    }

}
