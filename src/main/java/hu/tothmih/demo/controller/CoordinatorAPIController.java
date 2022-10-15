package hu.tothmih.demo.controller;

import hu.tothmih.demo.model.Coordinator;
import hu.tothmih.demo.service.CoordinatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoordinatorAPIController {
    @Autowired
    CoordinatorService service;

    @GetMapping(value = "/coordinator",name = "List of all coordinators.")
    public List<Coordinator> getAllCoordinators(){
        return service.getAllCoordinator();
    }

    @PostMapping(value = "/coordinator",name = "Save coordinator")
    private long saveCoordinator(@RequestBody Coordinator coordinator){
        service.saveOrUpdate(coordinator);
        return coordinator.getId();
    }

    @PutMapping(value = "/api/subject", name ="Update coordinator")
    private Coordinator update(@RequestBody Coordinator coordinator){
        service.saveOrUpdate(coordinator);
        return coordinator;
    }

    @DeleteMapping(value = "/api/coordinator/{coordinatorid}", name ="Delete coordinator")
    private void deleteCoordinator(@PathVariable("coordinatorid") Long coordinatorid){
        service.delete(coordinatorid);
    }
}
