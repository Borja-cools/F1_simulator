/**
 * @author Borja
 * @version 1.0 11/09/2026 16:09
 *
 */
public enum TyreType {
    SOFT(1.00, 1.50),
    MEDIUM(0.90, 1.20),
    HARD(0.80, 1.10);

    // Attributen Enum
    private double grip;
    private double degradation;

    TyreType(double grip, double degradation) {
        this.grip = grip;
        this.degradation = degradation;
    }


    // Getters voor berekening in tyre klasse
    public double getGrip() {
        return grip;
    }
    public double getDegradation() {
        return degradation;
    }
}
