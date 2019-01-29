# Error Handling

Error handling with `@ControllerAdvice` and `@ExceptionHandler`
We need to be able to handle errors in a more declarative, a more efficient way. 
Errors are very important in REST API. They are how you communicate to the client 
that something has gone wrong. You don't have exceptions, you don't have all the normal 
integers type status codes you might be used to dealing with in more imperative 
programmed APIs. Getting error handling correct is fairly easy with Spring MVC and 
it introduces a new level of transparency about the API if you do a good job. 
One very popular one is application `vnd.error`. Vnd.error basically sends back a 
correlation key, a log ref, and a human readable message. You can also provide links 
in the vnd error body as well if you like. `Spring HATEOAS` supports vnd errors. 
We've got `@RequestMapping` produces application/vnd error on our `ControllerAdvice`. 
And we're gonna send back for every response a VndErrors object from the Spring HATEOAS project. 
When a piece of code throws a FileNotFoundException for example when we try and read 
a file that doesn't exist this handler method will get involved.