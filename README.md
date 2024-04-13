# Bank Management System

## Overview

The Bank Management System is a desktop application developed in Java, utilizing Swing and AWT packages for the frontend interface and MySQL for the backend database. This application provides a comprehensive solution for managing various banking operations including customer accounts, transactions, and employee management. It incorporates core Java concepts such as multithreading, Runnable interfaces, and Java Database Connectivity (JDBC) to ensure efficient performance and seamless integration with the database.

## Features

- Intuitive graphical interface developed using Java Swing and AWT packages.
- Secure and efficient storage and retrieval of banking data using MySQL database.
- Multi-threaded architecture for concurrent processing of transactions and operations.
- Seamless connectivity to the database using JDBC for robust data management.

## Images

<img src="https://media.licdn.com/dms/image/D4D2DAQHp169AgsGllw/profile-treasury-image-shrink_800_800/0/1687508301375?e=1713600000&v=beta&t=OafUgOUQ8n8yFP8EsCTHI3A3rm6cDB0h9EEL0d55pGg"/>
<img src="https://media.licdn.com/dms/image/D4D2DAQENwa7e3wNBKA/profile-treasury-image-shrink_800_800/0/1687508321172?e=1713600000&v=beta&t=a3xzPn2R9YR4geS-7odso7ehruNrW4pYXmWaXjYiGKA"/>
<img src="https://media.licdn.com/dms/image/D4D2DAQGjxsvpFcE0zQ/profile-treasury-image-shrink_800_800/0/1687508333824?e=1713600000&v=beta&t=bR3j7nfRVp5ruaNmeO3iEWzbaNIbvdu1nyWRIceeeC0"/>

## Requirements

- Java Development Kit (JDK) installed on your system.
- MySQL database server.
- MySQL Connector/J library for JDBC connectivity.

## Setup

1. **Database Configuration**:
   - Ensure that MySQL is installed and running on your system.
   - Create a new database named `bank_management_system`.
   - Import the provided `database.sql` file to create the necessary tables and populate initial data.

2. **JDBC Configuration**:
   - Add the MySQL Connector/J library to your project's build path.
   - Configure JDBC connection properties in the `db.properties` file.

3. **Build and Run**:
   - Compile the Java files using your preferred IDE or command-line compiler.
   - Run the main application file to launch the Bank Management System.

## Usage

Upon launching the application, users will be presented with an intuitive interface where they can perform various banking operations, including:

- Account management: creation, deletion, and modification of customer accounts.
- Transaction processing: deposit, withdrawal, and fund transfer functionalities.
- Employee management: add, remove, and update employee information.
- Account inquiries: view account details, transaction history, and account balances.
