package ie.employee.data;

public class Employee
{
    private String firstName;
    private String lastName;
    private String sex;
    private String yrs;
    private String date_stopped;
    private String tea;
    private String excited_about;
    private String continent;
    private String selenium_commands;

    public Employee (String firstName,
                     String lastName,
                     String sex,
                     String yrs,
                     String date_stopped,
                     String tea,
                     String excited_about,
                     String continent,
                     String selenium_commands)
    {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.yrs = yrs;
        this.date_stopped = date_stopped;
        this.tea = tea;
        this.excited_about = excited_about;
        this.continent = continent;
        this.selenium_commands = selenium_commands;
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

    public String getSex ()
    {
        return sex;
    }

    public void setSex (String sex)
    {
        this.sex = sex;
    }

    public String getYrs ()
    {
        return yrs;
    }

    public void setYrs (String yrs)
    {
        this.yrs = yrs;
    }

    public String getDate_stopped ()
    {
        return date_stopped;
    }

    public void setDate_stopped (String date_stopped)
    {
        this.date_stopped = date_stopped;
    }

    public String getTea ()
    {
        return tea;
    }

    public void setTea (String tea)
    {
        this.tea = tea;
    }

    public String getExcited_about ()
    {
        return excited_about;
    }

    public void setExcited_about (String excited_about)
    {
        this.excited_about = excited_about;
    }

    public String getContinent ()
    {
        return continent;
    }

    public void setContinent (String continent)
    {
        this.continent = continent;
    }

    public String getSelenium_commands ()
    {
        return selenium_commands;
    }

    public void setSelenium_commands (String selenium_commands)
    {
        this.selenium_commands = selenium_commands;
    }

}
