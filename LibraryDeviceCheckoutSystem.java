import java.util.Scanner;

public class LibraryDeviceCheckoutSystem {
	private static LibraryDeviceManager deviceManager = new LibraryDeviceManager();
	private static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		do {
			displayMenu();
			choice = readInteger("Select menu options 1-7: ");
			
			executeChoice(choice);
			} while (choice != 7);
	}
	private static void displayMenu() {
		System.out.println("Library Device Checkout System");
		System.out.println("1. List Devices by Title\n2. Add New Devices\n3. Edit Device Information:)");
		System.out.println("4. Search by Device Name\n5. Check Out Devices\n6. Check In Devices\n7. Exit");
		System.out.print("Select menu options 1-7: ");
	}
	
	private static int readInteger(String prompt) {
		int value;
		while(true) {
			try {
				System.out.print(prompt);
				value = Integer.parseInt(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				
				System.out.println("Invalid input. Please enter a valid integer.");
			}
		}
		return value;
	}
	
	private static void executeChoice(int choice) {
		switch(choice) {
		case 1: 
			deviceManager.listDevices();
			break;
		
		case 2: 
			String sku = scanner.nextLine();
			String name = scanner.nextLine();
			deviceManager.addDevice(sku, name);
			break;
			
		case 3:
			int deviceNumber = readInteger("Enter Device number to edit (1-" + deviceManager.size() + "");
			deviceManager.editDevice(deviceNumber);
			break;
			
		case 4:
			String searchTerm = scanner.nextLine();
			deviceManager.searchDevices(searchTerm);
			break;
			
		case 5:
			deviceNumber = readInteger("Enter device number: ");
			deviceManager.checkOutDevice(deviceNumber);
			break;
			
		case 6:
			deviceNumber = readInteger("Enter device number: ");
			deviceManager.checkInDevice(deviceNumber);
			break;
			
		case 7:
			System.out.println("Exiting Library Device Checkout System. Goodbye!");
			break;
		default:
		}
	}
}
	
	
		
