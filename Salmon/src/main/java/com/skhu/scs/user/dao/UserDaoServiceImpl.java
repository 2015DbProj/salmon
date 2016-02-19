package com.skhu.scs.user.dao;

import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDaoService")
public class UserDaoServiceImpl extends SqlSessionDaoSupport implements UserDaoService {
	
	@Override
	@Transactional
	public int insertUser(Map<String, String> paramMap) {
		// TODO Auto-generated method stub
		return getSqlSession().insert("user.insertUser",paramMap);
	}

}
