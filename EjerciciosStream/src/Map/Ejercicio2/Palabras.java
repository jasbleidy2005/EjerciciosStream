package Map.Ejercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Palabras {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Java","Programacion","Fucional","Stream","Map");
        List<Integer> longitudes = palabras.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Longitudes de las palabras: " + longitudes);
    }
}
