import java.util.*;
public class Storewater {
    public static int storewater(ArrayList<Integer> height){

        //brute force - O(n^2)
        int maxarea = 0;
        for (int i = 0;i<height.size()-1;i++){
            for (int j=i+1;j<height.size();j++){
                int minheight = Math.min(height.get(i),height.get(j));
                int area = minheight * (j-i);
                if (area > maxarea){
                    maxarea = area;
                }
            }
        }
        return maxarea;
    }
    public static void main(String[] args) {
        ArrayList<Integer> water = new ArrayList<>();
        water.add(1);
        water.add(8);
        water.add(6);
        water.add(2);
        water.add(5);
        water.add(4);
        water.add(8);
        water.add(3);
        System.out.println(storewater(water));
    }
}
