package mapper;

import model.Warehouse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WarehouseMapper {

    List<Warehouse> findAll();

    Warehouse findById(Integer whid);

    List<Warehouse> findByCity(Integer cityid);

    int insert(Warehouse warehouse);

    int update(Warehouse warehouse);

    int delete(Integer whid);

}