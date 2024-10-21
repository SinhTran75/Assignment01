package fpt.aptech.assignment1.mapper;
import  fpt.aptech.assignment1.entities.*;
import  fpt.aptech.assignment1.dto.*;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeMapper {
    EmployeeDTO toEmployeeDTO(Employee employee);
    Employee toEmployee(EmployeeDTO employeeDTO);
}
