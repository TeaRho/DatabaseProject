package mapper;

import model.Region;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RegionMapper {

    List<Region> findAll();

    Region findById(Integer regionid);

    int insert(Region region);

    int update(Region region);

    int delete(Integer regionid);

}