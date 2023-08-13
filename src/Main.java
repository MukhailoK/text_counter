import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("Tolst"));
        Map<String, Integer> replacesWords = new HashMap<>();
        String[] strings;
        try {
            strings = br.readLine().split("\\s+");
            for (String s : strings) {
               s = s.replaceAll("[^\\p{L}\\p{N}’'-]", "").toLowerCase();
               replacesWords.put(s, replacesWords.getOrDefault(s,0) + 1);
            }
            int total = 0;
            Set<Map.Entry<String, Integer>> entrySet = replacesWords.entrySet();
            for (Map.Entry<String, Integer> entry : entrySet) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
                total += entry.getValue();
            }
            System.out.println("Count of words = " + total);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
