package MusicChannel;

import java.util.ArrayList;
import java.util.List;

public class Music implements Subject {
    private List<Observer> subscribers;
    private int id;
    private boolean state;
    private String name;

    public Music(int id, String name, boolean state) {
        subscribers = new ArrayList<Observer>();
        this.id = id;
        this.name = name;
        this.state = state;
    }

    @Override
    public void register(Observer observer) {
        if (!subscribers.contains(observer)) subscribers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(Observer observer) {
        observer.update("Mang den day");
    }

    @Override
    public void changeState() {
        state = !state;
        System.out.println("State changed to " + state);
        for (Observer observer : subscribers) {
            notifyObservers(observer);
        }
    }

}
