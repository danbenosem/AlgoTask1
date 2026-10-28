public class ShortestWord {


    public static String getShortestWord(String sentence){

        String [] words = sentence.split("[, ]+");
        int min= Integer.MAX_VALUE;
        String shortestWord = "";
        for(String word:words){
            if (word.matches("[a-zA-Z0-9]+") && word.length() < min){
                min=word.length();
                shortestWord=word;

            }

        }
return  shortestWord;
    }
}
