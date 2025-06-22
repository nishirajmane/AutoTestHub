Here’s your complete **`README.md`** file for the `AutoTestHub` project — ready to be added to your GitHub repo:

---

```markdown
# 🧪 AutoTestHub

> 🚀 A complete Selenium + TestNG automation framework with integrated MongoDB logging and Jenkins CI/CD pipeline.

---

## 📌 Project Overview

**AutoTestHub** is a Java-based UI test automation framework that supports:
- Automated browser testing using **Selenium WebDriver**
- **TestNG** for structured test execution
- **MongoDB** for logging test pass/fail results
- **Jenkins CI/CD** for continuous test execution on code push or schedule

---

## 🛠️ Tech Stack

| Tool             | Purpose                         |
|------------------|---------------------------------|
| Java 17+         | Programming Language            |
| Maven            | Dependency Management           |
| Selenium         | Browser Automation              |
| TestNG           | Test Framework                  |
| MongoDB          | NoSQL Database (for logging)    |
| Jenkins          | CI/CD Pipeline                  |
| Git + GitHub     | Version Control                 |

---

## 📁 Project Structure

```

AutoTestHub/
├── src/
│   ├── main/java/utils/MongoLogger.java     # MongoDB logging utility
│   └── test/java/base/BaseTest.java         # WebDriver setup/teardown
│   └── test/java/base/DummyTest.java        # Sample test case
├── testng.xml                               # TestNG configuration
├── pom.xml                                  # Maven dependencies
├── config.properties                        # WebDriver & Mongo config
└── target/                                  # Compiled output & reports

````

---

## ✅ Features

- 🔁 Reusable WebDriver base class
- 📋 Modular, data-driven test design
- 📊 MongoDB logging:
  ```json
  {
    "testCase": "testTitle",
    "status": "PASSED",
    "timestamp": "2025-06-22T18:40:00Z"
  }
````

* 📥 Jenkins pipeline that:

  * Pulls from GitHub
  * Runs `mvn clean test`
  * Publishes TestNG results
  * Archives test logs and reports

---

## 🧪 How to Run Tests Locally

```bash
# Clone project
git clone https://github.com/nishirajmane/AutoTestHub.git
cd AutoTestHub

# Run tests with Maven
mvn clean test
```

> 🔎 Ensure MongoDB is running (`localhost:27017`) before execution.

---

## 🧱 MongoDB Setup

1. Install MongoDB Community Edition from: [https://www.mongodb.com/try/download/community](https://www.mongodb.com/try/download/community)
2. Ensure it's running as a service.
3. Logs will be stored in `autotesthub.results` collection.

---

## ⚙️ Jenkins CI Setup

1. Install Jenkins on your system or VM
2. Install necessary plugins:

   * Git Plugin
   * Maven Integration
   * TestNG Results Plugin
3. Create a Freestyle project:

   * Source: GitHub Repo
   * Build: `mvn clean test`
   * Post-build:

     * Publish TestNG results: `target/testng-results.xml`
     * Archive artifacts: `target/**/*.xml, target/**/*.log`

---

## 📌 Example Test

```java
@Test
public void testTitle() {
    try {
        String title = driver.getTitle();
        MongoLogger.logResult("testTitle", "PASSED");
    } catch (Exception e) {
        MongoLogger.logResult("testTitle", "FAILED");
    }
}
```

---

## 🌐 Author

👤 **Nishiraj Mane**
🔗 [LinkedIn](https://www.linkedin.com/in/nishirajmane/)
📁 [Portfolio](https://nishirajmane.netlify.app/)

---

## 📃 License

MIT License - Feel free to use and modify!

```

---

Let me know if you'd like me to:
- Add badges (e.g., Build Passing, GitHub Actions, MongoDB)
- Generate a `LICENSE` file
- Push it to your GitHub README directly via CLI instructions
```
