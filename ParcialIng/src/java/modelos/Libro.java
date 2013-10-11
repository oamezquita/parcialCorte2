/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author 202
 */
public class Libro {
    private String titulo,autor,fechaPublicacion,descripcion;
    private int referencia,nPaginas;
    private boolean tipoLibro;

    public Libro(String titulo, String autor, String fechaPublicacion, String descripcion, int referencia, int nPaginas, boolean tipoLibro) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.descripcion = descripcion;
        this.referencia = referencia;
        this.nPaginas = nPaginas;
        this.tipoLibro = tipoLibro;
    }

    

    @Override
    public String toString() {
        String tipo="";
        if(this.tipoLibro==true)
        {
        tipo="reservado";
        }
        else{tipo="prestamo";}
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", fechaPublicacion=" + fechaPublicacion + ", descripcion=" + descripcion + ", referencia=" + referencia + ", nPaginas=" + nPaginas + ", tipoLibro=" + tipo + '}';
    }
    

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

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public boolean isTipoLibro() {
        return tipoLibro;
    }

    public void setTipoLibro(boolean tipoLibro) {
        this.tipoLibro = tipoLibro;
    }
    
    
}
