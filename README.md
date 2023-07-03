# connect-to-multiple-db


## Main key points
the models should be kept in different packages 
EntityManagerfactory should be defined Manually 

![How-to-Configure-Multiple-Databases-for-Microservices](https://github.com/rakeshgowdan/spring-boot-connect-multiple-database/assets/41374671/b22431de-7ad5-4bbd-ace3-ad290933c991)

## Databases Used
MySql
Postgres

## How It Works
It would be similar to your normal application but with a few changes

The application.properties file would now contain multiple setting each for a different datasource

You need configuration classes, one for each of the datasources. One of the configuration classed must be set as Primary using the @Primary annotation.

The configuration classes would contain mandatory methods:

DataSource method

LocalContainerEntityManagerFactoryBean method

PlatformTransactionManager method

 Of course, you need a model class and a repository interface.

## Package Structure 


<img width="240" alt="image" src="https://github.com/rakeshgowdan/spring-boot-connect-multiple-database/assets/41374671/78528c04-e756-4294-96ec-0c80a81279a3">

 
## Responses 

<img width="651" alt="image" src="https://github.com/rakeshgowdan/spring-boot-connect-multiple-database/assets/41374671/8e254639-2455-4b53-bf74-da3b1f75b504">


<img width="651" alt="image" src="https://github.com/rakeshgowdan/spring-boot-connect-multiple-database/assets/41374671/550255e7-0f25-47bc-b447-90dabc4a368f">

