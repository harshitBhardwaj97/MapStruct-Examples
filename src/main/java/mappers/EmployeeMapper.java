package mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pojos.Employee;
import pojos.EmployeeDTO;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(source = "employeeName", target = "name")
    @Mapping(source = "employeeId", target = "id")
    EmployeeDTO employeeToEmployeeDTO(Employee employee);

    @Mapping(source = "name", target = "employeeName")
    @Mapping(source = "id", target = "employeeId")
    Employee employeeDTOToEmployee(EmployeeDTO employeeDTO);
}