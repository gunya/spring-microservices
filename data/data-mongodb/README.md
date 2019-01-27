# Introduction
This example shows how you can use the MongoDB document store.

Download and install local MongoDB server from https://www.mongodb.com/download-center/community?jmp=docs

# Building and running the sample
Use the following commands to build run the application:
```
$ mvn clean package
$ java -jar target/data-mongodb-1.0.0-SNAPSHOT.jar
```

# Understanding the code
the `Car` here is a `@Document` (like `@Entity` for JPA). It has also been updated with a `position` (the
geo-location where the car is stored).

The `CarRepository` works in the same way as any Spring Data repository and has the
familiar `findByMakeIgnoringCase` method. The demo also includes a `findByPositionNear`
method which shows how you can use MongoDB's geo features like as `GeoResults`.

The `DataMongoDBApplication` show how queries are executed and how you can also use
MongoDB's GridFS to store blob data.
