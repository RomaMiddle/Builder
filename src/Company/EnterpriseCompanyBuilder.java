package Company;

public class EnterpriseCompanyBuilder extends CompanyBuilder{

    @Override
    void buildName() {
        company.setName("Enterprise company ");
    }

    @Override
    void buildCms() {
    company.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
    company.setPrice(15000);
    }
}
