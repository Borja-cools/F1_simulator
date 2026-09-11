/**
 * @author Borja
 * @version 1.0 04/09/2026 01:16
 *
 */
public class Circuit {
    // Attributen
    private CircuitType circuitType;

    // Constructor Circuit
    public Circuit(CircuitType circuitType) {
        if (circuitType == null) throw new IllegalArgumentException("Je moet een CircuitType hebben");
        this.circuitType = circuitType;
    }

    // getter
    public CircuitType getCircuitType() {
        return circuitType;
    }
}
