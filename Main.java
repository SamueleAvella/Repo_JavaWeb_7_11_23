/**
 * Gestione Giocattoli  - JavaWeb - 07/11/2023
 * AVELLA Samuele
 */

/*
Esercizio Java per Giocattolaio (Senza DB)
Descrizione: Implementare un'applicazione Java per gestire l'inventario e le vendite di un negozio di giocattoli.

Task:
Definizione delle Classi:
Crea una classe Giocattolo con campi come id, nome, prezzo e età consigliata.
Crea una classe Cliente con campi come id, nome e indirizzo email.
Crea una classe Vendita che registra gli acquisti dei clienti.
Gestione dell'Inventario:
Implementa una classe Inventario che tiene traccia dei giocattoli disponibili e che possa essere aggiornata da un o specifico admin.
Processo di Vendita:
Implementa una classe  ASTRATTA RegistroVendite che gestisce le vendite dei giocattoli ai clienti e che deve contenere SOLO metodi. DA COMMITTARE DA SOLO
Interfaccia Utente:
Crea un'interfaccia utente semplice in console per interagire con l'utente, permettendo loro di acquistare giocattoli e visualizzare le vendite.
*/

/**
 * Main
 */
public class Main {
    /*public static void main(String[] args) {
        
        Inventario inventario = new Inventario();
        Cliente admin = new Cliente("admin", "admin", "admin@bellapete.it", "admin", "admin", Permessi.ADMIN);

        inventario.addToy(new Giocattolo("spada laser", 12.5, 7, 13));
        inventario.addToy(new Giocattolo("bambola", 25, 2, 30));
        inventario.addToy(new Giocattolo("cubo di rubrik", 10, 13, 3));
        inventario.addToy(new Giocattolo("puzzle", 15, 10, 23));

        inventario.addCustomer(new Cliente("Samuele", "Avella", "samuele@bellapete.com", "samu", "samu"));
        inventario.addCustomer(new Cliente("Giuseppe", "Billone", "giuseppe@bellapete.com", "giuse", "giuse"));
        inventario.addCustomer(new Cliente("Pippo", "Baudo", "pippo@bellapete.com", "pippo", "pippo"));

        
    }*/

    public static void main(String[] args) {

        DbManager dbMan = new DbManager();
        dbMan.openConnection();
    }
}