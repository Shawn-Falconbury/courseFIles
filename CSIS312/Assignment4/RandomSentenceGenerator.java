// RandomSentenceGenerator.jAVA
// CSIS312-B01 (September 18, 2023) - Assignment 4:
//
// Additional Sources that were used to assist in the development of this code:
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk, p.334-346
// Oracle. (n.d.). Class StringBuilder. Java Platform, Standard Edition Documentation. Retrieved September 11, 2023, from https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/StringBuilder.html

import java.util.Random;


public class RandomSentenceGenerator {

    /**
     * Generates and prints 20 random sentences.
     */
    public static void main(String[] args) {
        System.out.println(" - Assignment #4");
        SentenceGenerator sentenceGenerator = new SentenceGenerator();

        // Generate and print 20 sentences with sequential numbering
        for (int i = 0; i < 20; i++) {
            System.out.println((i + 1) + ". " + sentenceGenerator.generateSentence());
        }
    }
}

/**
 * The Word class is responsible for providing random words from predefined arrays.
 */
class Word {
    private static final String[] ARTICLE = {"the", "a", "one", "some", "any"};
    private static final String[] NOUN = {"boy", "girl", "dog", "town", "car"};
    private static final String[] VERB = {"drove", "jumped", "ran", "walked", "skipped"};
    private static final String[] PREPOSITION = {"to", "from", "over", "under", "on"};

    private Random random = new Random();

    /**
     * @return A random article.
     */
    public String getArticle() {
        return ARTICLE[random.nextInt(ARTICLE.length)];
    }

    /**
     * @return A random noun.
     */
    public String getNoun() {
        return NOUN[random.nextInt(NOUN.length)];
    }

    /**
     * @return A random verb.
     */
    public String getVerb() {
        return VERB[random.nextInt(VERB.length)];
    }

    /**
     * @return A random preposition.
     */
    public String getPreposition() {
        return PREPOSITION[random.nextInt(PREPOSITION.length)];
    }
}

/**
 * The SentenceGenerator class is responsible for constructing sentences using the Word class.
 */
class SentenceGenerator {
    private Word wordProvider = new Word();

    /**
     * @return A randomly generated sentence.
     */
    public String generateSentence() {
        StringBuilder sentenceBuilder = new StringBuilder();

        sentenceBuilder.append(capitalizeFirstLetter(wordProvider.getArticle())).append(" ")
                .append(wordProvider.getNoun()).append(" ")
                .append(wordProvider.getVerb()).append(" ")
                .append(wordProvider.getPreposition()).append(" ")
                .append(wordProvider.getArticle()).append(" ")
                .append(wordProvider.getNoun()).append(".");

        return sentenceBuilder.toString();
    }

    /**
     * Capitalizes the first letter of a word.
     *
     * @param word Word to be capitalized.
     * @return Word with the first letter capitalized.
     */
    private String capitalizeFirstLetter(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
}
