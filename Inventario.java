/*Gestione dell'Inventario:
Implementa una classe Inventario che tiene traccia dei giocattoli disponibili e che possa essere aggiornata da un o specifico admin.*/

import java.util.ArrayList;
import java.util.List;

/**
 * Inventario
 */
class Inventario {

    private List<Giocattolo> listaGiocattoli = new ArrayList<>();
    private List<Cliente> listaClienti = new ArrayList<>();



    void addCustomer(Cliente cliente){
        
        listaClienti.add(cliente);
    }

    void addToy(Giocattolo giocattolo){
        listaGiocattoli.add(giocattolo);
    }



}