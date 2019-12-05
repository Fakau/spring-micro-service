###############################################################

#### This is a spring boot micro service with Eureka as service discover ######

To run this app
1-copy the CLOUD-CONF in put it an your machin and make it a git repository(git init)
2-Open the service-config app and update the application.properties set de file directory to your cloud-config
3-update app spring service with maven
4-start thr service config
5-start the service register
6-start the service-sale and service employe
7-start the service gateway

if everything ok you can test your service
1-test config service [http://localhost:8888/application/dev]
2-test register service [http://localhost:8761/] you will see all running instance
3-test sale service [http://localhost:8282/sales]
4-test employe service [http://localhost:8384/employes]
5-test gateway service [http://localhost:8080/service-sale/sales] ouuuu it works

