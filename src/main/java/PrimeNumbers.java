import java.util.Scanner;

public class PrimeNumbers {

    public static boolean isPrime ( int number )
    {
        if ( number <= 1 )
        {
            return false;
        }
        else
        {
            for ( int i = 2; i < number; i++ )
            {
                if( number % i == 0 )
                    return false;
            }
            return true;
        }
    }

    public static void main( String[] args ) {
        int number, testNumber;
        Scanner input = new Scanner( System.in );
        testNumber = input.nextInt();

        for ( int j = 0; j < testNumber; j++ ) {
            number = input.nextInt();
            if (isPrime( number ) )
                System.out.println( "TAK" );
            else
                System.out.println( "NIE" );
        }
    }
}
