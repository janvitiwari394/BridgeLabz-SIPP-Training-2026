interface StreamingService {
    void stream();

    default void showSubscriptionDetails() {
        System.out.println("Streaming subscription active");
    }
}

interface GamingService {
    void play();

    default void showSubscriptionDetails() {
        System.out.println("Gaming subscription active");
    }
}

class SmartTV implements StreamingService, GamingService {

    public void stream() {
        System.out.println("Streaming movie");
    }

    public void play() {
        System.out.println("Playing game");
    }

    
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class SmartTVDemo {
    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        tv.stream();
        tv.play();
        tv.showSubscriptionDetails();
    }
}