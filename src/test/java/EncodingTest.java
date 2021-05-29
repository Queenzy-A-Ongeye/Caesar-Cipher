import org.junit.Test;
import static org.junit.Assert.*;


public class EncodingTest{
    @Test
    public void runEncode_instantiates(){
        Encoding testEncoding = new Encoding("abc", 3);
        assertEquals(false, testEncoding instanceof Encoding);
    }
}