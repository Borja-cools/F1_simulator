/**
 * @author Borja
 * @version 1.0 04/09/2026 01:08
 *
 */
public class Tyre {
    // attributen
    private int amountOfLaps;
    private double condition;
    private TyreType tyreType;


    public Tyre(TyreType tyreType) {
        this.condition = 100.0;
        this.amountOfLaps = 0;
        if(tyreType == null) throw new IllegalArgumentException("TyreType can't be null.");
        this.tyreType = tyreType;
    }

    // getters
    public int getAmountOfLaps() {
        return amountOfLaps;
    }
    public double getCondition() {
        return condition;
    }
    public double getGrip(){
        return currentGrip();
    }


    // Methodes tyre
    // aantal rondes
    public void driveLap(double circuitDeg) {
        amountOfLaps++;

        // Condition berekenen
        double newCondition = condition - tyreType.getDegradation() * circuitDeg;
        // Condition mag niet onder 0 gaan
        if (newCondition < 0) {
            condition = 0;
        } else {
            condition = newCondition;
        }

    }

    public boolean isWornOut(){
        if(condition == 0){
            return true;
        }
        return false;
    }
    // grip adv degradatie - latere uitwerking
    private double currentGrip(){
        double baseGrip = tyreType.getGrip();
        double effectiveGrip = baseGrip * (condition / 100.0);

        return effectiveGrip;
    }
}
