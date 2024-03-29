
/**
 * Test is een tijdelijke klasse die we gebruiken om alles te printen en zodanig te testen.
 * Dit zal later worden vervangen door een text user interface
 * @author Ein1B
 * 
 */

public class Test{

    public static void printToernooi(){
        Toernooi toernooi = new Toernooi("UEFA");
        toernooi.addPoule("A", "Ajax", "PSV", "AZ", "NEC");
        toernooi.addPoule("B", "Besiktas", "Galatasaray", "Fenerbahce", "Trabzonspor");
        toernooi.addPoule("C", "Manchester city", "Arsenal", "Chelsea", "Liverpool");
        toernooi.addPoule("D", "Barcelona", "Real Madrid", "Valencia", "Atletico Madrid");
        System.out.println(toernooi.toString());
    }
    
    public static void printPoule(String letter){
        Toernooi toernooi = new Toernooi("UEFA");
        toernooi.addPoule("A", "Ajax", "PSV", "AZ", "NEC");
        toernooi.addPoule("B", "Besiktas", "Galatasaray", "Fenerbahce", "Trabzonspor");
        toernooi.addPoule("C", "Manchester United", "Arsenal", "Chelsea", "Liverpool");
        toernooi.addPoule("D", "Barcelona", "Real Madrid", "Valencia", "Atletico Madrid");
        System.out.println(toernooi.getPoule(letter).toString());
    }
    
    public static void printAlleTeams(){
        Toernooi toernooi = new Toernooi("UEFA");
        toernooi.addPoule("A", "TEST", "PSV", "AZ", "NEC");
        toernooi.addPoule("B", "Besiktas", "Galatasaray", "Fenerbahce", "Trabzonspor");
        toernooi.addPoule("C", "Manchester United", "Arsenal", "Chelsea", "Poolliver");
        toernooi.addPoule("D", "Barcelona", "Real Madrid", "Valencia", "Atletico Madrid");
        System.out.println(toernooi.getAlleTeams());
    }
    
      public static void speelWedstrijd(String letter){
        Toernooi toernooi = new Toernooi("UEFA");
        toernooi.addPoule("A", "Ajax", "PSV", "AZ", "NEC");
        toernooi.addPoule("B", "Besiktas", "Galatasaray", "Fenerbahce", "Trabzonspor");
        toernooi.addPoule("C", "Manchester city", "Arsenal", "Chelsea", "Liverpool");
        toernooi.addPoule("D", "Barcelona", "Real Madrid", "Valencia", "Atletico Madrid");
        toernooi.getPoule(letter).setUitslag(1, " 6 - 30");
        System.out.println(toernooi.getPoule(letter).geefWedstrijden());
    }
    
    
    public static void genereerPoules(){
        Toernooi toernooi = new Toernooi("UEFA");
        Poulegenerator generator = new Poulegenerator(toernooi);
        generator.genereerPoules("teams.txt");
        System.out.println(toernooi.toString());
    }

}