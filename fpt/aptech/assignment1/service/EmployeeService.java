package fpt.aptech.assignment1.service;

import org.modelmapper.ModelMapper;
import  fpt.aptech.assignment1.mapper.*;
import  fpt.aptech.assignment1.dto.*;
import  fpt.aptech.assignment1.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class EmployeeService {
    private ModelMapper modelMapper;
    private EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    public EmployeeDTO getEmployeeDTOUsingModelMapper(Employee employee) {
        return modelMapper.map(employee, EmployeeDTO.class);
    }

    public Employee getEmployeeUsingModelMapper(EmployeeDTO employeeDTO) {
        return modelMapper.map(employeeDTO, Employee.class);
    }
    public EmployeeDTO getEmployeeDTOUsingMapStruct(Employee employee) {
        return employeeMapper.toEmployeeDTO(employee);
    }

    public Employee getEmployeeUsingMapStruct(EmployeeDTO employeeDTO) {
        return employeeMapper.toEmployee(employeeDTO);
    }
}
