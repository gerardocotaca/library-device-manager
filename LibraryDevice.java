//Gerardo Cota-Canez, gcotacan, CIS 340, MP2

public class LibraryDevice {
	private String sku;
	private String name;
	private boolean available;
	
	public LibraryDevice(String sku, String name, boolean available) {
		this.sku = sku;
		this.name = name;
		this.available = available;
	}
	
public String getSku() {
	return sku;
}
public void setSku(String sku) {
	this.sku = sku;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public boolean isAvailable() {
	return available;
}
public void setAvailable(boolean available) {
	this.available = available;
}

@Override
public String toString() {
	return "SKU: " + sku + "\nName: " + name + "\nAvailable: " + available;
	}

}

	