# Spring-Cloud-Config

Languages and Frameworks: Java, Spring Boot, Spring Cloud Config, Actuator, Rest Template 

his project is developed using Java and leverages several frameworks and technologies, including Spring Boot, Spring Cloud Config, Actuator, and RestTemplate.

A) Insurance Provider Microservice: This microservice is responsible for providing a list of various insurance plans that are available. It utilizes Spring Boot and Spring MVC's REST controller and GET mapping annotations to expose an endpoint that can be accessed by clients. When a client sends a request to the appropriate endpoint, the microservice retrieves the list of insurance plans and returns it as a response.

B) Insurance Config Server: The Insurance Config Server is implemented using Spring Cloud Config. It serves as a centralized configuration server for the microservices in the system. It connects to a Git repository that contains the application properties files, where configuration information, such as the endpoint URL for the insurance provider, is stored. The Config Server retrieves the configuration properties from the Git repository and provides them to the microservices upon request.

C) Insurance Client Microservice: This microservice is responsible for displaying the list of various insurance plans available to clients. It acts as a Config Client, which means it connects to the Insurance Config Server to retrieve its configuration information. The client microservice uses Spring Boot and Spring MVC to expose an endpoint, similar to the Insurance Provider Microservice. However, instead of directly defining the insurance provider's endpoint URL, it retrieves it from the Config Server. This allows for dynamic configuration and the ability to change the insurance provider's endpoint without modifying the client code.

D) Actuator: Spring Boot Actuator is a framework that provides various production-ready features for monitoring and managing applications. In this project, Actuator is used to expose endpoints that offer insights into the microservices' health, metrics, and other operational information. These endpoints can be accessed to monitor the system's health and gather statistics.

E) RestTemplate: RestTemplate, a class in the Spring Framework, is used for making HTTP requests and handling responses in a convenient manner. In this project, RestTemplate is used by both the Insurance Provider and Insurance Client microservices to communicate with each other. The Insurance Client microservice uses RestTemplate to send an HTTP request to the insurance provider's endpoint and retrieve the list of insurance plans.

By utilizing Java, Spring Boot, Spring Cloud Config, Actuator, and RestTemplate, this project enables the development of a distributed system consisting of microservices. The Insurance Provider microservice provides the list of insurance plans, the Insurance Config Server handles dynamic configuration, and the Insurance Client microservice connects to the Config Server to find the insurance provider's endpoint. This modular and decoupled architecture allows for scalability, flexibility, and maintainability of the overall system.
