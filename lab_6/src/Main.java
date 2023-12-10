public class Main {
    public static void main(String[] args) {
        int value = 51966;
        String hexString = intToHexString(value);
        System.out.println("Результат 1: " + hexString);
        String input = "The user with the nickname koala757677 this month wrote 3 times more " +
                "comments than the user with the nickname croco181dile920 4 months ago";
        int combinationsCount = countLetterDigitCombinations(input);
        System.out.println("Результат 2: " + combinationsCount);
    }

    static String intToHexString(int i) {
        // Використовуємо Integer.toHexString для отримання шістнадцяткового представлення
        String hexString = Integer.toHexString(i).toUpperCase();

        return hexString;
    }

    static int countLetterDigitCombinations(String input) {
        String[] words = input.split("\\s+"); // Розбиваємо рядок на слова

        int count = 0;

        for (String word : words) {
            if (containsLetterDigitCombination(word)) {
                count++;
            }
        }

        return count;
    }

    static boolean containsLetterDigitCombination(String str) {
        boolean containsLetter = false;
        boolean containsDigit = false;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                containsLetter = true;
            } else if (Character.isDigit(ch)) {
                containsDigit = true;
            }

            if (containsLetter && containsDigit) {
                return true;
            }
        }

        return false;
    }
}