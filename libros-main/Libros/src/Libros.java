public class Libros {
    // Definición de atributos
    private String titulo;
    private String autor;
    private String ISBN;
    private double precio;

    // Constructor sin parámetros (valores por defecto)
    public Libros() {
        this.titulo = "Título por defecto";
        this.autor = "Autor por defecto";
        this.ISBN = "000-0000000000";
        this.precio = 0.0;
    }

    // Constructor con parámetros
    public Libros(String titulo, String autor, String ISBN, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
    }

    // Método para obtener los detalles del libro
    public String obtenerDetalles() {
        return "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "ISBN: " + ISBN + "\n" +
                "Precio: $" + precio;
    }

    // Método para actualizar el precio del libro
    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    // Getters y setters (opcional, si se desea acceso controlado a los atributos)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un libro usando el constructor sin parámetros
        Libros libro1 = new Libros();
        System.out.println(libro1.obtenerDetalles());

        // Crear un libro usando el constructor con parámetros
        Libros libro2 = new Libros("Cien Años de Soledad", "Gabriel García Márquez", "978-0060883287", 12.99);
        System.out.println(libro2.obtenerDetalles());
        // Actualizar el precio del libro2
        libro2.actualizarPrecio(14.99);
        System.out.println("Después de actualizar el precio:");
        System.out.println(libro2.obtenerDetalles());
    }
}
