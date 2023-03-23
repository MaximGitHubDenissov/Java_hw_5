package Java_hw_5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<String> sp = new ArrayList<>();
        sp.add("Иван");
        sp.add("Иванов");
        sp.add("Светлана");
        sp.add("Петрова");
        sp.add("Кристина");
        sp.add("Белова");
        sp.add("Анна");
        sp.add("Мусина");
        sp.add("Анна");
        sp.add("Крутова");
        sp.add("Иван");
        sp.add("Юрин");
        sp.add("Петр");
        sp.add("Лыков");
        sp.add("Павел");
        sp.add("Чернов");
        sp.add("Петр");
        sp.add("Чернышев");
        sp.add("Мария");
        sp.add("Федорова");
        sp.add("Марина");
        sp.add("Светлова");
        sp.add("Мария");
        sp.add("Савина");
        sp.add("Мария");
        sp.add("Рыкова");
        sp.add("Марина");
        sp.add("Лугова");
        sp.add("Анна");
        sp.add("Владимирова");
        sp.add("Иван");
        sp.add("Мечников");
        sp.add("Петр");
        sp.add("Петин");
        sp.add("Иван");
        sp.add("Ежов");
        HashMap<String,Integer> res = new HashMap<>();
        int counter = 1;        
        for (int i = 0; i <= sp.size()-4; i+=2) {
            counter = 1;
            for (int j = i+2; j <= sp.size()-2; j+=2) {
                if (sp.get(i).equals(sp.get(j))){
                    counter+=1;
                }
                
            }
            if(!res.containsKey(sp.get(i))){
                    res.put(sp.get(i),counter);
                }
        }
        
        Map<String,Integer> sortedMap = res.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1,LinkedHashMap:: new));
        for (Map.Entry<String,Integer> item: sortedMap.entrySet()){
            System.out.printf("Имя: %s\n", item.getKey());
            System.out.printf("Количество: %s\n", item.getValue());
        }
    }
}
