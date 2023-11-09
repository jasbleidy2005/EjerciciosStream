package Filter.Ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainPersona {
    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(new Persona("Jan",19,"masculino"),new Persona("Karen",18,"Femenino"),new Persona("Kevin",20,"Masculino"),new Persona("sara",15,"Femenino"));
        List<Persona> mayor18 = personas.stream().filter(mayor -> mayor.getEdad()>=18).collect(Collectors.toList());
        System.out.println("Las personas mayores de 18 años son: " + mayor18 );

    }
}
