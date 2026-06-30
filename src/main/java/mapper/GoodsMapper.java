package mapper;

import model.Good;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {

    List<Good> findAll();

    Good findById(Integer goodsid);

    List<Good> findByCategory(String category);

    int insert(Good goods);

    int update(Good goods);

    int delete(Integer goodsid);

}