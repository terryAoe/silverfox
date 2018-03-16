package com.wkzuche.crawler.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.wkzuche.crawler.dao.CarModelDao;
import com.wkzuche.crawler.pojo.CarModel;

public class CarModelDaoImpl extends CommonDao implements CarModelDao {

	public CarModelDaoImpl() {
		setNamespace("CarModelDao");
	}

	public CarModel queryOneCarModelByCarModelId(int carModelId) throws SQLException {
		return (CarModel)this.selectOne(getNamespace() + "queryOneCarModelByCarModelId", carModelId);
	}

	public CarModel queryOneCarModelByCarModelName(String carModelName) throws SQLException {
		return (CarModel) this.selectOne(getNamespace() + "queryOneCarModelByCarModelName", carModelName);
	}

	@SuppressWarnings("unchecked")
	public List<CarModel> queryAllCarModels() throws SQLException {
		return (List<CarModel>) this.selectList(getNamespace() + "queryAllCarModels", null);
	}

	public int insertCarModel(CarModel carModel) throws SQLException {
		return this.insert(getNamespace() + "insertCarModel", carModel);
	}

	public int updateCarModel(CarModel carModel) throws SQLException {
		return this.update(getNamespace() + "updateCarModel", carModel);
	}

	public int deleteCarModel(CarModel carModel) throws SQLException {
		return this.delete(getNamespace() + "deleteCarModel", carModel);
	}

}
