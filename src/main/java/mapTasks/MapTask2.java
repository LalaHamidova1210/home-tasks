package mapTasks;

import java.util.HashMap;
import java.util.Map;

public class MapTask2 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put ("Lala", 29);
        map.put ("Senuber",21);
        map.put ("Vusal", 22);

        String maxKey= null;
        int maxValue=Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        if (maxKey!= null){
            System.out.println("Max value:" + maxValue+ "key:"+ maxKey);
        } else {
            System.out.println("Map is null");
        }
    }
}
