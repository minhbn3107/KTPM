package ProjectTaskManagement;

import ProjectTaskManagement.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
