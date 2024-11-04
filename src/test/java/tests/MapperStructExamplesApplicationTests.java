package tests;

import mappers.EmployeeMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojos.Employee;
import pojos.EmployeeDTO;

public class MapperStructExamplesApplicationTests {

    private static final Logger logger = LogManager.getLogger(MapperStructExamplesApplicationTests.class);

    @Test
    public void shouldMapEmployeeToEmployeeDTO() {
        logger.info("######### Starting test: shouldMapEmployeeToEmployeeDTO #########");
        Employee employee = new Employee("Harshit Bhardwaj", "SDE-1", "Engineering");
        logger.info("Created Employee: {}", employee);

        EmployeeDTO convertedDto = EmployeeMapper.INSTANCE.employeeToEmployeeDTO(employee);
        logger.info("Converted EmployeeDTO: {}", convertedDto);

        Assert.assertNotNull(convertedDto);
        Assert.assertEquals(convertedDto.name(), employee.getEmployeeName());
        Assert.assertEquals(convertedDto.id(), employee.getEmployeeId());
        Assert.assertEquals(convertedDto.department(), employee.getDepartment());
        logger.info("######### Test completed successfully: shouldMapEmployeeToEmployeeDTO #########");
    }

    @Test
    public void shouldMapEmployeeDTOToEmployee() {
        logger.info("######### Starting test: shouldMapEmployeeDTOToEmployee #########");
        EmployeeDTO employeeDTO = new EmployeeDTO("Harshit Bhardwaj", "SDE-1", "Engineering");
        logger.info("Created EmployeeDTO: {}", employeeDTO);

        Employee convertedEmployee = EmployeeMapper.INSTANCE.employeeDTOToEmployee(employeeDTO);
        logger.info("Converted Employee: {}", convertedEmployee);

        Assert.assertNotNull(convertedEmployee);
        Assert.assertEquals(convertedEmployee.getEmployeeName(), employeeDTO.name());
        Assert.assertEquals(convertedEmployee.getEmployeeId(), employeeDTO.id());
        Assert.assertEquals(convertedEmployee.getDepartment(), employeeDTO.department());
        logger.info("######### Test completed successfully: shouldMapEmployeeDTOToEmployee #########");
    }
}