package Catalogo;

public class Book extends Elemento {
	private String genere;
	private String Autore;
	
	public Book(String codiceISBN, String Titolo, int annoPubblicazione, int numeroPagine,String genere, String Autore) {
		super(codiceISBN, Titolo, annoPubblicazione, numeroPagine);
		this.genere=genere;
		this.Autore=Autore;
	}
	public String getgenere() {
		return genere;
	}
	public String getAutore() {
		return Autore;
	}
	@Override
    public String toString() {
        return "Libro:\n" +
                "Codice ISBN: " + getcodiceISBN() + "\n" +
                "Titolo: " + getTitolo() + "\n" +
                "Anno Pubblicazione: " + getannoPubblicazione() + "\n" +
                "Numero di pagine: " + getnumeroPagine() + "\n" +
                "Genere: " + genere + "\n" +
                "Autore: " + Autore + "\n";
    }
}
