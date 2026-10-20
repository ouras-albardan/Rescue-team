package Team;

public class Engineer extends Crew {
    private int energiLevel;

    Engineer(String name) {
        super(name);
        this.energiLevel = 100;
    }

    public int fixO2Pipes() {
        this.energiLevel -= 20;
        int O2Increment = 20;
        return O2Increment;
    }

    public boolean rebootReactor(boolean reactorState) {
        if (reactorState == false) {
            reactorState = true;
            this.energiLevel -= 30;
        }
        return reactorState;
    }

    public int getEnergiLevel() {
        return energiLevel;
    }

    public void setEnergiLevel(int energiLevel) {
        this.energiLevel = energiLevel;
    }
}
