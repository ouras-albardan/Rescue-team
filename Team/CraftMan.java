package Team;

public class CraftMan extends Crew {

    private int energiLevel;

    CraftMan(String name, int energiLevel) {
        super(name);
        this.energiLevel = 100;
    }

    public boolean openLockedDoor(boolean lockStatus) {
        if(lockStatus == false) {
            lockStatus = true;
            this.energiLevel -= 30;
        }
        return lockStatus;
    }

    public int getEnergiLevel() {
        return energiLevel;
    }

    public void setEnergiLevel(int energiLevel) {
        this.energiLevel = energiLevel;
    }
}
