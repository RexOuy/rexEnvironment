package com.huanshao.tacoCloud.jdbc;

import com.huanshao.tacoCloud.bean.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
