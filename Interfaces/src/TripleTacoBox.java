public class TripleTacoBox implements TacoBoxes {
    
    private int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
    }

    public int TacosRemaining() {
        return this.tacos;
    }

    public void eat() {
        if(tacos > 0) {
            tacos--;
        }
        
    }
}
