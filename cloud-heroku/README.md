Heroku. This is one of the early providers, probably the first platforms of service available. 
You can do two things with Heroku. You can either push binaries directly to the service, 
or you can link a git repository and push source code, and Heroku will build your files. 
Either way, Heroku uses a Procfile that defines how your application is started. 
This is just the build pack that it uses along with the port and the way that the jar is launched.

This example shows how you can push a Spring Boot application to Heroku. 
You will need a Heroku account and the heroku command line toolbelt installed.
This sample uses the heroku-maven-plugin to directly push the build application jar.

Ensure that you have logged into Heroku and created an application:

`$ heroku login`

`$ heroku create -n`

    <configuration>
        <appName>warm-beyond-26984</appName>
    </configuration>

Pushing to Heroku
To build an push the application use the following command:

`$ mvn clean package heroku:deploy`

[Live Example/](https://warm-beyond-26984.herokuapp.com/)