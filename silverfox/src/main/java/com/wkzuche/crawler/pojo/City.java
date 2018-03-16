package com.wkzuche.crawler.pojo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class City {
	@NotNull
	int cityId;
	
	@NotNull
	String cityName ;
	String chineseName;
	String englishName;
	boolean topCity;
	
	@NotNull
	@Min(value=0)
	int numberOfShops;
	
	
	
	
	public City(int cityId, String cityName, String chineseName, String englishName, boolean topCity,
			int numberOfShops) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.chineseName = chineseName;
		this.englishName = englishName;
		this.topCity = topCity;
		this.numberOfShops = numberOfShops;
	}
	
	
	
	public City() {
		super();
	}
	
	



	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getChineseName() {
		return chineseName;
	}
	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}
	public String getEnglishName() {
		return englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	public boolean isTopCity() {
		return topCity;
	}
	public void setTopCity(boolean topCity) {
		this.topCity = topCity;
	}
	public int getNumberOfShops() {
		return numberOfShops;
	}
	public void setNumberOfShops(int numberOfShops) {
		this.numberOfShops = numberOfShops;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cityId;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (cityId != other.cityId)
			return false;
		return true;
	}

	

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", chineseName=" + chineseName + ", englishName="
				+ englishName + ", topCity=" + topCity + ", numberOfShops=" + numberOfShops + "]";
	}
	
	
	
	
}
