package top.starrysea.object.dto;

import top.starrysea.kql.entity.Entity;
import top.starrysea.kql.entity.IBuilder;
import top.starrysea.object.view.out.CityForAddOrder;

public class City implements Entity {

	private Integer cityId;
	private Province province;
	private String cityName;

	private City(Builder builder) {
		this.cityId = builder.cityId;
		this.province = builder.province;
		this.cityName = builder.cityName;
	}

	public City() {

	}

	public static class Builder implements IBuilder<City> {

		private Integer cityId;
		private Province province;
		private String cityName;

		public Builder cityId(Integer cityId) {
			this.cityId = cityId;
			return this;
		}

		public Builder province(Province province) {
			this.province = province;
			return this;
		}

		public Builder cityName(String cityName) {
			this.cityName = cityName;
			return this;
		}

		@Override
		public City build() {
			return new City(this);
		}

	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public CityForAddOrder toVo() {
		return new CityForAddOrder(cityId, cityName);
	}
}
