package entidad;

public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(int isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro() {
    }

    public void setDatos(int isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrarDatos() {
        System.out.println(isbn);
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(numeroPaginas);
    }
}
