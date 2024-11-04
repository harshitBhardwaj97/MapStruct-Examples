package mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pojos.SimpleDestination;
import pojos.SimpleSource;

@Mapper
public interface SimpleSourceDestinationMapper {

    SimpleSourceDestinationMapper INSTANCE = Mappers.getMapper(SimpleSourceDestinationMapper.class);

    @Mapping(source = "sourceName", target = "destinationName")
    @Mapping(source = "sourceDescription", target = "destinationDescription")
    SimpleDestination sourceToDestination(SimpleSource source);

    @Mapping(source = "destinationName", target = "sourceName")
    @Mapping(source = "destinationDescription", target = "sourceDescription")
    SimpleSource destinationToSource(SimpleDestination destination);
}