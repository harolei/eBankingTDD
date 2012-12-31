package lystudy.eBankDao;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: leiyu
 * Date: 12-12-31
 * Time: 下午4:49
 * To change this template use File | Settings | File Templates.
 */
public class DBConnection {
    private String dbUrl = "jdbc:mysql://localhost:3306/eBanking?useUnicode=true&characterEncoding=GB2312";
    private String dbUser = "root";
    private String dbPwd = "root";

    public DBConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public boolean findUser(String username,String password) {
        try {

            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select username,password from user_details where username = '"+username+"'and password = '"+password +"';");
            String dbusername = null;
            String dbpassword = null;
            while(rs.next()){
                dbusername = rs.getString("username");
                dbpassword = rs.getString("password");
            }
            rs.close();
            st.close();
            con.close();
            if(username.equals(dbusername) && password.equals(dbpassword)){
                return true;
            }
            else
                return false;
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return false;
    }
}
