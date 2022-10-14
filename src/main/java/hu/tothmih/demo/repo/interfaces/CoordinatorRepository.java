package hu.tothmih.demo.repo.interfaces;

import org.springframework.data.repository.CrudRepository;
import hu.tothmih.demo.model.Coordinator;

public interface CoordinatorRepository extends CrudRepository<Coordinator,Long> {
}
