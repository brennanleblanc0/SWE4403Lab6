package ca.brennanleblanc.SWE4403Lab6.E03;

public class Demo {
  public static void main(String args[]) {
    show();
  }

  public static void show() {

    var twitterClient = new TwitterClient();
    var tweets = twitterClient.getRecentTweets("appKey", "secret");
  }
}
