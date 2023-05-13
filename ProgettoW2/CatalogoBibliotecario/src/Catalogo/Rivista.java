package Catalogo;

public class Rivista extends Elemento {
	  private Periodicita periodicita;

	    public Rivista(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
	        super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
	        this.periodicita = periodicita;
	    }

	    public Periodicita periodicita() {
	        return periodicita;
	    }
	    @Override
	    public String toString() {
	        return "Rivista:\n" +
	                "Codice ISBN: " + getcodiceISBN() + "\n" +
	                "Titolo: " + getTitolo() + "\n" +
	                "Anno Pubblicazione: " + getannoPubblicazione() + "\n" +
	                "Numero di pagine: " + getnumeroPagine() + "\n" +
	                "Periodicità: " + periodicita + "\n";
	    }
	}
	

