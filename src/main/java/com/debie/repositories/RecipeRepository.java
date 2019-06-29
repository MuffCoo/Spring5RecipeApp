package com.debie.repositories;

import org.springframework.data.repository.CrudRepository;

import com.debie.domain.Recipe;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
