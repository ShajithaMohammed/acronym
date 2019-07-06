import static java.lang.Integer.*;

class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {

        String acronym = String.valueOf(phrase.charAt(0));

        for (int i = 1; i < phrase.length(); i++) {
            if ((phrase.charAt(i - 1) == ' ' || phrase.charAt(i - 1) == '-' || phrase.charAt(i - 1) == '_')
                    && Character.isLetter(phrase.charAt(i))) {
                acronym += String.valueOf(phrase.charAt(i)).toUpperCase();
            }

        }
        return acronym;
    }
}


