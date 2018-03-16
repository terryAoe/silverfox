package com.wkzuche.crawler.dao;

import java.sql.SQLException;
import java.util.List;

import com.wkzuche.crawler.pojo.CarModel;

public interface CarModelDao {
	
	public CarModel queryOneCarModelByCarModelId(int carModelId) throws SQLException;
	
	public CarModel queryOneCarModelByCarModelName(String carModelName) throws SQLException;
	
	public List<CarModel> queryAllCarModels() throws SQLException;
	
	public int insertCarModel(CarModel carModel) throws SQLException;
	
	public int updateCarModel(CarModel carModel) throws SQLException;
	
	public int deleteCarModel(CarModel carModel) throws SQLException;
}
 