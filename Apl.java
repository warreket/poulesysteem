import TUI.Hoofdmenu;
import Model.Poulesysteem;

public class Apl{

    public static void main(String[] args){
        new Hoofdmenu(new Poulesysteem()).toon();
    }

}