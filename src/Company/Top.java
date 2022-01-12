package Company;

public class Top {
    CompanyBuilder builder;

    public void setBuilder(CompanyBuilder builder) {
        this.builder = builder;
    }
    Company buildCompany() {
        builder.createCompany();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        Company company = builder.getCompany();

        return company;
    }
}
