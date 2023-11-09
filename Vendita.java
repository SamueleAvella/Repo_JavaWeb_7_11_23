import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Vendita
 */
public class Vendita extends RegistroVendite{

    private Cliente acquirente;
    private Giocattolo acquisto;
    private LocalDateTime dataAcquisto;

    public Vendita(Cliente acquirente, Giocattolo acquisto, LocalDateTime dataAcquisto){
        this.acquirente = acquirente;
        this.acquisto = acquisto;
        this.dataAcquisto = dataAcquisto;
    }

    


}