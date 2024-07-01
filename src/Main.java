import java.util.*;

public class Main {
    public static void main(String[] args) {
        //task 1
        {
            List<Integer> nums = List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7);
            for (Integer num : nums)
                if (num % 2 == 1) {
                    System.out.println(num);
                }
        }
        //task 2
        {
            List<Integer> nums = List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7);
            Set<Integer> set = new TreeSet<>(nums);
            for (Integer i : set) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
        //task 3
        {
            var words = List.of("yaz", "uaz", "gaz", "taz", "yaz", "uaz");
            var set = new HashSet<>(words);
            for (String s : set)
                System.out.println(s);

        }
        //task 4
        {
            List<String> strings = List.of("один", "два", "два", "три", "три", "три");
            Map<String, Integer> map = new HashMap<>();
            for (String word : strings) {
                var num = map.get(word);
                if (num == null) {
                    map.put(word, 1);
                } else {
                    map.put(word, num + 1);
                }
                for (Map.Entry<String,Integer>pair: map.entrySet()){
                    System.out.println(pair.getKey()+" "+pair.getValue());}
                for (Integer value: map.values()){
                    System.out.println(value);}
            }
        }


    }
}