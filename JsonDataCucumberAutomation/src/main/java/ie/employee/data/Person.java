/**
 * 
 */
package ie.employee.data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author james.ngondo
 */
public class Person
{

    private String firstName;
    private String lastName;
    private int id;
    private List<String> roles = new ArrayList<>();

    public Person ()
    {
        // TODO Auto-generated constructor stub
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public void setRoles (List<String> list)
    {
        this.roles = list;
    }

}
