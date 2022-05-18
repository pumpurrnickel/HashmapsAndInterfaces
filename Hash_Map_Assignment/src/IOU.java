import java.util.HashMap;

public class IOU{

    HashMap<String, Double> hm;

    public IOU() {
        hm = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        hm.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        Double howMuch = hm.get(toWhom);
        if (howMuch == null) {
            return 0;
        } else {
            return howMuch;
        }
    }
    
}