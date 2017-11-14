# keycloak-spring-tomcat-example
Example of usage Keycloak idp with Spring framework (not spring boot) and tomcat

## How to use

1. Open your keycloak's administration console and setup your realm & client
2. Go to your client -> Installation and download Keycloak OIDC JSON file. Put this file to WEB-INF folder (replace my one)

### then

```
mvn war:war
```
and deploy war file to your tomcat


## I used

* [Keycloak](http://www.keycloak.org/) - 3.4.0-Final
* [Spring Framework](https://projects.spring.io/spring-framework/) - 5.0.0-RELEASE
* [Tomcat](https://tomcat.apache.org/download-70.cgi) - 7.0.82
* [Maven](https://maven.apache.org/)
