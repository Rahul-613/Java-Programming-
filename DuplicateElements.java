import java.util.HashMap;
import java.util.Map;
public class DuplicateElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 4, 7, 8, 7, 9, 9};
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        
        System.out.println("Duplicate elements and their frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
            }
        }
    }
}