import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class MergeSortStarter {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(IntStream.range(1, 50).boxed().toList());
        Collections.shuffle(integers);
        System.out.println("Не отсортированный список: ");
        System.out.println(integers);
        System.out.println("Отсортированный список: ");
        System.out.println(MergeSortWithGenerics.mergeSort(integers));
    }
}
