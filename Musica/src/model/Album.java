package model;

public class Album {
	private String id;
	private String titulo;
	private int anoLancamento;
	private Artista artista;
	
	public Album(String id, String titulo, int anoLancamento, Artista artista) {
		
		this.id = id;
		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
		this.artista = artista;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTiutulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", tiutulo=" + titulo + ", anoLancamento=" + anoLancamento + ", artista=" + artista
				+ "]";
	}


	
	
	

}
