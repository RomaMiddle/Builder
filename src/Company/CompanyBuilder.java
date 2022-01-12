package Company;

public abstract class CompanyBuilder {
   Company company;

   void createCompany(){
       company = new Company();
   }
   abstract void buildName();
   abstract  void buildCms();
   abstract void buildPrice();

  Company getCompany(){
     return company;
  }

}
