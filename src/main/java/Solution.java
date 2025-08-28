class Solution {
    public static void main(String[] args) {
        int[] arr = {6,7,7,8,8,0,0,1,4,5,6};
        int target = 4;
        int search = search(arr, target);
        System.out.println(search);
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivotInDuplicate(nums);
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0 , pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid] == target) {
                return mid;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int findPivotInDuplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] == arr[mid] && arr[end] == arr[mid]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || arr[mid] == arr[start] && arr[mid] > arr[end]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}