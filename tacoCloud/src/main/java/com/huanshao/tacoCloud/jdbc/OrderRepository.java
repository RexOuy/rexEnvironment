package com.huanshao.tacoCloud.jdbc;

import com.huanshao.tacoCloud.bean.Order;
import com.huanshao.tacoCloud.bean.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    /**
     * 按邮编查找订单
     * @param zip
     * @return
     */
    List<Order> findByZip(String zip);

    List<Order> readOrdersByZipAndCreatedAtBetween(String zip, Date startDate, Date endDate);

    List<Order> findByStreetAndCityAllIgnoreCase(String street, String city);

    List<Order> findByUserOrderByCreatedAtDesc(User user, Pageable pageable);
}
