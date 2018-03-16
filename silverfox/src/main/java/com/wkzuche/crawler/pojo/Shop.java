package com.wkzuche.crawler.pojo;

public class Shop {
	private int id;
	private int cityId;
	private int shopId;
	private String  cityName;
	private String district;
	private String tel;
	private float longitude;
	private float latitude;
	private String busLine;
	private String name;
	private int location;
	private int displaytype;
	private String detailAddress;
	private String startTime;
	private String ednTime;
	private boolean isAllDay;
	private int managerId;
	private float baiduLongitude;
	private float baiduLatitide;
	private boolean isNew;
	private String businessHours;
	
	
	
	
	
	
	public Shop() {
		super();
	}
	
	public Shop(int id, int cityId, int shopId, String cityName, String district, String tel, float longitude,
			float latitude, String busLine, String name, int location, int displaytype, String detailAddress,
			String startTime, String ednTime, boolean isAllDay, int managerId, float baiduLongitude,
			float baiduLatitide, boolean isNew, String businessHours) {
		super();
		this.id = id;
		this.cityId = cityId;
		this.shopId = shopId;
		this.cityName = cityName;
		this.district = district;
		this.tel = tel;
		this.longitude = longitude;
		this.latitude = latitude;
		this.busLine = busLine;
		this.name = name;
		this.location = location;
		this.displaytype = displaytype;
		this.detailAddress = detailAddress;
		this.startTime = startTime;
		this.ednTime = ednTime;
		this.isAllDay = isAllDay;
		this.managerId = managerId;
		this.baiduLongitude = baiduLongitude;
		this.baiduLatitide = baiduLatitide;
		this.isNew = isNew;
		this.businessHours = businessHours;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public String getBusLine() {
		return busLine;
	}
	public void setBusLine(String busLine) {
		this.busLine = busLine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public int getDisplaytype() {
		return displaytype;
	}
	public void setDisplaytype(int displaytype) {
		this.displaytype = displaytype;
	}
	public String getDetailAddress() {
		return detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEdnTime() {
		return ednTime;
	}
	public void setEdnTime(String ednTime) {
		this.ednTime = ednTime;
	}
	public boolean isAllDay() {
		return isAllDay;
	}
	public void setAllDay(boolean isAllDay) {
		this.isAllDay = isAllDay;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public float getBaiduLongitude() {
		return baiduLongitude;
	}
	public void setBaiduLongitude(float baiduLongitude) {
		this.baiduLongitude = baiduLongitude;
	}
	public float getBaiduLatitide() {
		return baiduLatitide;
	}
	public void setBaiduLatitide(float baiduLatitide) {
		this.baiduLatitide = baiduLatitide;
	}
	public boolean isNew() {
		return isNew;
	}
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	public String getBusinessHours() {
		return businessHours;
	}
	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cityId;
		result = prime * result + shopId;
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
		Shop other = (Shop) obj;
		if (cityId != other.cityId)
			return false;
		if (shopId != other.shopId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Shop [id=" + id + ", cityId=" + cityId + ", shopId=" + shopId + ", cityName=" + cityName + ", district="
				+ district + ", tel=" + tel + ", longitude=" + longitude + ", latitude=" + latitude + ", busLine="
				+ busLine + ", name=" + name + ", location=" + location + ", displaytype=" + displaytype
				+ ", detailAddress=" + detailAddress + ", startTime=" + startTime + ", ednTime=" + ednTime
				+ ", isAllDay=" + isAllDay + ", managerId=" + managerId + ", baiduLongitude=" + baiduLongitude
				+ ", baiduLatitide=" + baiduLatitide + ", isNew=" + isNew + ", businessHours=" + businessHours + "]";
	}
	
	
	

}
