# 🛒 OpenCart Automation Framework

## Project Overview

This project is a Hybrid Test Automation Framework developed for the OpenCart E-Commerce application using Selenium WebDriver, Java, Cucumber, TestNG, Maven, Apache POI, and Extent Reports.

The framework follows the Page Object Model (POM) design pattern and supports Data-Driven Testing for scalable and maintainable automation.

---

## 🚀 Technologies Used

- Java
- Selenium WebDriver
- Cucumber (BDD)
- TestNG
- Maven
- Apache POI
- Extent Reports
- Git & GitHub

---

## 🏗 Framework Architecture

### Hybrid Framework

The framework combines:

- Page Object Model (POM)
- Behavior Driven Development (BDD)
- Data-Driven Testing
- Utility Classes

---

## 📂 Project Structure

```text
Project
│
├── src/test/java
│   ├── pages
│   ├── stepdefinitions
│   ├── runners
│   ├── utilities
│   └── base
│
├── src/test/resources
│   ├── features
│   ├── testdata
│   └── config
│
├── screenshots
├── reports
├── test-output
├── testng.xml
└── pom.xml
```

---

## ✅ Automated Modules

### User Registration
- Register a new customer
- Validate registration process

### Login
- Valid login
- Invalid login validation

### Product Search
- Search products using keywords
- Validate search results

### Cart Management
- Add products to cart
- Remove products from cart

### Checkout
- Proceed to checkout
- Validate checkout workflow

### Order Confirmation
- Verify successful order placement

### Logout
- Validate logout functionality

---

## 📖 Cucumber BDD Implementation

### Sample Feature

```gherkin
Feature: Login Functionality

Scenario: Successful Login
  Given User launches OpenCart application
  When User enters valid email and password
  And User clicks Login button
  Then User should be navigated to My Account page
```

### Step Definition Example

```java
@Given("User launches OpenCart application")
public void launchApplication() {
    driver.get(baseURL);
}
```

---

## 📊 Reporting

The framework generates:

- Extent Reports
- TestNG Reports
- Cucumber Reports

Reports include:

- Pass/Fail Status
- Execution Details
- Screenshots (if configured)
- Test Summary

---

## 📋 Prerequisites

- Java JDK 8+
- Eclipse IDE / IntelliJ IDEA
- Maven
- Google Chrome
- TestNG Plugin
- Cucumber Plugin (optional)

---

## ⚙️ Setup Instructions

### Clone Repository

```bash
git clone https://github.com/ThisIsSurajShaw/OpenCart-Automation-Framework.git
```

### Import Project

1. Open Eclipse
2. File → Import
3. Existing Maven Project
4. Select Project Folder
5. Finish

### Update Maven Dependencies

```bash
mvn clean install
```

---

## ▶️ Execute Tests

### Run Cucumber Runner

```text
Run As → TestNG Test
```

OR

```text
Run As → Maven Test
```

### Execute Using Maven

```bash
mvn test
```

---

## 🎯 Features Covered

- Registration
- Login
- Product Search
- Add To Cart
- Remove Product
- Checkout
- Order Confirmation
- Logout

---

## 👨‍💻 Author

Suraj Shaw



---

## 🔮 Future Enhancements

- Jenkins Integration
- Parallel Execution
- Cross Browser Testing
- Docker Integration
- CI/CD Pipeline
- Screenshot Capture on Failure

---

## 📄 License

This project is created for learning and demonstration purposes.
