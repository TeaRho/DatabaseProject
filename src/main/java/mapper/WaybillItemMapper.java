package mapper;

import model.WaybillItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WaybillItemMapper {

    List<WaybillItem> findByWaybill(Integer waybillid);

    WaybillItem findById(Integer itemid);

    int insert(WaybillItem item);

    int update(WaybillItem item);

    int delete(Integer itemid);

    int deleteByWaybill(Integer waybillid);

}