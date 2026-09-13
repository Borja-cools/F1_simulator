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


    // Methodes tyre
    // aantal rondes
    public void driveLap(double circuitDeg) {
        amountOfLaps++;
        this.condition -= tyreType.getDegradation() * circuitDeg; //tyre basisdegradatie × circuit degradation factor
    }
    // grip adv degradatie - latere uitwerking
}
