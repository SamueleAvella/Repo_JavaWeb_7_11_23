
/**
 * Cliente
 */
public class Cliente {

    private static Integer codiceClienteProgressivo=1;
    private final String codiceCliente;
    private String nome, cognome, email, username, password;
    private Permessi permesso = Permessi.USER_BASE;

    public Cliente(String nome, String cognome, String email, String username, String password){
        this.nome= nome;
        this.cognome=cognome;
        this.email=email;
        this.username=username;
        this.password = password;
        codiceCliente = "ID_" + codiceClienteProgressivo.toString();
        codiceClienteProgressivo++;
    }

    public Cliente(String nome, String cognome, String email, String username, String password, Permessi permesso){
        this(nome, cognome,  email, username, password);
        this.permesso = permesso;

    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public static Integer getCodiceClienteProgressivo() {
        return codiceClienteProgressivo;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public Permessi getPermesso() {
        return permesso;
    }

    
}
