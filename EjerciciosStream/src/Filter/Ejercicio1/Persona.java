package Filter.Ejercicio1;

public class Persona {
        private String nombre;
        private int edad;
        private String genero;

        public Persona(String nombre, int edad, String genero) {
            this.nombre = nombre;
            this.edad = edad;
            this.genero = genero;
        }
        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
        @Override
        public String toString() {
            return "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    ", genero='" + genero + '\'' +
                    '}';
        }
    }

