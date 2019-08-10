import Commonfn.Common;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Framewo {
    Common Rentlib = new Common();

    @Before
    public void open(){
        Rentlib.open();

    }

    @After
    public void close(){
        Rentlib.close();
    }
}
