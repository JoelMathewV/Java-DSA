
public class Subarrays {
    public static void subar(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int j2 = i; j2 < j; j2++) {
                    System.out.print(arr[j2]+" ");
                }
                System.out.println(" ");
            }
        }
    }

    // find max sum of subarray in the worst way possible (brute force)
    public static void maxsum(int a[]) {
        int n = a.length;
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    cs = cs + a[j2];
                }
                ms = Math.max(cs, ms);
                cs = 0;
            }
        }
        System.out.println(ms);
    }

    //find max sum of subarray in the most optimal way
    public static void kadane(int a[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < a.length; i++) {
            cs = cs + a[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        // subar(a);
        maxsum(a);
        kadane(a);
    }
    
}
