import org.junit.*;
import static org.junit.Assert.*;

public class DecryptTest {

    @Test
    public void runDecrypt_instantiates(){
        Decrypt testDecrypt = new Decrypt("dahs", 1);
        assertEquals(true, testDecrypt instanceof Decrypt);
    }

    @Test
    public void runDecrypt_ifInputIsString() {
        Decrypt testDecrypt = new Decrypt("dahs", 1);
        assertEquals("dahs", testDecrypt.getmInputString());
    }

    @Test
    public void runDecrypt_ifKeyIsInt() {
        Decrypt testDecrypt = new Decrypt("dahs",1);
        assertEquals(1, testDecrypt.getmShift());
    }
    @Test
    public void runDecrypt_ifDecryptsVariousInputs() {
        Decrypt testDecrypt = new Decrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 3);
        // does not decrypt integers and other characters but returns them as is
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", Decrypt.decrypt(testDecrypt));
    }
}