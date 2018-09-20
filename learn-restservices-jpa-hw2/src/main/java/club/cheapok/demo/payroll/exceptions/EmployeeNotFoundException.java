package club.cheapok.demo.payroll.exceptions;

public class EmployeeNotFoundException extends RuntimeException {


    public EmployeeNotFoundException(Long aLong) {
        super("No Employee with id: "+aLong+" found.");

    }
}
