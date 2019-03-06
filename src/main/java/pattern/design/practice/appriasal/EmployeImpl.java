package pattern.design.practice.appriasal;

import java.util.List;

public class EmployeImpl implements Employee {

  private String name;
  private int age;
  private int Depptt;
  private int yearOfExpInOrganisation;
  private Long getId;
  private List<String> listOfAwards;
  private List<String> listOfPapersPublished; 
  private Double salary;
  
  public EmployeImpl(String name, int age, int depptt, int yearOfExpInOrganisation, Long getId,
      List<String> listOfAwards, List<String> listOfPapersPublished,double salary) {
    super();
    this.name = name;
    this.age = age;
    Depptt = depptt;
    this.yearOfExpInOrganisation = yearOfExpInOrganisation;
    this.getId = getId;
    this.listOfAwards = listOfAwards;
    this.listOfPapersPublished = listOfPapersPublished;
    this.salary=salary;
  }

  @Override
  public String getName() {
    // TODO Auto-generated method stub
    return this.name;
  }

  @Override
  public int getDeppttId() {
    // TODO Auto-generated method stub
    return this.Depptt;
  }

  @Override
  public int getAge() {
    // TODO Auto-generated method stub
    return this.age;
  }

  @Override
  public int yearOfExpInOrganisation() {
    // TODO Auto-generated method stub
    return this.yearOfExpInOrganisation;
  }

  @Override
  public Long getID() {
    // TODO Auto-generated method stub
    return this.getId;
  }

  @Override
  public List<String> listOfAwards() {
    // TODO Auto-generated method stub
    return this.listOfAwards;
  }

  @Override
  public List<Papers> listOfPapersPublished() {
    // TODO Auto-generated method stub
    return this.listOfPapersPublished();
  }

  @Override
  public String toString() {
    return "EmployeImpl [name=" + name + ", age=" + age + ", Depptt=" + Depptt
        + ", yearOfExpInOrganisation=" + yearOfExpInOrganisation + ", getId=" + getId
        + ", listOfAwards=" + listOfAwards + ", listOfPapersPublished=" + listOfPapersPublished
        + "]";
  }

  @Override
  public Double getSalary() {
    // TODO Auto-generated method stub
    return this.salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }
  
  
  
  

}
