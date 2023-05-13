package Catalogo;

abstract class Elemento{
	private String codiceISBN;
	private String Titolo;
	private int annoPubblicazione;
	private int numeroPagine;
	
	public Elemento( String codiceISBN, String Titolo, int annoPubblicazione, int numeroPagine) {
		this.codiceISBN=codiceISBN;
		this.Titolo=Titolo;
		this.annoPubblicazione=annoPubblicazione;
		this.numeroPagine=numeroPagine;
	}
	public String getcodiceISBN() {
		return codiceISBN;
	}
	public String getTitolo() {
		return Titolo;
	}
	public int getannoPubblicazione() {
		return annoPubblicazione;
	}
	public int getnumeroPagine() {
		return numeroPagine;
	}
	}


