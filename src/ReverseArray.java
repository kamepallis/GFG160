public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4,5,6};
        int count = a.length/2;
        for(int i=0; i <count ; i++) {
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
         for (int i : a)
             System.out.println(i);
    }
}
