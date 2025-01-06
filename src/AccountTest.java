import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account1;
    anotherAccount account2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        account1 = new Account("John", 1000);
        account2 = new anotherAccount("Jane", 500);
    }

    @Test

    void deposit() {

        assertEquals(1000, account1.balance);


        account1.deposit();


        assertEquals(1500, account1.balance);
    }

    @Test
    void withdraw() {

        assertEquals(1000, account1.balance);


        account1.withdraw();


        assertEquals(700, account1.balance);


        account1.withdraw();


        assertEquals(700, account1.balance);
    }

    @Test
    void checkBalance() {

        assertEquals(1000, account1.balance);
    }

    @Test
    void transfer() {

        assertEquals(1000, account1.balance);
        assertEquals(500, account2.balance);


        account1.transfer(account2, 200);


        assertEquals(800, account1.balance);
        assertEquals(700, account2.balance);


        account1.transfer(account2, 1000);


        assertEquals(800, account1.balance);
        assertEquals(700, account2.balance);
    }
}
