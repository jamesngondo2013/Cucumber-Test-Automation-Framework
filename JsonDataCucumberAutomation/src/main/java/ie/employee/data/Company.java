package ie.employee.data;

import java.util.List;

public class Company
{

    public Company (List<Employee> emp)
    {
        super();
        this.emp = emp;
    }

    private List<Employee> emp;

    public Company ()
    {
        // TODO Auto-generated constructor stub
    }

    public List<Employee> getEmp ()
    {
        return emp;
    }

    public void setEmp (List<Employee> emp)
    {
        this.emp = emp;
    }

}
