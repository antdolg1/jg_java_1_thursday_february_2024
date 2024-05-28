package students.slava_subacius.lesson_7.level_1;


 class WordService {

     private boolean counts;

     public String findMostFrequentWord(String text) {
         String[] textArray = text.split(" ");
         int[] wordCountArray = new int[textArray.length];

         for (int i = 0; i < textArray.length; i++) {
             wordCountArray[i] = countWordOccurrences(textArray);
         }

         int maxCount = 0;
         int maxIndex = 0;
         for (int i = 0; i < wordCountArray.length; i++) {
             if (wordCountArray[i] > maxCount) {
                 maxCount = wordCountArray[i];
                 maxIndex = i;
             }
         }

         return textArray[maxIndex];
     }

     public int countWordOccurrences(String[] words) {
         int count = 0;
         for (String w : words) {
             if (w.equals(words)) {
                 count++;
             }
         }
         return count;
     }


     public String[] splitTextIntoWords(String text) {
         return text.split(" ");
     }

     public int findIndexOfMaxCount(int[] counts) {
         int maxIndex = 0;
         for (int i = 1; i < counts.length; i++) {
             if (counts[i] > counts[maxIndex]) {
                 maxIndex = i;
             }
         }
         return maxIndex;
     }

 }
