package Map.Ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainNumeros {
    public static void main(String[] args) {
        List<Numeros> numeros = Arrays.asList(new Numeros(1),new Numeros(2),new Numeros(3),new Numeros(4),new Numeros(5),new Numeros(6),new Numeros(7),new Numeros(8),new Numeros(9));
        List<Integer> cuadrado = numeros.stream()
                .map(numero ->{
            int valor = numero.getValor();
            return valor*valor;
                }).collect(Collectors.toList());
        System.out.println("Numeros al cruadado:" + cuadrado);
        //List<Integer> cuadrado = numeros.stream().map(numero->numero*numero).collect(Collectors.toList());
        //System.out.println("Numeros al cruadado: " + cuadrado);
    }
}
