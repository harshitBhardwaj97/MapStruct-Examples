import mappers.EmployeeMapper;
import mappers.SimpleSourceDestinationMapper;
import pojos.Employee;
import pojos.EmployeeDTO;
import pojos.SimpleDestination;
import pojos.SimpleSource;

public class MapStructExamplesApplication {

    public static void main(String[] args) {
        System.out.println("========== This is a Map Struct Example Application ==========");
        demonstrateSimpleSourceDestinationMapping();
        demonstrateEmployeeMapping();
        System.out.println("Check out the tests for additional coverage and validation of the mappings!");
        System.out.println("===============================================================================");
    }

    private static void demonstrateSimpleSourceDestinationMapping() {
        System.out.println("Simple Source Instance:");
        SimpleSource simpleSource =
                new SimpleSource("simple source 1", "This is simple source 1");
        System.out.println(simpleSource);
        System.out.println("************************ \n");

        System.out.println("Converting Simple Source to Simple Destination:");
        SimpleDestination simpleDestination = SimpleSourceDestinationMapper.INSTANCE.sourceToDestination(simpleSource);
        System.out.println(simpleDestination);
        System.out.println("************************ \n");
    }

    private static void demonstrateEmployeeMapping() {
        System.out.println("Employee Instance:");
        Employee emp1 = new Employee("emp1", "emp1id", "Engg.");
        System.out.println(emp1);

        System.out.println("EmployeeDTO Instance:");
        EmployeeDTO dto1 = new EmployeeDTO("dto1", "dto1id", "Engg.");
        System.out.println(dto1);
        System.out.println("************************ \n");

        System.out.println("Converting Employee to EmployeeDTO:");
        EmployeeDTO convertedDto = EmployeeMapper.INSTANCE.employeeToEmployeeDTO(emp1);
        System.out.println(convertedDto);

        System.out.println("Converting EmployeeDTO to Employee:");
        Employee convertedEmp = EmployeeMapper.INSTANCE.employeeDTOToEmployee(dto1);
        System.out.println(convertedEmp);
        System.out.println("************************ \n");
    }
}