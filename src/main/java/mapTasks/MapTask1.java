package mapTasks;

import java.util.HashMap;
import java.util.Map;

public class MapTask1 {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put ("Lala", 29);
        map.put ("Vusal",22);
        map.put ("Senuber", 21);

        int sum=0;
        for (int value: map.values()){
            sum+=value;
            System.out.println("Sum of values:"+ sum);
        }

    }
}
