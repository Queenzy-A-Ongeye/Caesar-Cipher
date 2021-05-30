

import org.junit.Test;
import static org.junit.Assert.*;

public class EncryptTest {

    @Test
    public void runEncrypt_instantiates(){
        Encrypt testEncrypt = new Encrypt("abc",2);
        assertEquals(true, testEncrypt instanceof Encrypt);
    }

    @Test
    public void runEncrypt_ifInputIsString() {
        Encrypt testEncrypt = new Encrypt("abc",3);
        assertEquals("abc", testEncrypt.getmInputString());
    }

    @Test
    public void runDecrypt_ifKeyIsInt() {
        Encrypt testEncrypt = new Encrypt("abc",2);
        assertEquals(2, testEncrypt.getmShift());
    }
    @Test
    public void runEncrypt_ifEncryptsVariousInputs() {
        Encrypt testEncrypt = new Encrypt("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 3);
        // does not decrypt integers and other characters but returns them as is
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",Encrypt.encrypt(testEncrypt));
    }
}