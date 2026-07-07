interface TextModeration {
    void checkText();

    default void displayModerationPolicy() {
        System.out.println("No offensive content allowed");
    }
}

interface SpamDetection {
    void detectSpam();

    default void displayModerationPolicy() {
        System.out.println("No spam allowed");
    }

    static boolean containsRestrictedWords(String post) {
        return post.toLowerCase().contains("bad");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    String post;

    ContentModerator(String post) {
        this.post = post;
    }

    public void checkText() {
        if (SpamDetection.containsRestrictedWords(post))
            System.out.println("Offensive post");
    }

    public void detectSpam() {
        if (post.contains("buy now"))
            System.out.println("Spam post");
    }
}

public class AIBased {
    public static void main(String[] args) {

        String[] posts = {
                "hello world",
                "buy now offer",
                "this is bad content"
        };

        for (String p : posts) {

            ContentModerator cm = new ContentModerator(p);

            cm.checkText();
            cm.detectSpam();

            if (!p.contains("buy now") &&
                !p.toLowerCase().contains("bad")) {
                System.out.println("Valid post: " + p);
            }

            System.out.println();
        }
    }
}