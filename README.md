Sample POC using Spring Boot and Spring Cloud stack to implement microservices

Notes :
* To installing Elasticsearch, Kibana and Logstash : see https://www.elastic.co/guide/en/elasticsearch/reference/current/deb.html
* Logstash configuration : see chassis/src/main/logstash/ms-chassis.conf
* To install Logtrail in Kibana : ```/usr/share/kibana/bin/kibana-plugin install https://github.com/sivasamyk/logtrail/releases/download/v0.1.27/logtrail-6.3.0-0.1.27.zip```
* Logtrail configuration : see chassis/src/main/logtrail/logtrail.conf