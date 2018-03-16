package com.wkzuche.crawler.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;

public class CommonDao {
	private SqlSessionTemplate sqlSession;
	
	private String namespace;
	public CommonDao() {
	}
	
	/**
	 * 获取一条查询结果
	 * @param namespace
	 * @param params
	 * @return
	 */
	public Object selectOne(String namespace, Object params){
		return this.sqlSession.selectOne(namespace, params);
	}
	
	public Object selectList(String namespace,Object params){
		return this.sqlSession.selectList(namespace, params);
	}
	
	public Object selectMap(String namespace,String params){
		return this.sqlSession.selectMap(namespace, params);
	}
	
	public int insert(String namespace, Object params){
		return this.sqlSession.insert(namespace, params);
	}
	
	public int update(String namespace , Object params){
		return this.sqlSession.update(namespace, params);
	}
	
	public int delete(String namespace , Object params){
		
		return this.sqlSession.delete(namespace, params);
	}
	
	
	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = "com.wkzuche.crawler.dao." + namespace + ".";
	}
	
	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	
	
	
	
	
	
}
