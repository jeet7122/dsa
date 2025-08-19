public class CharactersArr {
    public static void main(String[] args) {
        char [] letters = {'a', 'b', 'c', 'e'};
        char target = 'z';

        char ceilChar = ceilingOfChars(letters, target);
        System.out.println(ceilChar);
    }


    private static char ceilingOfChars(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;

        while (left <= right){
            int mid = left + (right - left)/2;

            if (letters[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return letters[left % (letters.length)];
    }

}
