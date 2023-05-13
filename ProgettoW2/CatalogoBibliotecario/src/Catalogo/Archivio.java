package Catalogo;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Archivio {
    private List<Elemento> elementi;

    public Archivio() {
        this.elementi = new ArrayList<>();
    }

    public void aggiungiElemento(Elemento elemento) {
        elementi.add(elemento);
    }

    public void rimuoviElemento(String codiceISBN) {
        elementi.removeIf(e -> e.getcodiceISBN().equals(codiceISBN));
    }

    public Optional<Elemento> ricercaPerISBN(String codiceISBN) {
        return elementi.stream()
                .filter(e -> e.getcodiceISBN().equals(codiceISBN))
                .findFirst();
    }

    public List<Elemento> ricercaPerAutore(String autore) {
        return elementi.stream()
                .filter(e -> e instanceof Book && ((Book) e).getAutore().equals(autore))
                .toList();
    }

    public List<Elemento> ricercaPerTitolo(String titolo) {
        return elementi.stream()
                .filter(e -> e.getTitolo().equals(titolo))
                .toList();
    }

    public List<Elemento> ricercaPerAnnoPubblicazione(int annoPubblicazione) {
        return elementi.stream()
                .filter(e -> e.getannoPubblicazione() == annoPubblicazione)
                .toList();
    }

    public void salvataggioSuDisco(String nomeFile) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeFile))) {
            oos.writeObject(elementi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void caricamentoDaDisco(String nomeFile) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeFile))) {
            elementi = (List<Elemento>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Elemento> getElementi() {
        return elementi;
    }
}
