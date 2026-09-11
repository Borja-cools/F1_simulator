/**
 * @author Borja
 * @version 1.0 04/09/2026 01:14
 *
 */
public class Car {
    // Attributen car
    private Tyre tyre;
    private String name;

    // Constructor Car
    public Car(Tyre tyre, String name) {
        if(tyre == null) throw new IllegalArgumentException("Tyre can't be null.");
        if(name == null) throw new IllegalArgumentException("Name can't be null.");
        this.tyre = tyre;
        this.name = name;
    }


    // Methodes voor banden wissels of strategieën
    // change tyre -> simulatie van pitstops

    // basis methode change tyre
    public void changeTyre(Tyre tyre) {
        if (tyre == null) {
            throw new IllegalArgumentException("je moet een band hebben om te rijden.");
        }
        this.tyre = tyre;
    }

    // Getters
    public Tyre getTyre() {
        return tyre;
    }
    public String getName() {
        return name;
    }
}
