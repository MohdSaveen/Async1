import java.util.HashMap;

public class DuplicateMatrix {
    public static void main(String[] args) {
        int[][] arr={{11,22,33},{10,11,30},{40,50,11}};
        HashMap<Integer,Integer>map=new HashMap<>();
        int z=0;
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                if (map.containsKey(ints[j])) {
                    z = map.get(ints[j]);
                    map.put(ints[j], z + 1);
                } else {
                    map.put(ints[j], 1);
                }
            }
        }
        if(z>1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
