

public class ShortestPath {
    public static float getShortestPath(String s){
        float x=0,y=0;
        for(int i = 0;i<s.length();i++){
            char dir = s.charAt(i);
            //north
            if(dir == 'N'){
                y++;
            }
            //south
            if(dir == 'S'){
                y--;
            }
            //east
            if(dir == 'E'){
                x++;
            }
            //west
            if(dir == 'W'){
                x--;
            }
        }
        //distance calculation
        float result = (float)Math.sqrt((x*x)+(y*y));
        return result;
    }
    public static void main(String[] args) {
        String s = "WNEENESENNN";
        System.out.println(getShortestPath(s));
    }
    
}
