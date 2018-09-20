package club.cheapok.demo.payroll.repos;

import club.cheapok.demo.payroll.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
