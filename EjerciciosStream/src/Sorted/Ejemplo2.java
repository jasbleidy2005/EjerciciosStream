package Sorted;

import java.util.Arrays;
import java.util.List;

public class Ejemplo2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(142, 535, 345, 228, 495, 867, 259, 1232);

        List<Integer> sortedNumbers = numbers.stream()
                .filter(n -> n > 494)
                .sorted()
                .toList();
        System.out.println("Los numeros elegidos son los siguientes"+ sortedNumbers);
    }
}
