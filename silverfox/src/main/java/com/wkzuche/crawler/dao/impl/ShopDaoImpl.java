package com.wkzuche.crawler.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.wkzuche.crawler.dao.ShopDao;
import com.wkzuche.crawler.pojo.Shop;

public class ShopDaoImpl extends CommonDao implements ShopDao {

	public ShopDaoImpl() {
		setNamespace("ShopDao");
	}

	public Shop queryOneShopByShopName(String shopName) throws SQLException {
		return (Shop) this.selectOne(getNamespace() + "queryOneShopByShopName", shopName);
	}

	public Shop queryOneShopByShopId(int shopId) throws SQLException {
		return (Shop) this.selectOne(getNamespace() + "queryOneShopByShopId", shopId);
	}

	@SuppressWarnings("unchecked")
	public List<Shop> queryAllShops() throws SQLException {
		return (List<Shop>) this.selectList(getNamespace() + "queryAllShops", null);
	}

	public int insertShop(Shop shop) throws SQLException {
		return this.insert(getNamespace() + "insertShop", shop);
	}

	public int updateShop(Shop shop) throws SQLException {
		return this.update(getNamespace() + "updateShop", shop);
	}

	public int deleteShop(Shop shop) throws SQLException {
		return this.delete(getNamespace() + "deleteShop", shop);
	}

	
}
