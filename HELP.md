# Getting Started

### How to
* How to start Docker Compose: docker-compose up (with -d will run in the background)
* How to stop Docker Compose: docker-compose down (with --volumes will delete the volumes also)
* How to check logs: docker-compose logs -f (you can add the name of the service for filter the logs)
* How to use kafkacat in this demo:
    * How to open a remote shell: docker-compose exec kafkacat /bin/sh
    * How to list topics: kafkacat -L -b broker:29092
    * How to consume topics: kafkacat -b kafka:29092 -r http://schema-registry:8081 -s avro -t topic_name -C -o -10 -q 
* How to open the MYSQL Console: docker exec -it mysql bash -c 'mysql -u root -p$MYSQL_ROOT_PASSWORD demo'

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#using.devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Thymeleaf layouts](https://ultraq.github.io/thymeleaf-layout-dialect/processors/decorate/)
* [Bootstrap 5.3](https://getbootstrap.com/docs/5.3/getting-started/introduction/)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [How to create data for demos](https://www.mockaroo.com/)
* [How to use embebed kafka cluster with SpringBoot](https://docs.spring.io/spring-kafka/docs/current/reference/html/#same-broker-multiple-tests)
