import Common.Comm;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.omg.CORBA.PUBLIC_MEMBER;

public class Frame {

    Comm ild=new Comm();
    @Before
    public void open()
    {
        ild.open();
    }

    @After
    public void close(){
        ild.close();

    }
}
