package mapper;

import model.Inventory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InventoryMapper {

    List<Inventory> findAll();

    Inventory findById(Integer inventoryid);

    Inventory findByWarehouseAndGoods(Integer whid, Integer goodsid);

    int insert(Inventory inventory);

    int update(Inventory inventory);

    int updateQuantity(Integer inventoryid, Integer quantity);

    int delete(Integer inventoryid);

}