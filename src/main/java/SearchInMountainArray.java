public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,5,2};
        int target = 2;
        int result = search(arr, target);
        System.out.println(result);
    }

    static int search(int[] arr, int target) {
        int ans;
        int peak = findPeak(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if(firstTry == -1){
            ans = binarySearch(arr, target, peak, arr.length - 1);
        }
        else {
            return firstTry;
        }
        return ans;
    }

    public static int findPeak(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start)/ 2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
    public static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
