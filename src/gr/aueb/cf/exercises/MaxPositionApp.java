package gr.aueb.cf.exercises;

/**
 * Finds the position of the max integer
 * in an array.
 */
public class MaxPositionApp {

    public static void main(String[] args) {

        int[] arr = {1, 5, 8, 4, 9, 3};
        int maxPos;

        maxPos = getMaxPosition(arr, 0, arr.length);
        if (maxPos == -1) {
            System.out.println("There is no such element");
            System.exit(1);
        }
        System.out.println(arr[maxPos]);


    }

    public static int getMaxPosition(int[] arr,int low, int high) {

        int maxPosition = 0;
        int maxValue = 0;

        if ((arr == null) || (arr.length < 1)) {
            return -1;
        }
        if ((low < 0) || (low > high) || (high > arr.length)){
            return -1;
        }

        maxValue = arr[low];
        for (int i = low + 1; i < high; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;

    }
}
