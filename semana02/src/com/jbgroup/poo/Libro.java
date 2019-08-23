package com.jbgroup.poo;

public class Libro {

	private String isbn;
	
	private String titulo;
	
	private String autor;
	
	private int paginas;
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "El libro con ISBN " + isbn + 
			   " creado por el autor \"" + autor + "\"" + 
			   " tiene " + paginas + " páginas.";
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	
}













