public class Vendita extends RegistroVendite{
    
    private static Integer codiceVenditaProgressivo=1;
    private final String codiceVendita; 
    private Cliente acquirente;
    private Giocattolo giocattoloAcquistato;

    public Vendita(Cliente acquirente, Giocattolo giocattoloAcquistato){
        this.acquirente = acquirente;
        this.giocattoloAcquistato = giocattoloAcquistato;
        codiceVendita = "SALE_" + codiceVenditaProgressivo.toString();
        codiceVenditaProgressivo++;
    }




}
