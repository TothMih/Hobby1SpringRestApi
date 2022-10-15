package hu.tothmih.demo.controller;

import hu.tothmih.demo.model.Department;
import hu.tothmih.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentAPIController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping(value = "/department",name = "List of all departments.")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartment();
    }

    @PostMapping(value = "/department",name = "Save department")
    private long saveDepartment(@RequestBody Department department){
        departmentService.saveOrUpdate(department);
        return department.getId();
    }

    @PutMapping(value = "/department", name ="Update department")
    private Department update(@RequestBody Department department){
        departmentService.saveOrUpdate(department);
        return department;
    }

    @DeleteMapping(value = "/api/department/{departmentid}", name ="Delete department")
    private void deleteDepartment(@PathVariable("departmentid") Long departmentid){
        departmentService.delete(departmentid);
    }
}
