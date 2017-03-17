package ca.ualberta.cs.lonelytweet;

/**
 * Created by cdkushni on 3/16/17.
 */

public class NormalLonelyTweet extends LonelyTweet {
    public NormalLonelyTweet(String text) {
        super(text);
    }

    @Override
    public String getTweetBody() {
        return tweetBody.toLowerCase();
    }

    @Override
    public boolean isValid() {
        if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 10) {
            return false;
        }

        return true;
    }
}
