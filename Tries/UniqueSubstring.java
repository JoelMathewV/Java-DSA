public class UniqueSubstring {
    static class Node{
        Node[] children = new Node[26];
        boolean eow = false;

        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String s){
        Node curr = root;
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    

    public static int countNode(Node root){
        if (root == null) {
            return 0;    
        }
        
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if(root.children[i] != null){
                count+= countNode(root.children[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String s = "ababa"; //ans 10

        //suffix insert
        for(int i=0; i<s.length(); i++){
            String sub = s.substring(i);
            insert(sub);
        }

        System.out.println(countNode(root));
    }
}