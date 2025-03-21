package MusicChannel;

public class Main {
    public static void main(String[] args) {
        Music musicChannel = new Music(1, "C1", true);

        Subscriber sub1 = new Subscriber(1, "Asenal");
        Subscriber sub2 = new Subscriber(2, "PSG");
        Subscriber sub3 = new Subscriber(3, "Real");

        musicChannel.register(sub1);
        musicChannel.register(sub2);
        musicChannel.register(sub3);

        musicChannel.changeState();    }
}