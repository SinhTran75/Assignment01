package fpt.aptech.assignment1.mapper;
import  fpt.aptech.assignment1.entities.*;
import  fpt.aptech.assignment1.dto.*;
import org.mapstruct.Mapper;

@Mapper
public interface DepartmentMapper {

    DepartmentDTO toDepartmentDTO(Department department);
    Department toDepartment(DepartmentDTO departmentDTO);
}
