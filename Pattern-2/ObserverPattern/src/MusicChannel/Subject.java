package MusicChannel;

public interface Subject {
    public void register(Observer observer);

    public void unregister(Observer observer);

    public void notifyObservers(Observer observer);

    public void changeState();
}
