public class SecondLargestOfArray {

    static int secondLargest(int[] arr) {
        int n = arr.length;
        int first, second;
        if (n < 2)
            return -1;
        else {
            first = second = Integer.MIN_VALUE;
            for (int j : arr) {
                if (j > first) {
                    second = first;
                    first = j;
                } else if (j > second && first != j) {
                    second = j;
                }

            }
            if (second == Integer.MIN_VALUE)
                return -1;
            else
                return second;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        //Output: 34

        //  Input: arr[] = [10, 5, 10]
        //  Output: 5
        System.out.println(secondLargest(arr));
    }
}
