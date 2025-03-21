package MusicChannel;

public class Subscriber implements Observer{
    private int id;
    private String name;
    @Override
    public void update(String message) {
        System.out.println("Id: " + id + " Name: " + name + " Message: " + message);
    }

    public Subscriber(int id, String name){
        this.id = id;
        this.name = name;
    }
}
