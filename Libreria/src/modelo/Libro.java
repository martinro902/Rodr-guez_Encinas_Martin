package modelo;

public class Libro {
    private Autor autor;
    private String titulo;
    private int anioPublicacion;
    private int paginas;
    private double precio;

    public Libro(Autor autor, String titulo, int anioPublicacion, int paginas, double precio){
        this.autor=autor;
        this.titulo=titulo;
        this.anioPublicacion=anioPublicacion;
        this.paginas=paginas;
        this.precio=precio;
    }

    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
