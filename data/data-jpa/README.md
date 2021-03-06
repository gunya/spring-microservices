# Introduction
This example shows how you can access a classic relational database using Spring Data
and JPA.

# Building and running the sample
Use the following commands to build run the application:

```
$ mvn clean package
$ java -jar target/livelessons-data-jpa-1.0.0-SNAPSHOT.jar
```

# Understanding the code
This demo uses an embedded database to store data. The `Car` class provides the basic
entity and the `CarRepository` interface provides access. Notice that the
`findByMakeIgnoringCase` method is all that is needed to create the OQL query.

When the application starts mock data is added and then a single query is executed.
