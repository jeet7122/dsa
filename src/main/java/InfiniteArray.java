public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 15, 18, 25, 25, 35, 45};
        int target = 7;
        int pos = searchPos(nums, target);
        System.out.println(pos);
    }

    static int searchPos(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while (target > nums[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(nums, target, start, end);
    }

    private static int binarySearch(int[] nums, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                end = mid - 1;
            } else if (nums[mid] == target) {
                return mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
