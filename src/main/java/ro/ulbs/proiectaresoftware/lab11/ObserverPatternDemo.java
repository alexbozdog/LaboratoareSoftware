package ro.ulbs.proiectaresoftware.lab11;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel("Tech Explained");

        MediaInterested media1 = new MediaInterested("CNN");
        MediaInterested media2 = new MediaInterested("FoxNews");

        channel.attach(media1);
        channel.attach(media2);

        String message1 = "Observer Pattern in Java";
        channel.uploadVideo(message1);

        System.out.println();

        channel.detach(media2);

        String message2 = "Singleton Pattern in Java";

        channel.uploadVideo(message2);
    }
}