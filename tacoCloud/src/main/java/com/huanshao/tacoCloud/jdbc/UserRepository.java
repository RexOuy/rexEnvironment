package com.huanshao.tacoCloud.jdbc;

import com.huanshao.tacoCloud.bean.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
