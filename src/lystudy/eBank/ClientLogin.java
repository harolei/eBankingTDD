package lystudy.eBank;

import lystudy.eBankDao.DBConnection;

/**
 * Created with IntelliJ IDEA.
 * User: leiyu
 * Date: 12-12-31
 * Time: 下午4:23
 * To change this template use File | Settings | File Templates.
 */
public class ClientLogin{
    public String username = "user";
    public String password = "123";
    private DBConnection connection;

    public ClientLogin(){
        connection = new DBConnection();
    }
    public boolean findUser() {
        boolean result = false;
        result = connection.findUser(username,password);
        return result;
    }
}
