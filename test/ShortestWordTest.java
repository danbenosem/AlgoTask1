import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestWordTest {



    @Test
    public void testThatItCanReturnTheShortestSentence(){

        String sentence = "How Far you Daniel d";
        String expected = ShortestWord.getShortestWord(sentence);

        assertEquals("d",expected);


    }

    @Test
    public void returnLengthOfShortestWordFour(){
        String sentence = ".. Horizon";
        assertEquals("Horizon",ShortestWord.getShortestWord(sentence));
    }
}
