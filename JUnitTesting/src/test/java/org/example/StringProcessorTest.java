package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringProcessorTest {

    @Test
    public void testIsStrongPassword() {
        StringProcessor sp = new StringProcessor();
        assertFalse(sp.isStrongPassword("WeakPass123"));
    }

    @Test
    public void testCalculateDigits() {
        StringProcessor sp= new StringProcessor();
        assertEquals(6, sp.calculateDigits("abc123def456"));
    }

    @Test
    public void testCalculateWords() {
        StringProcessor sp = new StringProcessor();
        assertEquals(4, sp.calculateWords("This is a sentence."));
}

    @Test
    public void testExpression(){
        StringProcessor sp = new StringProcessor();
        assertEquals(4.5, sp.calculateExpression("(2 + 1)*3/2") , 0.001);
    }
}
