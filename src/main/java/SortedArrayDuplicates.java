import java.util.HashSet;
import java.util.Set;

public class SortedArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates(arr);
        System.out.println(result);
    }

    private static int removeDuplicates(int[] arr) {
        Set<Integer> unique = new HashSet<>();
        for (int j : arr) {
            unique.add(j);
        }
        return unique.size();
    }

    static int removeUsingBS(int[] arr){
        return -1;
    }
}
