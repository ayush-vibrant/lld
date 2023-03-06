package observer.Observable;

import observer.Observer.Observer;

public interface Observable {
    boolean addObserver(Observer observer);

    boolean removeObserver(Observer observer);

    void setData(Data data);

    void notifyObservers();
}
