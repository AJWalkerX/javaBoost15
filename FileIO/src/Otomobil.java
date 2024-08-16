import java.io.Serializable;

public class Otomobil implements Serializable {
	private String marka;
	private String model;
	private Integer yil;
	
	public Otomobil(String marka, String model, Integer yil)  {
		this.marka = marka;
		this.model = model;
		this.yil = yil;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public Integer getYil() {
		return yil;
	}
	
	public void setYil(Integer yil) {
		this.yil = yil;
	}
	
	@Override
	public String toString() {
		return "Otomobil{" + "marka='" + getMarka() + '\'' + ", model='" + getModel() + '\'' + ", yil='" + getYil() + '\'' + '}';
	}
}