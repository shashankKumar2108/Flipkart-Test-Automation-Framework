# 🛒 Flipkart Test Automation Framework

![Java](https://img.shields.io/badge/Java-11-orange?style=flat-square&logo=java)
![Selenium](https://img.shields.io/badge/Selenium-4.21.0-green?style=flat-square&logo=selenium)
![TestNG](https://img.shields.io/badge/TestNG-7.9.0-red?style=flat-square)
![Maven](https://img.shields.io/badge/Maven-3.x-blue?style=flat-square&logo=apachemaven)
![Status](https://img.shields.io/badge/Tests-7%2F7%20Passing-brightgreen?style=flat-square)

A clean, simple Selenium automation framework for **Flipkart.com** built using the **Page Object Model (POM)** design pattern.

---

## 👨‍💻 Author

**Shashank Kumar**
 Aspiring QA Automation Engineer (Java, Selenium, TestNG, Manual & Automation Testing)

- GitHub: [@shashankKumar2108](https://github.com/shashankKumar2108)
- LinkedIn: [@Shashank k](https://www.linkedin.com/in/shashankkumar2108/)

---

## 🧰 Tech Stack

| Tool | Version | Purpose |
|------|---------|---------|
| Java | 11 | Programming language |
| Selenium WebDriver | 4.21.0 | Browser automation |
| TestNG | 7.9.0 | Test framework |
| Maven | 3.x | Build & dependency management |
| WebDriverManager | 5.9.1 | Auto ChromeDriver setup |
| Chrome | 147+ | Browser under test |

---

## 📁 Project Structure

```
FlipkartAutomation/
├── src/
│   └── test/
│       └── java/
│           ├── pages/
│           │   ├── HomePage.java         → Home page locators & actions
│           │   ├── LoginPage.java        → Login page locators & actions
│           │   ├── SearchPage.java       → Search results locators & actions
│           │   └── ProductPage.java      → Product detail locators & actions
│           ├── tests/
│           │   ├── HomePageTest.java     → Tests for home page
│           │   ├── LoginTest.java        → Tests for login flow
│           │   └── SearchTest.java       → Tests for search functionality
│           └── utils/
│               └── BaseTest.java         → WebDriver setup & teardown
├── pom.xml                               → Maven dependencies
├── testng.xml                            → Test suite configuration
└── README.md
```

---

## 🎯 Design Pattern — Page Object Model (POM)

This framework follows the **Page Object Model** pattern which means:

- Each web page has its own **Java class** (e.g. `HomePage.java`)
- All **locators and actions** for that page live inside its class
- **Test files** only call methods from page classes — no locators in tests
- Makes the framework easy to **maintain and scale**

```
Test File  →  Page Class  →  WebDriver  →  Browser
```

---

## ✅ Test Cases

### 🏠 HomePageTest
| Test | Description | Status |
|------|-------------|--------|
| `verifyFlipkartTitle` | Checks page title contains "Flipkart" or "Online Shopping" | ✅ PASS |
| `verifySearchBoxIsPresent` | Searches "laptop" and verifies URL updates | ✅ PASS |

### 🔐 LoginTest
| Test | Description | Status |
|------|-------------|--------|
| `verifyLoginPageOpens` | Navigates to login page and verifies URL/title | ✅ PASS |
| `verifyHomePageLoads` | Verifies Flipkart homepage loads successfully | ✅ PASS |

### 🔍 SearchTest
| Test | Description | Status |
|------|-------------|--------|
| `searchForMobile` | Searches "samsung mobile" and verifies URL | ✅ PASS |
| `searchForLaptop` | Searches "laptop" and verifies URL | ✅ PASS |
| `verifySearchURLContainsKeyword` | Searches "iphone" and verifies URL contains keyword | ✅ PASS |

---

## ▶️ How to Run

### Prerequisites
- Java 11 or above installed
- Maven installed
- Google Chrome installed
- IntelliJ IDEA (recommended)

### Clone the repo
```bash
git clone https://github.com/shashankKumar2108/FlipkartAutomation.git
cd FlipkartAutomation
```

### Run all tests
```bash
mvn test
```

### Run a specific test class
```bash
mvn test -Dtest=SearchTest
mvn test -Dtest=HomePageTest
mvn test -Dtest=LoginTest
```

### Run via testng.xml in IntelliJ
Right-click `testng.xml` → **Run**

---

## ⚙️ Configuration

No manual ChromeDriver setup needed! **WebDriverManager** automatically downloads the correct ChromeDriver version matching your installed Chrome browser.

To run tests in **headless mode** (no browser window), uncomment this line in `BaseTest.java`:
```java
// options.addArguments("--headless");
```

---

## 📊 Test Results

```
===============================================
Flipkart Test Suite
Total tests run: 7, Passes: 7, Failures: 0, Skips: 0
===============================================
```

---

## 📌 Notes

- Flipkart updates its UI frequently — if locators break, inspect the element and update the `By` locators in the relevant page class
- The CDP version warnings in the console are harmless and do not affect test execution
- Login tests use direct URL navigation since Flipkart's login popup is dynamically loaded

---
