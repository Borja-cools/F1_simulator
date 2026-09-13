import java.util.ArrayList;
import java.util.List;

/**
 * @author Borja
 * @version 1.0 04/09/2026 01:14
 *
 */
public class Team {
    // Attributen voor team
    private TeamName name;
    private List<Car> cars;


    // Constructor team
    public Team(TeamName name) {
        if(name == null) throw new IllegalArgumentException("Elke renstal heeft een naam.");
        this.name = name;
        this.cars = new ArrayList<>();
    }

    // Methode om een wagen aan de lijst toe te voegen - max 2 wagens per renstal
    public void addCar(Car car) {
        if (car == null) throw new IllegalArgumentException("Je kan geen spookwagen toevoegen");
        if (this.cars.size() >= 2) throw new IllegalArgumentException("Er kunnen maximaal 2 wagens in een renstal.");
        this.cars.add(car);
    }

    // Getter voor de wagens
    public List<Car> getCars() {
        return this.cars;
    }
}
