package pattern.design.practice.appriasal;

import java.util.List;

public class Company {
  
  private List<Employee> employeList;
  private String name;
  
  
  public Company(List<Employee> employeList, String name) {
    super();
    this.employeList = employeList;
    this.name = name;
  }
  public List<Employee> getEmployeList() {
    return employeList;
  }
  public void setEmployeList(List<Employee> employeList) {
    this.employeList = employeList;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
 
  
  
  

}
