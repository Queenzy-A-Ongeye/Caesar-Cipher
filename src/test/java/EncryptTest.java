import org.junit.Test;
import static org.junit.Assert.*;


public class EncryptTest {

    public EncryptTest(String abc, int i) {
    }

    @Test
    public void runEncrypt_instantiates() {
        Encrypt testEncrypt = new Encrypt("abc", 2);
        assertEquals(true, testEncrypt instanceof Encrypt);
    }

    @Test
    public void runEncrypt_ifInputIsString(){
        Encrypt testEncrypt = new Encrypt("abc", 3);
        assertEquals("abc", testEncrypt.getPlainText());
    }

}