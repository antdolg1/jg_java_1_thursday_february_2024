package students.ruslan_k.lesson_7.level_1;

class WordService {


    String findMostFrequentWord(String text) {
        String newText = removeNonTextSymbols(text);
        String[] splitText = splittingString(newText);
        String[] splitTextForFutureUse = splittingString(newText);

        int[] quantity = new int[splitText.length];

        findEntrance(splitText, quantity);
        int max = findMaxEntrance(quantity);
        int index = findFirstMaxIndex(quantity, max);
        return splitText[index];
    }


    String[] splittingString(String text) {
        return text.split(" ");

    }

    String removeNonTextSymbols(String text) {
        text = text.replace(',', ' ');
        text = text.replace('\n', ' ');
        return text.replace('.', ' ');


    }

    void findEntrance(String[] splittedString, int[] quantity) {
        for (int i = 0; i < splittedString.length; i++) {
            if (splittedString[i].isEmpty()) {
                continue;
            }
            for (int j = i + 1; j < splittedString.length; j++) {
                if (splittedString[i].equalsIgnoreCase(splittedString[j])) {
                    quantity[i]++;
                    splittedString[j] = "";
                }
            }
        }
    }

    int findMaxEntrance(int[] quantity) {
        int max = quantity[0];
        for (int quantityElement : quantity) {
            max = Math.max(quantityElement, max);
        }
        return max;
    }


    int findFirstMaxIndex(int[] quantity, int max) {
        int index = 0;
        for (int i = 0; i < quantity.length; i++) {
            if (quantity[i] == max) {
                index = i;
                break;
            }
        }
        return index;
    }
}
