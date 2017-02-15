About this project
----------------
This is a spring example of using aop.

key points:
- pom.xml: add some AspectJ dependency
- ApplicationContext.java: @EnableAspectJAutoProxy, add aop package in scan package: org.oursight.learning.spring.aop
- TestAspect.java: 自定义的一个, 必须同时声明 @Component，@Aspect才能生效


How to run
-----------------
1. checkout from git

2. mvn jetty:run  
If you want to run it in Tomcat, make sure that you are using the version above Tomcat 8.0 -- no need of web.xml at all

3. open your browser and access http://localhost:8080
just follow the yellow brick road




References
----------
- Spring data offical reference  
  http://docs.spring.io/spring-data/commons/docs/current/reference/html/
- https://github.com/Fruzenshtein/spr-data  
  http://fruzenshtein.com/spring-mvc-hibernate-maven-crud/
  http://fruzenshtein.com/spring-jpa-data-hibernate-mysql/
  
- Spring data elasticsearch intergration  
  http://docs.spring.io/spring-data/elasticsearch/docs/current/reference/html/#repositories
  https://github.com/SpringDataElasticsearchDevs/spring-data-elasticsearch-sample-application (an example)
  
- Yaml configuration support  
  http://yamlbeans.sourceforge.net/  
  Also in evernote:
  github: https://github.com/EsotericSoftware/yamlbeans/blob/master/pom.xml
  