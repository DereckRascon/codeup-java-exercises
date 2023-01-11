import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {"funny","brave", "handsome", "cheerful", "thoughtful", "self-confidence", "ambitious", "courageous", "generous", "bewildered",};

    public static String[] nouns = {"action", "beer", "championship", "diamond", "earth", "freedom", "game", "honey", "injury", "queen"};

    public static void main(String[] args) {
        System.out.println(getWord(adjectives) + " " + getWord(nouns));
    }

    public static String getWord(String[] words){
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }



}
