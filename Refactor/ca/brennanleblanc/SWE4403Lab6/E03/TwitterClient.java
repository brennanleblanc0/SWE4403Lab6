package ca.brennanleblanc.SWE4403Lab6.E03;

import java.util.ArrayList;
import java.util.List;

public class TwitterClient {
  public List<Tweet> getRecentTweets(String appKey, String appSecret) {
    var oauth = new OAuth();
    var requestToken = oauth.requestToken("appKey", "secret");
    var accessToken = oauth.getAccessToken(requestToken);

    if (accessToken.equals("accessToken")) {
      System.out.println("Getting recent tweets");
      return new ArrayList<>();
    } else {
      System.out.println("Invalid token");
      return null;
    }
    
  }
}
