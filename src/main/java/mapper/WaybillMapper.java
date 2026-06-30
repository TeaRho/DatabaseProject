package mapper;

import model.Waybill;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WaybillMapper {

    List<Waybill> findAll();

    Waybill findById(Integer waybillid);

    List<Waybill> findByStatus(String status);

    int insert(Waybill waybill);

    int update(Waybill waybill);

    int updateTotalFreight(Integer waybillid);

    int delete(Integer waybillid);

}