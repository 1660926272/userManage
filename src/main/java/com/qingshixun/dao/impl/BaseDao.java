package com.qingshixun.dao.impl;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

public interface BaseDao<T> {

//委屈委屈恶趣味
	public UserDetails findByUsername(String username);
    public List<T> findAll();
}
