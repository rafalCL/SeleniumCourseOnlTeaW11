package selenium.examples;

import java.util.UUID;

public class RandomEmailExample {
    public static void main(String[] args) {
        String randomEmail = UUID.randomUUID().toString() + "@mail.pl";
        System.out.println(randomEmail);
    }
}
