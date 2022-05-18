import java.util.HashMap;

public class Abbreviaions {
    
    HashMap<String, String> abbreviations;

    public Abbreviaions(){
        abbreviations = new HashMap<>();
    }

    public void addAbb(String abbreviation, String meaning){
        abbreviations.put(abbreviation, meaning);
    }

    public boolean hasAbb(String abbreviation){
        if(this.abbreviations.containsKey(abbreviation)){
            return true;
        } else {
            return false;
        }
    }

    public String findMeaningFor (String abbreviation){
        return abbreviations.get(abbreviation);
    }

}
