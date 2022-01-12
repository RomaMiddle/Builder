package Company;

public class BuildCompanyClient {
    public static void main(String[] args) {
        Top top = new Top();

        top.setBuilder(new EnterpriseCompanyBuilder());
        Company company = top.buildCompany();

        System.out.println(company);
    }
}
