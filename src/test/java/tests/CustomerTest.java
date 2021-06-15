package tests;

import Customer.Customer;
import Customer.CustomerImpl;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CustomerTest {


    @Test
    public void NameNullTest(){
        Exception exception = Assertions.assertThrows(RuntimeException.class, ()->{
            Customer  customer = new CustomerImpl(
                    null,30,"Hungary","Kispéntek 6");
        });

        String exceptedMessage = "A név nem lehet null!";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(exceptedMessage));
    }

    @Test
    public void NameTooShortTest(){

        Exception exception = Assertions.assertThrows(RuntimeException.class, ()->{
            Customer customer = new CustomerImpl(
                    "e",50,"Hungary","Kispéntek 6");
        });
        String expectedMessage = "A név legalább 2 karakter!";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void AgeZeroOrNegativeTest(){

        Exception exception = Assertions.assertThrows(RuntimeException.class, ()->{
            Customer customer = new CustomerImpl(
                    "Valami",-5,"Hungary","Kispéntek 6");
        });
        String expectedMessage = "A vásárló életkora nem lehet negatív vagy 0!";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void AgeAbove120Test(){

        Exception exception = Assertions.assertThrows(RuntimeException.class, ()->{
            Customer customer = new CustomerImpl(
                    "Valami",125,"Hungary","Kispéntek 6");
        });
        String expectedMessage = "A vásárló életkora nem lehet több mint 120 év!";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void CountryNullTest(){

        Exception exception = Assertions.assertThrows(RuntimeException.class, ()->{
            Customer customer = new CustomerImpl(
                    "Valami",50,null,"Kispéntek 6");
        });
        String expectedMessage = "A vásárló országa nem lehet null!";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void CountryTooShortTest(){

        Exception exception = Assertions.assertThrows(RuntimeException.class, ()->{
            Customer customer = new CustomerImpl(
                    "Valami",50,"na","Kispéntek 6");
        });
        String expectedMessage = "A vásárló oszága legalább 3 karakter hosszú!";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));

    }


    @Test
    public void AddressNullTest(){

        Exception exception = Assertions.assertThrows(RuntimeException.class, ()->{
            Customer customer = new CustomerImpl(
                    "Valami",50,"Hungary",null);
        });
        String expectedMessage = "A vásárló címe nem lehet null!";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void AddressTooShortTest(){

        Exception exception = Assertions.assertThrows(RuntimeException.class, ()->{
            Customer customer = new CustomerImpl(
                    "Valami",50,"Hungary","ez");
        });
        String expectedMessage = "A vásárló címe legalább 3 karakter!";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));

    }
}
