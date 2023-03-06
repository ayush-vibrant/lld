package observer;

import observer.Observable.Data;
import observer.Observable.ObservableImpl;
import observer.Observer.Observer;
import observer.Observer.ObserverImplA;
import observer.Observer.ObserverImplB;
import observer.Observer.ObserverImplC;

public class ObserverApplication {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        addInitialObservers(observable);

        observable.setData(new Data());
    }

    private static void addInitialObservers(ObservableImpl observable) {
        Observer observerA = new ObserverImplA(observable);
        Observer observerB = new ObserverImplB(observable);
        Observer observerC = new ObserverImplC(observable);
        observable.addObserver(observerA);
        observable.addObserver(observerB);
        observable.addObserver(observerC);
    }
}
