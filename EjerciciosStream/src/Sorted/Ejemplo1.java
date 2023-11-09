package Sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ejemplo1 {
    public static void main(String[] args) {
        List<Corredor> lista3 = Arrays.asList(
                new Corredor(11, "Jose", 3, "Crf-250F"),
                new Corredor(511, "Andres", 2, "Crf-250F"),
                new Corredor(65, "Sebastian", 1, "Crf-250F"),
                new Corredor(22, "Luis", 4, "Crf-250F")
        );

        List<Corredor> ePosiciones = lista3.stream()
                .filter(e -> e.getPosicion() >= 1 && e.getMoto().equals("Crf-250F"))
                .sorted(Comparator.comparing(Corredor::getNombre))
                .toList();
        ePosiciones.forEach(p -> System.out.println(p.getNombre() + " " + p.getPosicion()));

    }
}
