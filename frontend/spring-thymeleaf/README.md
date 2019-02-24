# Developing Web Applications (Resources)

Shows how you can use templates with your Web Application.

Use the following commands to build run the application:
```
$ mvn clean package
$ java -jar target/spring-thymeleaf-1.0.0-SNAPSHOT.jar
```

== Understanding the code
Even if you have a rich JavaScript web application you may still want to use a templating
system. Templating gives you additional flexibilty to decide how screens are composed and
what on-the-fly modifications might need to happen as they are served.

This example uses Thymleaf to compose a welcome page using a layout. The `index.html` page
contains the content and the `layout.html` page contains standard items that will be on
every page (header, footer etc).

Thymleaf is auto-configured because we include the `spring-boot-starter-thymeleaf`
dependency. Templates are picked up from the `src/main/resources/templates` folder.
