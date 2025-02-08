package mapTasks;

import java.util.HashMap;
import java.util.Map;

public class MapTask3 {
    public static void main(String[] args) {
        String word="Lala";
        Map<Character, Integer> letterCountMap=new HashMap<>();

        for ( char character: word.toCharArray()){
            character=Character.toLowerCase(character);
             if ( letterCountMap.containsKey(character)){
                 letterCountMap.put (character, letterCountMap.get(character)+1);
             } else {
                 letterCountMap.put (character,1);
             }
        }
        System.out.println("Letter count:");
        for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
