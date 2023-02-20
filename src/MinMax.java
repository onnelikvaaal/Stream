import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Метод для Task 1

public class MinMax<T> {
    public void findMinMax(Stream<? extends T> stream,
                           Comparator<? super T> order,
                           BiConsumer<? super T, ? super T> minMaxConsumer) {

        ArrayList<T> sortedElements = stream.sorted(order).collect(Collectors.toCollection(ArrayList::new));
        T min = sortedElements.get(0);
        T max = sortedElements.get(sortedElements.size() - 1);

        minMaxConsumer.accept(min, max);
    }
}
