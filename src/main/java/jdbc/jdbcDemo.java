package jdbc;
import java.sql.Statement;
import java.sql.*;
public class jdbcDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Hello");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test876","root","Proton321*");
        Statement st= con.createStatement();
        // select Query example
        ResultSet rs=st.executeQuery("select * from cust");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        System.out.println("Connected");
        // update Query Example
        int status=st.executeUpdate("update cust set address='bangalore' where cidd=1");
        if(status==1)
        {
            System.out.println("updated");
        }

        // insert Query Example // commented other wise duplicate insert error will come
       // st.executeUpdate("insert into cust values(3,'sunil','chandi')");

        // delete example
        try {
            int x=st.executeUpdate("delete from cust where cidd=2");
            System.out.println("Deleted");
        }catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }

        // prepared statement demos
        PreparedStatement ps=con.prepareStatement("select * from cust where cidd=?");
        ps.setInt(1,3);
        ResultSet rs1=ps.executeQuery();
        while(rs1.next())
        {
            System.out.println(rs1.getInt(1)+" "+rs1.getString(2));
        }
        // store procedure call
        CallableStatement cst=con.prepareCall("{call sp_getAllCust()}");
        ResultSet rs2=cst.executeQuery();
        while(rs2.next())
        {
            System.out.println(rs2.getInt(1)+" "+rs2.getString(2));
        }

        CallableStatement cst2=con.prepareCall("{call sp_delete_by_id(?)}");
        cst2.setInt(1,3);
        cst2.execute();
        System.out.println("Done");

    }
}
