package Day5;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDemo {
    Scanner s=new Scanner(System.in);
  public static Connection con=null;
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        PreparedStatementDemo psd=new PreparedStatementDemo();
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/itc-javadb","root","Proton321*");
        System.out.println("Connected..");
//        psd.insertIntoDB();

//        psd.DeleteById();
//        psd.updateDb();
        psd.fetchData();
    }

    public void insertIntoDB() throws SQLException {

        System.out.println("Enter Id");
        int id=s.nextInt();
        System.out.println("Enter Cust Name :");
        String name=s.next();
        System.out.println("Enter Address :");
        String addrs=s.next();
        System.out.println("Enter Age : ");
        int age=s.nextInt();
        PreparedStatement ps1= con.prepareStatement("insert into cust values(?,?,?,?)");
        ps1.setInt(1,id);
        ps1.setString(2,name);
        ps1.setString(3,addrs);
        ps1.setInt(4,age);
        ps1.executeUpdate();
        System.out.println("Inserted..");
    }

    public void DeleteById() throws SQLException {
        System.out.println("Enter address to be deleted");
        String addr=s.next();
        PreparedStatement ps2=con.prepareStatement("delete from cust where address=?");
        ps2.setString(1,addr);
        ps2.executeUpdate();
        System.out.println("deleted 1 row");
    }
    public void updateDb() throws SQLException {
        System.out.println("Enter the id to be updated");
        int id=s.nextInt();
        System.out.println("Eneter new Address");
        String addr=s.next();
        PreparedStatement ps3=con.prepareStatement("update cust set address=? where id=?");
        ps3.setString(1,addr);
        ps3.setInt(2,id);
        ps3.executeUpdate();
        System.out.println("Updated..");
    }
    public void fetchData() throws SQLException {
        System.out.println("Enter the pattern for cname :");
        String pat=s.next();
        PreparedStatement ps4=con.prepareStatement("select * from cust where cname like ?");
        ps4.setString(1,pat);
        ResultSet rs=ps4.executeQuery();
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
    }
}
