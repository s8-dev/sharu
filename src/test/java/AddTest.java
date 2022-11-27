import org.example.Add;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTest {
    Add obj = new Add();

    @Test
    public void addition(){
        assertEquals(20,obj.add(10,10));

    }


}
