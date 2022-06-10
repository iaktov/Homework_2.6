import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        nums.removeIf(i -> i % 2 == 0);
        System.out.println(nums);

        //Задание 2
//        List<Integer> nums = new ArrayList<>(List.of(10, 10, 20, 30, 40, 1, 0, 9));
//        List<Integer>listTemp = new ArrayList<>();
//        nums.removeIf(i -> i % 2 != 0);
//        for (int i = 0; i < nums.size(); i++) {
//            if (!listTemp.contains(nums.get(i))) {
//                listTemp.add(nums.get(i));
//            }
//        }
//        Collections.sort(listTemp);
//        System.out.println(listTemp);

        //Задание 3
//        List<String> word = new ArrayList<>(List.of("Маша", "Медведь", "Маша", "Слон"));
//        HashSet set = new HashSet<>(word);
//        System.out.println(set);

        //Задание 4
        List<String> words = new ArrayList<>(List.of("Маша", "Медведь", "Маша", "Слон", "Медведь", "Маша"));
        int duplicate;
        for (int i = 0; i < words.size(); i++) {
            duplicate = Collections.frequency(words, words.get(i));
            if (duplicate > 1) {
                System.out.println(words.get(i) + " повторяется " + duplicate + " раз.");
            }
        }
    }
}



