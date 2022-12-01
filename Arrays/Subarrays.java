
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
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        subar(a);
    }
    
}
