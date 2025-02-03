package Main;
// aggiungiamo il main per il run
public static void main(String[] args) {

    Prodotto prodottoExposed = new Prodotto ("Laptop", "Un potentissimo laptop da gaming", 1200.00, 24.0);
        System.out.println(prodottoExposed);//cella vuota (come esplicato a lezione)
        System.out.println(("Nome prodotto: "+ prodottoExposed.getExtendedName()));
        System.out.println(("Prezzo base: " + prodottoExposed.getBasePrice() + "€"));
        System.out.println(("Prezzo con iva: " + prodottoExposed.getIvaPrice() +"€"));
}
