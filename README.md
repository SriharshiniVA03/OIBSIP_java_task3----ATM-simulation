# OIBSIP_Java_task3: ATM Interface

## 📌 Project Overview
This repository contains a console-based **ATM Interface** application developed during my Java Development internship at **Oasis Infobyte**. The system simulates real-world ATM functionalities, allowing users to perform secure financial transactions.

## 🎯 Objective
The goal was to build a multi-class Java application that demonstrates:
* **Object-Oriented Programming (OOP):** Separation of concerns between the user account logic (`Account.java`) and the interface logic (`ATM.java`).
* **Authentication:** A secure login system using User ID and PIN.
* **Transaction Management:** Handling deposits, withdrawals, and transfers while updating the balance in real-time.

## 🛠️ Features & Functionality
* **Secure Login:** Validates user credentials before granting access.
* **Transaction History:** Tracks all actions (deposits, withdrawals, and transfers) during the session.
* **Withdraw & Deposit:** Real-time balance updates with "Insufficient Balance" checks for withdrawals.
* **Transfer:** Allows moving funds to a specified recipient.
* **Clean Exit:** A dedicated option to quit the session safely.

## 💻 Tech Stack
* **Language:** Java
* **Concepts:** Classes & Objects, ArrayLists (for history), Switch-case menus, and Do-While loops.

## 🚀 How to Run
1. Compile the project: `javac ATMproject.java`
2. Run the main class: `java ATMproject`
3. Default Login: ID: `user123` | PIN: `1234`
