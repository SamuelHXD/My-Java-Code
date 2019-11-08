package SQL;

//导入包
import java.sql.*;

/*
 * 数据库连接
 */
public class Test {
    public static final String URL = "jdbc:mysql://180.76.142.108:3306/db1?&useSSL=false";
    public static final String USER = "rdsroot";
    public static final String PASSWORD = "016291bia";

    public static void main(String args[]) {
        try {
            //1.加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //2. 获得数据库连接
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            //3.操作数据库，实现增删改查
            Statement stmt = conn.createStatement();
            int rs = stmt.executeUpdate("insert into employee values('lisa','hard')");
            //如果有数据，rs.next()返回true

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
