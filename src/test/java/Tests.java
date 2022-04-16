import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    void checkIfOneIsPrimeNumber() {
        assertEquals(false, PrimeNumbers.isPrime(1) );
    }

    @Test
    void checkNegativeNumber(){
        assertEquals(false, PrimeNumbers.isPrime(-1) );
    }
}
