import entidad.Libro;

public class Main {
    public static void main(String[]args) {
        Libro libro1 = new Libro();
        libro1.setDatos(12345, "Las cosas que perdimos en el fuego", "Mariana Enriquez", 120);
        libro1.mostrarDatos();
    }
}