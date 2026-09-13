import java.util.List;

/**
 * @author Borja
 * @version 1.0 13/09/2026 16:47
 *
 */
public class Race {
    // Attributen voor race
    private Circuit circuit;
    private List<Team> teams;
    private int currentLap;
    private RaceState raceStatus;

    // constructor voor race
    public Race(Circuit circuit, List<Team> teams) {
        if (circuit == null) {
            throw new IllegalArgumentException("Er moet een circuit worden toegewezen aan de race.");
        }
        this.circuit = circuit;
        if (teams.size() != 11){
            throw new IllegalArgumentException("Niet alle teams nemen deel"); // dit is momenteel basis check, later kan eventueel een team niet meedoen.
        }
        this.teams = teams;
        this.currentLap = 0;
    }

    // Methodes voor delegatie race

    // Start - status aanpassen, beginronde op 0 zetten?
    public void startRace() {
        raceStatus = RaceState.RUNNING;
    }

    // Lap - ronde bijwerken, status banden bijwerken
    public void drivenLap() {
        if (raceStatus == RaceState.RUNNING && currentLap > circuit.getCircuitType().getNumberOfLaps()) {
            // conditie banden aanpassen - per driver die voorbij komt.
            teams.


            currentLap++;
        }
    }

    // End - check of laatste ronde is gereden.



}
