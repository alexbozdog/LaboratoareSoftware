package ro.ulbs.proiectaresoftware.lab11;

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers(String message);
}
