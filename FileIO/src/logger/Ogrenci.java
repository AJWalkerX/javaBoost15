package logger;

import java.io.Serializable;

public class Ogrenci implements Serializable {
	private  String ad;
	private  Long ogrNo;
	
	public Ogrenci(String ad, Long ogrNo) {
		this.ad = ad;
		this.ogrNo = ogrNo;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public Long getOgrNo() {
		return ogrNo;
	}
	
	public void setOgrNo(Long ogrNo) {
		this.ogrNo = ogrNo;
	}
	
	@Override
	public String toString() {
		return "Ogrenci{" + "ad='" + getAd() + '\'' + ", ogrNo='" + getOgrNo() + '\'' + '}';
	}
}