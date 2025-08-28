
//in a given rotated array find out the number of times array is rotated, basically find pivot and return its position
public class CountRotation {
    public static void main(String[] args) {
        int[] arr = {4,4,5,5,6,6,7,0,1,2};
        int rotations = findRotations(arr);
        System.out.println(rotations);
    }

    private static int findRotations(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if ((arr[mid] > arr[mid + 1]) && (mid < end)){
                return mid + 1;
            }
            if(arr[mid] < arr[mid - 1] && (start < mid)){
                return mid;
            }
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start + 1]){
                    return start + 1;
                }
                start++;
                if (arr[end] < arr[end - 1]){
                    return end;
                }
                end--;
            } else if (arr[mid] > arr[start] || arr[mid] == arr[start] && arr[mid] > arr[end]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
