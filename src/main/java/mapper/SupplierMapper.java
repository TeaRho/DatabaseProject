package mapper;

import model.Supplier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SupplierMapper {

    List<Supplier> findAll();

    Supplier findById(Integer suppid);

    List<Supplier> findByCity(Integer cityid);

    int insert(Supplier supplier);

    int update(Supplier supplier);

    int delete(Integer suppid);

}