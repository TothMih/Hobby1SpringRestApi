package hu.tothmih.demo.repo.interfaces;

import hu.tothmih.demo.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,Long> {
}
