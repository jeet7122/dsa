public class RotatedSortedArr {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int target = 1;
        int pos = searchInRotatedArr(arr, target);
        System.out.println(pos);
    }

    private static int searchInRotatedArr(int[] arr, int target) {
        int pivot = findPivot(arr);
        int firstTry = binarySearch(arr, target, 0, pivot);
        if (firstTry == -1){
            return binarySearch(arr, target, pivot, arr.length - 1);
        }
        return firstTry;

    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
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
            else if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            } else if (arr[mid] < start) {
                end = mid - 1;
            } else if (arr[mid]  < end) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
