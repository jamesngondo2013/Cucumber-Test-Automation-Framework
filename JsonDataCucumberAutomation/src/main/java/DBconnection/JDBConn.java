package DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ie.employee.data.Employee;

public class JDBConn {
    
    static List<Employee> emp;

    public List<Employee> getDBData(){
        
        Connection con = null;
        emp = new ArrayList<Employee>();
       
        try {
            con = (Connection)DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/automation?useSSL=false&amp", "root", "chingotah9070");
            
            if (con!=null) {
                System.out.println("connected successfully...");
                
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(
                    "select * FROM automation.employees");
                while (rs.next()) {
                    String fname = rs.getString("fname");
                    String lname = rs.getString("lname");
                    String sex = rs.getString("gender");
                    String age = rs.getString("age");
                    String date = rs.getString("date");
                    String tea = rs.getString("tea");
                    String excited_about = rs.getString("excited");
                    String continent = rs.getString("continent");
                    String commands = rs.getString("commands");
                    
                    emp.add(new Employee(fname,lname,sex,age,date,tea,excited_about,continent,commands));
            
                }

               
            }
         
        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("cannot connect to database...");
        }
      
        
        return emp;
        
    }
}
