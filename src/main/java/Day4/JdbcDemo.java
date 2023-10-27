package Day4;
import java.sql.*;
public class JdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
     Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Hello");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itc-javadb","root","Proton321*");
        System.out.println("connected");

        Statement st1=con.createStatement();
        // excuteQuery method to excecute Select Query
        ResultSet rs=st1.executeQuery("select * from cust");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }

        // executeUpdate method for upd.del,insert query
        int status=st1.executeUpdate("update cust set cname='sunil' where id=3");
        System.out.println(status);
        System.out.println("Updated");

        int sts=st1.executeUpdate("delete from cust where id=3");
        System.out.println(sts + "data got deleted");

        int nor=st1.executeUpdate("insert into cust values(10,'rohit','Mum',33)");
        System.out.println(nor + "row added");
    }
}
