import java.util.ArrayList;
import java.util.List;

class Inventario {
    
    private List<Giocattolo> giocattoli = new ArrayList<>();

    public void addItem(Giocattolo giocattolo){
        giocattoli.add(giocattolo);
    }

}
