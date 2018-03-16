package com.wkzuche.crawler.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.wkzuche.crawler.dao.CityDao;
import com.wkzuche.crawler.pojo.City;

public class CityDaoImpl extends CommonDao implements CityDao {

	public CityDaoImpl() {
		setNamespace("CityDao");
	}

	public City queryOneCityById(int cityId) throws SQLException {
		return (City)this.selectOne(getNamespace() + "queryOneCityById", cityId);
	}

	public City queryOneCityByName(String cityName) throws SQLException {
		return (City) this.selectOne(getNamespace() + "queryOneCityByName", cityName);
	}

	@SuppressWarnings("unchecked")
	public List<City> queryCities(Object params) throws SQLException {
		return (List<City>)this.selectList(getNamespace() + "queryCities", params);
	}

	@SuppressWarnings("unchecked")
	public List<City> queryAllCities() throws SQLException {
		return (List<City>) this.selectList(getNamespace() + "queryAllCities", null);
	}

	public int updateCity(Object params) throws SQLException {
		return this.update(getNamespace() + "updateCity", params);
	}

	public int deleteCity(Object params) throws SQLException {
		return this.delete(getNamespace() + "deleteCity", params);
	}

	public int insertCity(Object params) throws SQLException {
		return this.insert(getNamespace() + "insertCity", params);
	}

}
