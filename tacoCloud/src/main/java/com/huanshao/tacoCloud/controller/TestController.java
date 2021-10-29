package com.huanshao.tacoCloud.controller;

import com.huanshao.tacoCloud.bean.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
//    @Autowired
//    JdbcIngredientRepository jdbcIngredientRepository;

    @GetMapping("/test")
    public String testjdbcApi() {
        Ingredient ingredient = null;
//        ingredient = jdbcIngredientRepository.findOne("GRBF");
        System.out.println(ingredient);
        return null;
    }
}
