package LiskovSubstitutionPrinciple;

import java.util.List;

public class SalaryDisburser {
    public void disburseSalaray(List<EmployeeService> employees){
        for(EmployeeService emp: employees){
            System.out.println(emp.getEmployeeBioData());
        }
    }
}
