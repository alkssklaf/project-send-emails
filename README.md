# project-send-emails
<h1>Overview</h1>

This project is a simple Java application that demonstrates the use of Spring annotations to create a modular system for sending emails. The application simulates two different data sources (MySQL and PostgreSQL) that provide email addresses. The email addresses are then sent to the console, simulating the action of sending emails.

<h1>Project Structure</h1>

- <strong>com.project.sendemails.datasource:</strong> This package contains the DataSource interface. It includes two implementations, MySqlDataSource and PostgreSqlDataSource.

- <strong>com.project.sendemails.service:</strong> This package contains the EmailService class, which is responsible for sending emails. It uses the DataSource interface to obtain email addresses.

- <strong>com.project.sendemails.SendEmailsApplication:</strong> The main class that initializes the Spring application context and demonstrates the functionality.

<h1>How it Works</h1>

- <strong>DataSource Interface:</strong> declares a method getEmails() to retrieve an array of email addresses.

- <strong>Data Source Implementations:</strong> MySqlDataSource and PostgreSqlDataSource are two classes implementing the DataSource interface. They simulate email addresses from MySQL and PostgreSQL databases.

- <strong>EmailService:</strong> The EmailService class is annotated with @Service and is responsible for sending emails. It uses constructor injection to receive a DataSource implementation.

- <strong>SendEmailsApplication:</strong> The main method initializes the Spring application context and retrieves an instance of EmailService. It then calls the sendEmail() method to demonstrate sending emails, which are printed to the console.
