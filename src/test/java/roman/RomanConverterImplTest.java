package roman;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RomanConverterImplTest {


    private RomanConverterImpl converter;

    @BeforeEach
    public void setUp() {
        converter = new RomanConverterImpl();
    }

    @Test
    void toRomanLessThanZero() {
        assertThrows(IllegalArgumentException.class,
                () -> converter.toRoman(-1));
    }

    @Test
    void toRomanGreaterThanMax() {
        assertThrows(IllegalArgumentException.class,
                () -> converter.toRoman(4001));
    }

    @Test
    void toRomanValid() {
        assertEquals("I", converter.toRoman(1));
    }

}