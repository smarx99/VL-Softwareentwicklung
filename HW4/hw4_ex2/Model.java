package HW4.hw4_ex2;

import java.util.ArrayList;
import java.util.List;

public class Model {

    // list of observers
    private List<Observer> observers;

    // data
    private int numData;

    // constructor
    public Model(int numData) {
        this.numData = numData;
        this.observers = new ArrayList<>();
    }

    public int getNumData () {
        return numData;
    }

    public void setNumData(int numData) {
        // update data
        this.numData = numData;
        // notify observers
        notifyObservers();
    }

    public void attachObserver(Observer o) {
        observers.add(o);
    }

    public void detachObserver(Observer o) {
        observers.remove(o);
    }

    // notify observers
    private void notifyObservers() {
        for(Observer o: this.observers) {
            o.update();
        }
    }
}
