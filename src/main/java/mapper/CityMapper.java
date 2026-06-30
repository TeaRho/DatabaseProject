package mapper;

import model.City;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface CityMapper {

    List<City> findAll();

    City findById(Integer cityid);

    List<City> findByRegion(Integer regionid);

    int insert(City city);

    int update(City city);

    int delete(Integer cityid);

}
