package entidad;
import java.util.Scanner;

public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {

        this.radio = radio;
    }

    public double getRadio() {

        return radio;
    }

    public void setRadio(double radio) {

        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio:");
        radio = leer.nextDouble();
    }

    public double calcularArea() {

        return Math.PI * Math.pow(radio,2);
    }

    public double calcularPerimetro() {

        return 2 * Math.PI * radio;
    }
}
