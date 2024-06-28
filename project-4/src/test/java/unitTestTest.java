import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class unitTestTest {

    @Test
    public void addTest_when2and3_thenReturn5() {
        //Given
        int a = 2;
        int b = 3;
        //When
        int actual = unitTest.addition(a, b);
        //Then
        assertEquals(5, actual);
    }

    @Test
    public void isEvenTest_when4moduloIsEquals0_ThenReturnTrue() {
        //Given
        int c = 4;
        //When
        boolean actual = unitTest.isEven(c);
        //Then
        assertTrue(actual);
    }

    @Test
    public void isNotEvenTest_when3moduloNotEqual0_ThenReturnFalse() {
        //Given
        int c = 3;
        //When
        boolean actual = unitTest.isEven(c);
        //Then
        assertFalse(actual);
    }


    @Test
    public void productTest_when5and6_thenReturn30() {
        //Given
        int d = 5;
        int e = 6;
        //When
        int actual = unitTest.product(d, e);
        //Then
        assertEquals(30, actual);
    }

    @Test
    public void toUpperCaseTest_whenStringIsUpperCase_thenReturnTrue() {
        //Given
        String s = "test";
        //When
        String actual = unitTest.toUpperCase(s);
        //Then
        assertEquals("TEST", actual);
    }

    @Test
    public void isPositiveTest_when1_thenReturnTrue() {
        //Given
        int x = 1;
        //When
        boolean actual = unitTest.isPositive(x);
        //Then
        assertTrue(actual);
    }


    @Test
    public void isNotPositiveTest_whenMinus1_thenReturnFalse() {
        //Given
        int x = -1;
        //When
        boolean actual = unitTest.isPositive(x);
        //Then
        assertFalse(actual);

    }

}