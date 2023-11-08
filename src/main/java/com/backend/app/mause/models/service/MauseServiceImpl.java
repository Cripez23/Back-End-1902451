package com.backend.app.mause.models.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.app.mause.models.dao.MauseDao;
import com.backend.app.mause.models.entity.Mause;





@Service
public class MauseServiceImpl implements MauseService {
	
	@Autowired
	private MauseDao mausedao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Mause> findAll() {
		return (List<Mause>) mausedao.findAll();
	}

	@Override
	@Transactional (readOnly = true)
	public Mause findById(Long id) {
		return mausedao.findById(id).orElse(null);
	}
	
    // post
    @Override
    @Transactional(readOnly = true)
    public Mause setMause(String name, String marca) {
    	return MauseDao.setMause(name, marca);
    }

    // put
    @Override
    @Transactional(readOnly = true)
    public Mause save(Mause updateMause) {
        return mausedao.save(updateMause);
    }
	

}
