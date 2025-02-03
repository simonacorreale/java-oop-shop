/* Esercizio di oggi Java Shop
repo : java-oop-shop
Nel progetto java-oop-shop, creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva
Usate opportunamente costruttori, attributi ed eventuali altri metodi di “utilità” per fare in modo che:
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
- il prodotto esponga un metodo per avere il prezzo base
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
Nella stessa cartella src aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto. */

import java.util.Random;

public class Prodotto {

    public int code;

    public String name;

    public String description;

    public double price;

    public double iva;

 public Prodotto(String name, String description, double price, double iva) {

    this.code = generateRandomCode();
    this.name = name;
    this.description = description;
    this.price = price;
    this.iva = iva;

 }

// generiamo un codice casuale 
private int generateRandomCode() {
    Random rand = new Random();
    return rand.nextInt(1000);
}

 // inseriao il prezzo base
 public double getBasePrice() {
    return price;
}

// inseriamo il prezzo + iva
public double getIvaPrice() {
    return price + (price * iva / 100);
}

// aggiungiamo il codice casuale + nome
public String getExtendedName() {
    return code + " " + name;
}


}
