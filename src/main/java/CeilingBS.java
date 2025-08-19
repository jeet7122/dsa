public class CeilingBS {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,7,9,11};
        int target = 4;
        int ceil = ceilingOfNumber(arr, target);
        int floor = floorOfNumber(arr, target);
        System.out.println("Ceil: " + ceil);
        System.out.println("Floor: " + floor);
    }
    static int ceilingOfNumber(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if (arr[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return arr[left];
    }

    static int floorOfNumber(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + (right - left)/2;

            if (arr[mid] < target) left = mid + 1;

            else if (arr[mid] == target) return arr[mid];

            else right = mid - 1;
        }
        return arr[right];
    }
}
