package com.wkzuche.crawler.dao;

import java.sql.SQLException;
import java.util.List;

import com.wkzuche.crawler.pojo.Shop;

public interface ShopDao {
	public Shop queryOneShopByShopName(String shopName) throws SQLException;
	
	public Shop queryOneShopByShopId(int shopId) throws SQLException;
	
	public List<Shop> queryAllShops() throws SQLException;
	
	public int insertShop(Shop shop) throws SQLException;
	
	public int updateShop(Shop shop) throws SQLException;
	
	public int deleteShop(Shop shop) throws SQLException;
}
