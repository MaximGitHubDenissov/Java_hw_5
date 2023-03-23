package Java_hw_5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp866");
        HashMap<String,LinkedList<String>> pb = new HashMap<>();
        while (true) {
            System.out.println("Телефонный справочник." + 
            "Введите 1 для добавления номера\n"+
            "Введите 2 для вывода всего");
            char input = in.next().charAt(0);
            if(input == '1'){
                System.out.println("Введите фамилию");
                String name = in.next();
                System.out.println("Введите номер телефона");
                String number = in.next();
                if (pb.containsKey(name)){
                    LinkedList<String> ll = pb.get(name);
                    ll.add(number);
                    pb.putIfAbsent(name, ll);
                    
                }
                else{
                    LinkedList<String> ll = new LinkedList<>();
                    ll.add(number);
                    pb.putIfAbsent(name, ll);
                    
                }
                
            }
            if (input == '2'){
                PrintPb(pb);
            }
            
            if(input == '0'){
                System.out.println("Завершение работы программы");
                in.close(); 
                break;
            }
            
        }
    }
    static void PrintPb(Map<String,LinkedList<String>> pb){
        for (Map.Entry<String, LinkedList<String>> item: pb.entrySet()){
                System.out.printf(" Фамилия: %s\n Номера телефона: %s \n",item.getKey(),item.getValue());
    
            }
    }

    
}
