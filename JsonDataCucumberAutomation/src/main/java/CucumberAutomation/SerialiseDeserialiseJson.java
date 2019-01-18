package CucumberAutomation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import DBconnection.JDBConn;
import ie.employee.data.Company;
import ie.employee.data.Employee;
import ie.employee.data.Person;


/**
 * Hello world!
 */
public class SerialiseDeserialiseJson
{
    private static String jsonPerson;
    private static String jsonEmployee;
    static List<Employee> emp;

    public static void main (String[] args)
    {

        try {
           // serializeEmployeeJsonData();
            serializeEmployeeJsonDataFromDB();
            deserializeEmployeeJsonData();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void serializeEmployeeJsonDataFromDB () throws IOException
    {
        JDBConn conn = new JDBConn();
        emp = conn.getDBData();
       
        //add to comp and create a json output file -- serializing "outputEmployee.json"
        Company comEmpl = new Company(emp);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileOutputStream out = new FileOutputStream("outputEmployee.json");
        out.write(gson.toJson(comEmpl).getBytes());
        out.flush();
        out.close();
        
        for (Employee employee : emp) {
            System.out.println("First Name:" +employee.getFirstName() );
            System.out.println("Last Name:" + employee.getLastName());
            System.out.println("Sex:" +employee.getSex() );
            System.out.println("Date:" + employee.getDate_stopped());
            System.out.println("Tea:" +employee.getTea() );
            System.out.println("Excited:" + employee.getExcited_about());
            System.out.println("Continent:" +employee.getContinent());
            System.out.println("Commands:" + employee.getSelenium_commands());
        }
        
    }

    public static void serializeEmployeeJsonData () throws IOException
    {

        emp = new ArrayList<Employee>();
        emp.add(new Employee(
            "James",
            "Joel",
            "Male",
            "20",
            "10/10/2000",
            "Black",
            "Travel",
            "USA",
            "Browser Commands"));
        emp.add(new Employee(
            "Caroline",
            "Cool",
            "Female",
            "30",
            "10/10/2008",
            "Green",
            "Footbal",
            "Europe",
            "Browser Commands"));
        emp.add(new Employee(
            "Conor",
            "Craig",
            "Male",
            "16",
            "10/10/1989",
            "Black",
            "Travel",
            "Asia",
            "Browser Commands"));

        Company comEmpl = new Company(emp);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileOutputStream out = new FileOutputStream("outputEmployee.json");
        out.write(gson.toJson(comEmpl).getBytes());
        out.flush();
        out.close();
    }
// reading the created json file -- deserialization of "outputEmployee.json"
    public static void deserializeEmployeeJsonData () throws IOException
    {
        FileInputStream fin = new FileInputStream(new File("outputEmployee.json"));
        InputStreamReader in = new InputStreamReader(fin);
        BufferedReader bufferedReader = new BufferedReader(in);
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
        }
        jsonEmployee = sb.toString();
        System.out.println(jsonEmployee);

    }

    public static void serializeJsonData () throws IOException
    {
        Person emp = new Person();
        emp.setFirstName("James");
        emp.setLastName("Ngondo");
        emp.setRoles(Arrays.asList("ADMIN", "MANAGER"));
        emp.setId(200533);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileOutputStream out = new FileOutputStream("output.json");
        out.write(gson.toJson(emp).getBytes());
        out.flush();
        out.close();
    }

    public static void deserializeJsonData () throws IOException
    {
        FileInputStream fin = new FileInputStream(new File("output.json"));
        InputStreamReader in = new InputStreamReader(fin);
        BufferedReader bufferedReader = new BufferedReader(in);
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
        }
        jsonPerson = sb.toString();
        // System.out.println(json);
        Gson gson = new Gson();
        Person employee = gson.fromJson(jsonPerson, Person.class);

        System.out.println(jsonPerson);
        JsonParser parser = new JsonParser();
        JsonObject myobject = (JsonObject)parser.parse(jsonPerson);
        // Accessing the value of "first"
        System.out.println(myobject.get("lastName").getAsString());

    }

    public static String getJsonString ()
    {
        return jsonPerson;
    }

    public static String getJsonEmployeeString ()
    {
        return jsonEmployee;
    }
}
