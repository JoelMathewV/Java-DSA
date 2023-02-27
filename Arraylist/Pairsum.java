import java.util.*;
public class Pairsum {
    public static boolean pairsum2(ArrayList<Integer> list, int target){
        int n = list.size();
        int bp=-1;              //pivot point
        for (int i=0;i<n;i++){
            if(list.get(i)>list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;

        while (lp != rp){
            int sum = list.get(lp)+list.get(rp);
            if (sum == target){
                return true;
            }
            if(sum < target){
                lp = (lp+1)%n;
            }
            else{
                rp = (rp-1+n)%n;
            }
        }
        return false; 

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairsum2(list,16));
    }
}
