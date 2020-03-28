package ie.employee.data;

import java.util.List;

public class Company
{

	private List<Employee> emp;
	  
    public Company (List<Employee> emp)
    {
        super();
        this.emp = emp;
    }

  

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
