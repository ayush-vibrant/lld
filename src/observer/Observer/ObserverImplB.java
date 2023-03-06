package observer.Observer;

import observer.Observable.ObservableImpl;

public class ObserverImplB implements Observer {
    ObservableImpl observableImpl;

    public ObserverImplB(ObservableImpl observableImpl) {
        this.observableImpl = observableImpl;
    }

    public void update() {
        System.out.println("observer.Observer.Observer B | " + observableImpl.getData());
    }
}

