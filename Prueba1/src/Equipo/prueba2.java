package Equipo;

import java.util.ArrayList;
import java.util.List;

public class prueba2 {

    public static void main(String[] args) {
        // Crear una lista de alumnos
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Abde", "Rachedi", 22));
        alumnos.add(new Alumno("Jessi", "Najem", 26));
        // Agregar otros alumnos según sea necesario

        System.out.println("Orden");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    static class Alumno {
        private String nombre;
        private String apellido;
        private int edad;

        public Alumno(String nombre, String apellido, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public int getEdad() {
            return edad;
        }

        @Override
        public String toString() {
            return "Alumno{" +
                    "nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", edad=" + edad +
                    '}';
        }
    }
}