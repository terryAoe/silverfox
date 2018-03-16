package com.wkzuche.crawler.dao;

import java.sql.SQLException;
import java.util.List;

import com.wkzuche.crawler.pojo.City;

public interface CityDao {
	//public City queryOneCity(Object params) throws SQLException;
	
	public City queryOneCityById(int cityId) throws SQLException;
	
	public City queryOneCityByName(String cityName) throws SQLException;
	
	public List<City> queryCities(Object params) throws SQLException;
	
	public List<City> queryAllCities() throws SQLException;
	
	public int updateCity(Object params) throws SQLException;
	
	public int deleteCity(Object params) throws SQLException;
	
	public int insertCity(Object params) throws SQLException;
	
	
}
