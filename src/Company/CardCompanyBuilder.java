package Company;

public class CardCompanyBuilder extends CompanyBuilder{

    @Override
    void buildName() {
        company.setName("Card");
    }

    @Override
    void buildCms() {
     company.setCms(Cms.WORDKEY);
    }

    @Override
    void buildPrice() {
   company.setPrice(150);
    }
}
