import java.security.Key;
import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) throws Exception {

        // Exercise 1 Nicknames
        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("Matthew", "Matt");
        nicknames.put("Michael", "Mix");
        nicknames.put("Arthur", "Artie");

        System.out.println(nicknames.get("Matthew"));

        // Exercise 2 Abbreviations
        Abbreviaions abbreviaions = new Abbreviaions();

        abbreviaions.addAbb("e.g", "for example");
        abbreviaions.addAbb("etc.", "and so on");
        abbreviaions.addAbb("i.e", "more precisely");

        System.out.println(abbreviaions.hasAbb("misc"));
        System.out.println(abbreviaions.hasAbb("etc."));
        System.out.println(abbreviaions.findMeaningFor("e.g"));
        System.out.println(abbreviaions.findMeaningFor("lol"));

        // Exercise 3 Print Me my Hash Map
        printKeys(nicknames);
        System.out.println("--1--");
        printKeysWhere(nicknames, "u");
        System.out.println("--2--");
        printValueOfKeysWhere(nicknames, "u");

        // Exercise 5 IOU
        IOU mattsIOU = new IOU();

        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if(key.contains(text)){
                System.out.println(key);
            }
        }
    }

    public static void printValueOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if(key.contains(text)){
                System.out.println(hashmap.get(key));
            }
        }
    }

}
