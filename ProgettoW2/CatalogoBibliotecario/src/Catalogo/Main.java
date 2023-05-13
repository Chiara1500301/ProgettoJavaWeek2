package Catalogo;
public class Main {
    public static void main(String[] args) {
    	
        Archivio archivio = new Archivio();
        Book book1 = new Book("9781234567890", "Harry Potter e l'ordine della fenice", 1997, 204, "Fantasy", "J.K.Rowling");
        Book book2 = new Book("9789876543210", "L'Amica Geniale", 2011, 400, "Romanzo/Narrativa", "Elena Ferrante");
        Rivista rivista1 = new Rivista("1234567890123", "Vogue", 2023, 100, Periodicita.MENSILE);
        Rivista rivista2 = new Rivista("4567890123456", "Vanity Fair", 2022, 52, Periodicita.SETTIMANALE);

        archivio.aggiungiElemento(book1);
        archivio.aggiungiElemento(book2);
        archivio.aggiungiElemento(rivista1);
        archivio.aggiungiElemento(rivista2);

        System.out.println("Elenco dei libri e delle riviste nell'archivio:");
        for (Elemento elemento : archivio.getElementi()) {
            System.out.println(elemento);
        }

        }
    }


