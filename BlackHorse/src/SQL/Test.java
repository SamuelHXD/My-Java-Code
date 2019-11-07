package SQL;

//导入包
import java.sql.*;

/*
 * 数据库连接
 */
public class Test {
    public static void main(String args[])
    {
        Statement statement=null;
        ResultSet resultset=null;
        Connection conn=null;
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.创建连接
            /****其中library是我创建的数据库名，
             root是我数据库用户名，
             "123456"是我数据库密码********/
            String url="jdbc:mysql://180.76.142.108:3306/db1?&useSSL=false&serverTimezone=UTC";
            conn = DriverManager.getConnection(url,"rdsroot","016291bia");
            //3.sql语句
            String sql="select * from employee";
            //4.得到statement对象
            statement = conn.prepareStatement(sql);
            //5.执行sql
            resultset = statement.executeQuery(sql);
            // 6.处理结果集
            while(resultset.next())
            {
                System.out.print("name: "+resultset.getString(1));
                System.out.print("\t");
                System.out.println("position: "+ resultset.getString("position"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            //7.关闭连接
            if (resultset!=null){
                try{
                    resultset.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try{
                    conn.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            if(statement!=null) {
                try{
                    statement.close();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
