package hu.tothmih.demo.service;

import hu.tothmih.demo.model.Department;
import hu.tothmih.demo.repo.interfaces.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> getAllDepartment(){
        List<Department> departments=new ArrayList<>();
        departmentRepository.findAll().forEach(department -> departments.add(department));
        return departments;
    }

    public Department getDepartmentById(Long id){
        return departmentRepository.findById(id).get();
    }

    public void saveOrUpdate(Department department){
        departmentRepository.save(department);
    }

    public void delete(Long id){
        departmentRepository.deleteById(id);
    }

    public void update(Department department, Long id) {
        departmentRepository.save(department);
    }
}
