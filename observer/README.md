# Observer Pattern

## Overview
This pattern is usually applied when there is a group of entities that could be interested to perform an action when something happens on another entity.

The main interfaces are:
+ _Observable_: it provides methods to add, delete and notify observer
+ _Observers_: it provides update that will be invoked by Observable when the expected event is produced  

## Pattern info
![Alt text](documentation/basic-info.png?raw=true "Observer pattern")

### New OO principles


### Observations
Follow a short list of observations that could help you to understand better how this pattern works: 
+ it defines a one-to-many relationship between objects
+ sometimes Observable instance is called Subject
+ Observable update Observers using common interface
+ normally used to pull data from Observable
+ don't depend on a specific order of notification for your Observers
+ you can create your own Observable implementation if needed 

## Pattern implementation
The implementation of Observer pattern proposed into this project is based on a group of clients that would buy a product on a digital platform,
but it is out of stock at the moment.
Clients 1, 2 and 3 decided to register their emails to receive a notification when the product will be again in stock, in order to buy it.

After a while the client 3 bought the same product from another platform, therefore he canceled his email from the previous platform to don't receive any notification.
Both clients 1 and 2 still wait for the notification by platform because they want buy the product there.

At any time, a client could register or cancel his email.  

## Implementation examples
+ [javax.servlet.http.HttpSessionBindingListener](https://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpSessionBindingListener.html)
+ [java.util.EventListener](https://docs.oracle.com/javase/8/docs/api/java/util/EventListener.html)