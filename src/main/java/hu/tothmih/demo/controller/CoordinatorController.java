package hu.tothmih.demo.controller;

import hu.tothmih.demo.model.Coordinator;
import hu.tothmih.demo.service.CoordinatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CoordinatorController {
    @Autowired
    CoordinatorService service;

    public ModelAndView showCoordinatorList(){
        List<Coordinator> coordinators= service.getAllCoordinator();
        ModelAndView mav=new ModelAndView("coordinators/index");
        mav.addAllObjects("coordinators", coordinators);

        return mav;
    }
}
