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
        String word;
        try {
            strings = br.readLine().split("[ ]|[,]&[ ]|[ - ]");
            System.out.println("Count of words = " + strings.length);
            for (String s : strings) {
                if (!replacesWords.containsKey(s)) {
                    replacesWords.put(s, 1);
                } else replacesWords.put(s, replacesWords.get(s) + 1);
            }
            Set<Map.Entry<String, Integer>> entrySet = replacesWords.entrySet();
            for (Map.Entry<String, Integer> entry : entrySet) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
