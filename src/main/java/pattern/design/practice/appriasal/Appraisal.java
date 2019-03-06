package pattern.design.practice.appriasal;

public class Appraisal {
  
  private Company company;
  private static final int MINIMUM_RESEARCH_PAPERS=2;
  private static final int MINIMUM_EXP_WITHIN_ORG=5;
  private static final String AWARD_WON="starOfTheYear";

  public Appraisal(Company company) {
    super();
    this.company = company;
  }
  
  public void startAppriasalProcess(){
    for(Employee employee:company.getEmployeList()){
      if(employee.listOfAwards().size()>=MINIMUM_RESEARCH_PAPERS
          && employee.yearOfExpInOrganisation()>=MINIMUM_EXP_WITHIN_ORG 
          && employee.listOfAwards().contains(AWARD_WON)){
          giveApprasial(employee);
      }
    }
  }

  private void giveApprasial(Employee employee){
    EmployeImpl  empl=(EmployeImpl)employee;
    empl.setSalary(empl.getSalary()+empl.getSalary()+5/100);
    System.out.println("New Apprised Salary is :: "+empl.getSalary());
  }
  
  

}
