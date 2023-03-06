package observer.Observer;

import observer.Observable.Data;
import observer.Observable.ObservableImpl;

public class ObserverImplC implements Observer {
    ObservableImpl observableImpl;

    public ObserverImplC(ObservableImpl observableImpl) {
        this.observableImpl = observableImpl;
    }

    public void update() {
        System.out.println("observer.Observer.Observer C | " + observableImpl.getData());
    }
}

