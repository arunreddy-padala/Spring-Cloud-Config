# InsureFlow_Microservices_Java_Spring

This project represents a sophisticated microservices architecture tailored for an insurance service platform. Developed using Java and an array of Spring technologies including Spring Boot, Spring Cloud Config, Actuator, and RestTemplate, this setup ensures robust, scalable, and maintainable service delivery.

Languages & Frameworks: Java, Spring Boot, Spring Cloud Config, Spring Actuator, RestTemplate

Components:
1. Insurance Provider Microservice
- Functionality: Delivers a list of available insurance plans.
- Technology: Uses Spring Boot and Spring MVC, leveraging REST controller and GET mapping to expose a service endpoint.
- Response Handling: Responds to client requests with a detailed list of insurance plans.
2. Insurance Config Server
- Role: Acts as a centralized configuration server for all microservices.
- Configuration Source: Connects to a Git repository storing the application's configuration files, such as endpoint URLs.
- Dynamic Configuration: Supplies configuration settings to microservices, facilitating flexible deployments and updates without direct code modifications.
3. Insurance Client Microservice
- Purpose: Displays the insurance plans to clients.
- Configuration Integration: Operates as a Config Client, fetching its configuration from the Insurance Config Server to determine the provider’s endpoint URL.
- User Interface: Utilizes Spring MVC to render insurance plan details effectively to clients.
4. Actuator Integration
- Monitoring: Implements Spring Boot Actuator to provide critical operational and health metrics of microservices.
- Endpoints: Offers built-in endpoints for real-time health checks and detailed metrics, essential for maintaining the performance and reliability of the services.
5. RestTemplate Usage
- Communication: Facilitates HTTP interactions between the Insurance Provider and Client microservices.
- Data Retrieval: Enables the Client microservice to request and receive insurance plan data from the Provider efficiently.
  
Key Features:
- Decoupled Architecture: Ensures that each component can be developed, deployed, and scaled independently.
- Centralized Configuration Management: Allows environment-specific configurations to be managed without service downtime.
- Service Discovery and Registration: Integrates seamlessly with Spring Cloud components for dynamic service discovery.
- Health and Performance Monitoring: Utilizes Actuator for monitoring, helping in proactive maintenance and troubleshooting.

