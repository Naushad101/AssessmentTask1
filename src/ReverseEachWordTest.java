package src;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseEachWordTest {

    @Test
    public void ReverseWordsInLineTest() {

        assertEquals("olleH", ReverseEachWord.reverse("Hello"));

        assertEquals("oLLeH", ReverseEachWord.reverse("HeLLo"));

        assertEquals("Hitesh.", ReverseEachWord.reverse("hsetiH."));

        assertEquals("olleH!", ReverseEachWord.reverse("Hello!"));

        assertEquals("Nikhil?", ReverseEachWord.reverse("?lihkiN"));
    }

}

