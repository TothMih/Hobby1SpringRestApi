package hu.tothmih.demo.service;

import hu.tothmih.demo.model.Coordinator;
import hu.tothmih.demo.repo.interfaces.CoordinatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoordinatorService {
    @Autowired
    CoordinatorRepository coordinatorRepository;

    public List<Coordinator> getAllCoordinator(){
        List<Coordinator> coordinators=new ArrayList<>();
        coordinatorRepository.findAll().forEach(coordinator -> coordinators.add(coordinator));
        return coordinators;
    }

    public Coordinator getCoordinatorById(Long id){
        return coordinatorRepository.findById(id).get();
    }

    public void saveOrUpdate(Coordinator coordinator){
        coordinatorRepository.save(coordinator);
    }

    public void delete(Long id){
        coordinatorRepository.deleteById(id);
    }

    public void update(Coordinator coordinator, Long id) {
        coordinatorRepository.save(coordinator);
    }
}
