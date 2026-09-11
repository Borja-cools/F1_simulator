/**
 * @author Borja
 * @version 1.0 11/09/2026 18:57
 *
 */
public enum CircuitType {
    MELBOURNE(5.278, 1.05, 58),
    SHANGHAI(5.451, 1.10, 56),
    SUZUKA(5.807, 1.25, 53),
    MIAMI(5.412, 0.95, 57),
    MONTREAL(4.361, 0.85, 70),
    MONACO(3.337, 0.75, 78),
    BARCELONA(4.657, 1.30, 66),
    SPIELBERG(4.318, 1.05, 71),
    SILVERSTONE(5.891, 1.25, 52),
    SPA(7.004, 1.15, 44),
    HUNGARORING(4.381, 1.20, 70),
    ZANDVOORT(4.259, 1.25, 72),
    MONZA(5.793, 0.85, 53),
    MADRID(5.414, 1.00, 57),
    BAKU(6.003, 0.80, 51),
    SINGAPORE(4.927, 1.10, 62),
    AUSTIN(5.513, 1.20, 56),
    MEXICO_CITY(4.304, 1.00, 71),
    INTERLAGOS(4.309, 1.15, 71),
    LAS_VEGAS(6.201, 0.75, 50),
    LUSAIL(5.419, 1.35, 57),
    YAS_MARINA(5.281, 1.00, 58);

    private final double circuitLength;
    private final double degradationRate;
    private final int numberOfLaps;

    CircuitType(double circuitLength, double degradationRate, int numberOfLaps) {
        this.circuitLength = circuitLength;
        this.degradationRate = degradationRate;
        this.numberOfLaps = numberOfLaps;
    }

    // Getters
    public int getNumberOfLaps() {
        return numberOfLaps;
    }
    public double getCircuitLength() {
        return circuitLength;
    }
    public double getDegradationRate() {
        return degradationRate;
    }
}
