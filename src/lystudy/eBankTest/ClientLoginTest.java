package lystudy.eBankTest;

import lystudy.eBank.ClientLogin;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: leiyu
 * Date: 12-12-31
 * Time: 下午4:12
 * To change this template use File | Settings | File Templates.
 */
public class ClientLoginTest {
    @Test
    public void testClientLogin(){
      ClientLogin login = new ClientLogin();
        if(login.username.equals("user") && login.password.equals("123")){
            assertTrue(login.findUser());
        }

    }
}
