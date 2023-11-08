package com.backend.app.mause.models.service;

import java.util.List;

import com.backend.app.mause.models.entity.Mause;


public interface MauseService {
	/**
	 * Este metodo retorna todo un listado de mause's
	 * @return
	 */
	public List <Mause> findAll();
	
	public Mause findById (Long id);
	
    // post
    public Mause setMause(String name, String marca);

    // put
    public Mause save(Mause updateMause);
	
}
