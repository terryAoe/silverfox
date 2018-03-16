package com.wkzuche.crawler.pojo;

public class CarModel {
	
	private int id;
	private int carTypeId;
	private int carTypeName;
	private int brandId;
	private String bigImageUrl;
	private String gearName;
	private int emission;
	private String emissionUnit;
	private String structureName;
	private int maxPassenger;
	private int level ;
	private boolean isHot;
	private String brandBooklingUrl;
	private boolean isShow;
	private String carInfo;
	
	
	public CarModel() {
		// TODO Auto-generated constructor stub
	}


	public CarModel(int id, int carTypeId, int carTypeName, int brandId, String bigImageUrl, String gearName,
			int emission, String emissionUnit, String structureName, int maxPassenger, int level, boolean isHot,
			String brandBooklingUrl, boolean isShow, String carInfo) {
		super();
		this.id = id;
		this.carTypeId = carTypeId;
		this.carTypeName = carTypeName;
		this.brandId = brandId;
		this.bigImageUrl = bigImageUrl;
		this.gearName = gearName;
		this.emission = emission;
		this.emissionUnit = emissionUnit;
		this.structureName = structureName;
		this.maxPassenger = maxPassenger;
		this.level = level;
		this.isHot = isHot;
		this.brandBooklingUrl = brandBooklingUrl;
		this.isShow = isShow;
		this.carInfo = carInfo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCarTypeId() {
		return carTypeId;
	}


	public void setCarTypeId(int carTypeId) {
		this.carTypeId = carTypeId;
	}


	public int getCarTypeName() {
		return carTypeName;
	}


	public void setCarTypeName(int carTypeName) {
		this.carTypeName = carTypeName;
	}


	public int getBrandId() {
		return brandId;
	}


	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}


	public String getBigImageUrl() {
		return bigImageUrl;
	}


	public void setBigImageUrl(String bigImageUrl) {
		this.bigImageUrl = bigImageUrl;
	}


	public String getGearName() {
		return gearName;
	}


	public void setGearName(String gearName) {
		this.gearName = gearName;
	}


	public int getEmission() {
		return emission;
	}


	public void setEmission(int emission) {
		this.emission = emission;
	}


	public String getEmissionUnit() {
		return emissionUnit;
	}


	public void setEmissionUnit(String emissionUnit) {
		this.emissionUnit = emissionUnit;
	}


	public String getStructureName() {
		return structureName;
	}


	public void setStructureName(String structureName) {
		this.structureName = structureName;
	}


	public int getMaxPassenger() {
		return maxPassenger;
	}


	public void setMaxPassenger(int maxPassenger) {
		this.maxPassenger = maxPassenger;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public boolean isHot() {
		return isHot;
	}


	public void setHot(boolean isHot) {
		this.isHot = isHot;
	}


	public String getBrandBooklingUrl() {
		return brandBooklingUrl;
	}


	public void setBrandBooklingUrl(String brandBooklingUrl) {
		this.brandBooklingUrl = brandBooklingUrl;
	}


	public boolean isShow() {
		return isShow;
	}


	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}


	public String getCarInfo() {
		return carInfo;
	}


	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + carTypeId;
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
		CarModel other = (CarModel) obj;
		if (carTypeId != other.carTypeId)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "CarModel [id=" + id + ", carTypeId=" + carTypeId + ", carTypeName=" + carTypeName + ", brandId="
				+ brandId + ", bigImageUrl=" + bigImageUrl + ", gearName=" + gearName + ", emission=" + emission
				+ ", emissionUnit=" + emissionUnit + ", structureName=" + structureName + ", maxPassenger="
				+ maxPassenger + ", level=" + level + ", isHot=" + isHot + ", brandBooklingUrl=" + brandBooklingUrl
				+ ", isShow=" + isShow + ", carInfo=" + carInfo + "]";
	}

	
}
