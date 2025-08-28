import java.util.Arrays;

public class RolColMAtrix {
    public static void main(String[] args) {
        int [][] arr = {
                {10,20,30,40},
                {15,25,25,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int[] search = search(arr, 50);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(search));
    }

    private static int[] search(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;
        while (r <= arr.length - 1 && c >= 0){
            if (arr[r][c] == target){
                return new int[]{r,c};
            } else if (arr[r][c] < target) {
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
