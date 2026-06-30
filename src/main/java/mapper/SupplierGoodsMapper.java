package mapper;

import model.SupplierGood;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SupplierGoodsMapper {

    List<SupplierGood> findAll();

    List<SupplierGood> findBySupplier(Integer suppid);

    List<SupplierGood> findByGoods(Integer goodsid);

    int insert(SupplierGood supplierGoods);

    int delete(Integer suppid, Integer goodsid);

}