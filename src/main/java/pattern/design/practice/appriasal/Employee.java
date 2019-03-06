package pattern.design.practice.appriasal;

import java.util.List;

public interface Employee {
  public String getName();
  public int getDeppttId();
  public int getAge();
  public int yearOfExpInOrganisation();
  public Long getID();
  public List<String> listOfAwards();
  public List<Papers> listOfPapersPublished();
  public Double getSalary();

}
