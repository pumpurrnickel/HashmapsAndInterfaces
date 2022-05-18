public class CustomTacoBox implements TacoBoxes{

    private int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    public int TacosRemaining() {
        return this.tacos;
    }

    public void eat() {
        tacos--;
    }
    
}
