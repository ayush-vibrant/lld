package observer.Observer;

import observer.Observable.ObservableImpl;

public class ObserverImplA implements Observer {
    // Here you will be writing which observable implementation this observer class is interested in
    ObservableImpl observableImpl;

    public ObserverImplA(ObservableImpl observableImpl) {
        this.observableImpl = observableImpl;
    }

    public void update() {
        System.out.println("observer.Observer.Observer A | " + observableImpl.getData());
    }
}

