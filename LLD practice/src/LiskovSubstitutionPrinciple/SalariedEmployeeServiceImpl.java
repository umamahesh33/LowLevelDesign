package LiskovSubstitutionPrinciple;

public class SalariedEmployeeServiceImpl implements SalariedEmployeeService{

    @Override
    public String getEmployeeBioData() {
        return "name: umamaheshwar rao\tage: 22";
    }

    @Override
    public int calculateEmployeeSalary() {
        return 100000;
    }
}
