package fpt.aptech.assignment1.service;

import org.modelmapper.ModelMapper;
import  fpt.aptech.assignment1.mapper.*;
import  fpt.aptech.assignment1.dto.*;
import  fpt.aptech.assignment1.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class DepartmentService {
    private  ModelMapper modelMapper;
    private  DepartmentMapper departmentMapper;

    @Autowired
    public DepartmentService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public DepartmentDTO getDepartmentDTOUsingModelMapper(Department department) {
        return modelMapper.map(department, DepartmentDTO.class);
    }
    public Department getDepartmentUsingModelMapper(DepartmentDTO departmentDTO) {
        return modelMapper.map(departmentDTO, Department.class);
    }

    public DepartmentDTO getDepartmentDTOUsingMapStruct(Department department) {
        return departmentMapper.toDepartmentDTO(department);
    }

    public Department getDepartmentUsingMapStruct(DepartmentDTO departmentDTO) {
        return departmentMapper.toDepartment(departmentDTO);
    }
}
