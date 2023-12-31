class Giocattolo {

    private static Integer codiceGiocattoloProgressivo=1;
    private final String codiceGiocattolo;
    private String nomeGiocattolo;
    private double prezzo;
    private int quantita;
    private int etaConsigliata;

    public Giocattolo(String nomeGiocattolo, double prezzo, int etaConsigliata, int quantita){
        this.nomeGiocattolo = nomeGiocattolo;
        this.prezzo = prezzo;
        this.etaConsigliata = etaConsigliata;
        this.quantita = quantita;
        codiceGiocattolo = nomeGiocattolo.toUpperCase() + "_PROD_" + codiceGiocattoloProgressivo.toString();
        codiceGiocattoloProgressivo++;
    }

    public int getQuantita() {
        return quantita;
    }

    public int getEtaConsigliata() {
        return etaConsigliata;
    }

    public String getCodiceGiocattolo() {
        
        return codiceGiocattolo;
    }

    public String getNomeGiocattolo() {
        return nomeGiocattolo;
    }

    public double getPrezzo() {
        return prezzo;
    }


    @Override
    public String toString() {
        String descrizione="";
        descrizione += "Nome Giocattolo: " + this.getNomeGiocattolo();
        descrizione += "\tCod. : " + this.getCodiceGiocattolo();
        descrizione += "Età consigliata: " + this.getEtaConsigliata();
        descrizione += "\nPrezzo Euro: " + this.getPrezzo();
        return descrizione;
    }

    public void setNomeGiocattolo(String nomeGiocattolo) {
        this.nomeGiocattolo = nomeGiocattolo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setEtaConsigliata(int etaConsigliata) {
        this.etaConsigliata = etaConsigliata;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public void decQuantita(){
        this.quantita--;
    }

}
