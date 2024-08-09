# Library Device Checkout System

## Overview

The Library Device Checkout System is a Java-based application designed to manage library devices such as tablets and e-readers. It allows users to view, add, edit, search, check out, and check in devices. The system demonstrates object-oriented programming (OOP) principles and basic user interaction through a console interface.

## Project Goals

The primary goal of this project was to create a functional and user-friendly system for managing library devices. This project highlights the implementation of OOP concepts, data management, and user input handling in Java.

## Key Features

- **Object-Oriented Design**: Utilizes `LibraryDevice` and `LibraryDeviceManager` classes to encapsulate device data and management functionalities.
- **Device Management**: Allows listing, adding, editing, searching, checking out, and checking in devices.
- **Dynamic User Interaction**: Provides a console menu for user interaction, showcasing basic input handling and error checking.
- **Device Availability Tracking**: Tracks and displays the availability status of each device.

## Technologies Used

- **Java**: The project is implemented in Java, utilizing core libraries and standard input/output for user interaction.
- **Collections Framework**: Uses `ArrayList` for managing a dynamic list of devices.
- **Basic Input Handling**: Implements console-based input handling with error checking to ensure valid user inputs.

## Implementation Details

The project is structured around three main classes:

1. **LibraryDevice**: Represents individual library devices, with attributes for SKU, name, and availability.
2. **LibraryDeviceManager**: Manages a collection of `LibraryDevice` objects, including functionalities for listing, adding, and managing devices.
3. **LibraryDeviceCheckoutSystem**: Provides the main menu and user interaction, delegating operations to `LibraryDeviceManager`.

### Key Methods

- **`listDevices()`**: Displays a list of all devices with their details.
- **`addDevice(String sku, String name)`**: Adds a new device to the catalog.
- **`editDevice(int deviceNumber)`**: Edits the details of an existing device.
- **`searchDevices(String searchTerm)`**: Searches for devices by name.
- **`checkOutDevice(int deviceNumber)`**: Checks out a device, updating its availability status.
- **`checkInDevice(int deviceNumber)`**: Checks in a device, updating its availability status.

## Relevance to Software Engineering Roles

This project aligns with roles requiring a strong foundation in Java and OOP principles. The focus on device management and user interaction demonstrates key skills relevant to software engineering positions, such as:

- **Backend Development**: Implements core logic for managing data and interactions in a console application.
- **Data Management**: Utilizes collections and object-oriented techniques to manage and manipulate device information.
- **User Interface Design**: Provides a simple console-based interface, showcasing basic principles of user interaction and input handling.

## How to Use

1. **Clone the Repository**: Download or clone this repository to your local machine.
2. **Compile the Code**: Use a Java compiler (e.g., `javac`) to compile the source files.
3. **Run the Program**: Execute the main class (`LibraryDeviceCheckoutSystem`) to start the application.
4. **Follow the Menu**: Use the console menu to interact with the system and manage devices.

## Future Enhancements

- **Database Integration**: Implement a database to persist device data and improve scalability.
- **Graphical User Interface (GUI)**: Develop a GUI for more intuitive user interaction.
- **Advanced Search Features**: Introduce more sophisticated search and filtering capabilities.

## License

This project is licensed under the MIT License.
