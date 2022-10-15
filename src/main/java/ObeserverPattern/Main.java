package ObeserverPattern;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel1 channel1 = new YoutubeChannel1();
        YoutubeChannel2 channel2 = new YoutubeChannel2();

        User1 user1 = new User1();
        User2 user2 = new User2();
        User3 user3 = new User3();

        channel1.observerArrayList.add(user1);
        channel1.observerArrayList.add(user2);


        channel2.observerArrayList.add(user1);
        channel2.observerArrayList.add(user2);
        channel2.observerArrayList.add(user3);

        channel1.newVideoAdded("Observer Design Pattern Video added");
        channel2.newVideoAdded("Strategy Design Pattern Video added");


    }
}
