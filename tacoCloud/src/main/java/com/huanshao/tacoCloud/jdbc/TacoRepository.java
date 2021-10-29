package com.huanshao.tacoCloud.jdbc;

import com.huanshao.tacoCloud.bean.Taco;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TacoRepository extends CrudRepository<Taco, Long> {

    List<Taco> findAll(PageRequest page);
}
