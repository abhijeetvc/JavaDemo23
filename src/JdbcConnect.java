import java.sql.*;
import java.util.Scanner;

public class JdbcConnect {

    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pst;
    public JdbcConnect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/fullstackdb","root","jesus");
            stmt=con.createStatement();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    void getData() throws SQLException {
      //  try {

            rs=stmt.executeQuery("select * from employee");

            while(rs.next()){
                System.out.println("Id : "+rs.getInt(1));
                System.out.println("Name : "+rs.getString(2));
                System.out.println("City : "+rs.getString(3));
                System.out.println();
            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
    }

    void insertData(){
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter id: ");
            int id=sc.nextInt();

            System.out.println("Enter name: ");
            String name=sc.next();

            System.out.println("Enter City: ");
            String city=sc.next();

           // stmt.execute("insert into employee values(3,'C','Chennai')");

            pst=con.prepareStatement("insert into employee values(?,?,?)");
            pst.setInt(1,id);
            pst.setString(2,name);
            pst.setString(3,city);

            pst.execute();
            System.out.println("Data inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void deleteData(){

    }

    void updateData(){

    }

    public static void main(String[] args) {
        JdbcConnect jc=new JdbcConnect();
        jc.insertData();
        try {
            jc.getData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
