package model;

/*
    Interfaccia di base per gli elementi presenti nel menu
 */

public interface MenuItem {

    public String getName(); // restituisce il nome del prodotto
    public Double getPrice(); // restituisce il prezzo del prodotto
    public String getMenuItemLine(); // restituisce la riga completa di tutti i dati presenti sul menu
}
