package ro.ulbs.proiectaresoftware.lab11;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    private String channelName;

    private List<Observer> observers;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void uploadVideo(String title) {
        System.out.println("{" + channelName + "} uploaded a new video: " + title);

        notifyObservers(title);
    }
}