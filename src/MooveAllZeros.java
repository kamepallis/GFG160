public class MooveAllZeros {

    public static void main(String[] args) {
        int[] a = {1, 2,0, 4, 0, 5,0};
        int nonZeroindex = 0;
        for (int i =0; i<a.length; i++) {
            if(a[i] != 0) {
                int temp = a[nonZeroindex];
                a[nonZeroindex] = a[i];
                a[i] = temp;
                nonZeroindex++;
            }
        }
        for(int i : a) {
            System.out.println(i);
        }
    }
}
