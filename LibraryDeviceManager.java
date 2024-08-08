//Gerardo Cota-Canez, gcotacan, CIS 340, MP2

import java.util.ArrayList;

public class LibraryDeviceManager {
	private static final int INITIAL_CAPACITY = 10;
	private ArrayList<LibraryDevice>devices;
	
	public ArrayList<LibraryDevice>getDevices(){
		return devices;
	}
	
	public LibraryDeviceManager() {
		devices = new ArrayList<>(INITIAL_CAPACITY);
		
		devices.add(new LibraryDevice("6757A","Apple 9.7-inch iPad Pro", true));
		
		devices.add(new LibraryDevice("93P51B","Amazon Kindle Fire Kids Edition", true));
		
		devices.add(new LibraryDevice("10N8C","LeapFrog Epic Learning Tablet", true));
		
		devices.add(new LibraryDevice("8520","Amazon Kindle Fire HD 8", false));
		
		devices.add(new LibraryDevice("91H2D", "HP Envy 8 Note", true));
	}
	
	public void listDevices() {
		for(int i = 0; i < devices.size(); i++) {
			System.out.println("# " + (i+1) + "\n" + devices.get(i) + "\n");
		}
		System.out.println("Press Enter to continue...");
	}
	
	public void addDevice(String sku, String name) {
		devices.add(new LibraryDevice(sku, name, true));
		System.out.println("Added " + name + " to catalog.");
	}
	
	public void editDevice(int deviceNumber) {
		LibraryDevice device = devices.get(deviceNumber - 1);
	}
	
	public void searchDevices(String searchTerm) {
	}
	
	public void checkOutDevice(int deviceNumber) {
	}
	
	public void checkInDevice(int deviceNumber) {
	}

	public String size() {
		// TODO Auto-generated method stub
		return null;
	}
}
	
	