package com.backend.app.mause.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.backend.app.mause.models.entity.Mause;


public interface MauseDao extends CrudRepository<Mause, Long>{

	static Mause setMause(String name, String marca) {
		Mause mause = new Mause();
		mause.setName(name);
		mause.setMarca(marca);
        return mause;
    }
}
