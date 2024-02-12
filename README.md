# Inventory Management System

This is an Inventory Management System built using Java EE for the backend, HTMX for dynamic HTML content, Tailwind CSS for styling, and MySQL for the database.

## Features

- **CRUD Operations**: Perform Create, Read, Update, and Delete operations on inventory items.
- **Search and Filter**: Search for specific items and filter inventory based on different criteria.
- **User Authentication**: Secure login system for administrators to manage the inventory.
- **Responsive Design**: Responsive user interface for easy access on desktop and mobile devices.

## Technologies Used

- **Java EE**: Backend framework for building enterprise applications.
- **HTMX**: Lightweight JavaScript library for creating dynamic HTML content.
- **Tailwind CSS**: Utility-first CSS framework for styling the user interface.
- **MySQL**: Relational database management system for storing inventory data.

## Setup Instructions

1. **Clone the Repository**: `git clone https://github.com/your-username/my_inventory.git`
2. **Set Up MySQL Database**: Create a MySQL database named `my_inventory` and import the SQL schema provided in `database/my_inventory.sql`.
3. **Configure Database Connection**: Update the database connection settings in `src/main/webapp/WEB-INF/web.xml` file.
4. **Build and Run the Application**: build the project and deploy it to a Java EE application server (e.g., Apache Tomcat).
5. **Access the Application**: Open your web browser and navigate to the URL where the application is deployed (e.g., `http://localhost:8080`).

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/your-feature`)
3. Make your changes and commit them (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Create a new Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- **HTMX Documentation**: [https://htmx.org/docs/](https://htmx.org/docs/)
- **Tailwind CSS Documentation**: [https://tailwindcss.com/docs](https://tailwindcss.com/docs)
- **Java EE Tutorial**: [https://javaee.github.io/tutorial/](https://javaee.github.io/tutorial/)

---

Feel free to customize the README.md file according to your project's specific requirements and add more detailed information as needed.
