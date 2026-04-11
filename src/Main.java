import entidad.Circunferencia;
import entidad.Libro;
import entidad.Operacion;
import entidad.Rectangulo;

public class Main {
    public static void main(String[]args) {
        Libro libro1 = new Libro();
        libro1.setDatos(12345, "Las cosas que perdimos en el fuego", "Mariana Enriquez", 120);
        libro1.mostrarDatos();

        Circunferencia circunferencia1 = new Circunferencia(0);
        circunferencia1.crearCircunferencia();
        System.out.println("Área: " + circunferencia1.calcularArea());
        System.out.println("Perímetro: " + circunferencia1.calcularPerimetro());

        Operacion operacion1 = new Operacion();
        operacion1.crearOperacion();
        System.out.println("Suma: " + operacion1.sumar());
        System.out.println("Resta: " + operacion1.restar());
        System.out.println("Division: " + operacion1.dividir());
        System.out.println("Multiplicar: " + operacion1.multiplicar());
        System.out.println(operacion1.getNumero1());

        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.crearRectangulo();
        System.out.println("Superficie: " + rectangulo1.superficie());
        System.out.println("Perimetro: " + rectangulo1.perimetro());
    }
}