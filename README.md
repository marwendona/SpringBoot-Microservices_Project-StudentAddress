# StudentAddress

Student Address is an application that has undergone a transformation from a monolithic architecture, named "university-monolithic-app," to a microservices architecture. The microservices involved are "student-service" and "address-service," both implemented using Spring Boot and MySQL. The application leverages Eureka for service discovery, a Gateway for API routing, LoadBalancer for load distribution, and Zipkin for distributed tracing.

## Features

- **Student Management**: The "student-service" allows the creation and retrieval of student records.
- **Address Management**: The "address-service" handles the creation and retrieval of address records.
- **Microservices Architecture**: The application is built on a microservices architecture to enhance scalability, maintainability, and flexibility.
- **Service Discovery**: Eureka is used for service discovery, enabling dynamic registration and discovery of microservices.
- **API Gateway**: The Gateway manages API routing, providing a single entry point for clients to access the microservices.
- **Load Balancing**: LoadBalancer ensures even distribution of requests among multiple instances of microservices, optimizing performance.
- **Distributed Tracing**: Zipkin facilitates distributed tracing, allowing monitoring and troubleshooting of requests across microservices.

## Technologies Used

- **Spring Boot**: Used for developing the microservices and providing a robust framework for Java-based applications.
- **MySQL**: The relational database management system is employed for data storage and retrieval.
- **Eureka**: Enables service registration and discovery in a microservices architecture.
- **Gateway**: Manages API routing and acts as the entry point for client requests.
- **LoadBalancer**: Distributes incoming requests among multiple instances of microservices to optimize resource utilization.
- **Zipkin**: Provides distributed tracing to monitor and troubleshoot requests across microservices.

## Project Setup

### Student Service:

1. Clone the repository to your local machine.
2. Import the "student-service" project into your IDE.
3. Make sure you have Java and Spring Boot installed.
4. Configure the necessary dependencies using Maven.

### Address Service:

1. Clone the repository to your local machine.
2. Import the "address-service" project into your IDE.
3. Make sure you have Java and Spring Boot installed.
4. Configure the necessary dependencies using Maven.

### Eureka, Gateway, LoadBalancer, and Zipkin:

1. Follow the setup instructions provided in their respective documentation.
2. Ensure proper configuration of service endpoints in the Gateway.

## Contributing

Contributions to the Student Address Microservices project are welcome! If you'd like to contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and ensure that the code is properly formatted.
4. Commit your changes and push them to your forked repository.
5. Submit a pull request detailing your changes.
