import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

        //Task 1

        public static void main(String[] args) {

            Stream<String> colors = Stream.of("каждый", "охотник", "желает", "знать", "где", "сидит", "fazan");

            Comparator<String> comparator = new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if (o1.length() > o2.length()) {
                        return 1;
                    } else if (o1.length() < o2.length()) {
                        return -1;
                    }
                    return 0;
                }
            };

            BiConsumer<String, String> consumer = new BiConsumer<String, String>() {
                @Override
                public void accept(String s1, String s2) {
                    System.out.println("min: " + s1 + " , max: " + s2);
                }
            };

            MinMax<String> minMax = new MinMax<>();
            minMax.findMinMax(colors, comparator, consumer);


            //Task 2

            List<Integer> someList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            printEvenNumbers(someList);



    }
    //Метод для Task 2

    public static void printEvenNumbers(List<Integer> list) {

        List<Integer> evenNumbersList = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbersList);
        System.out.println("количество чётных чисел: "+ evenNumbersList.size());

    }

}