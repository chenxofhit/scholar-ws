#### Scholar-ws: Extend Scholar.py to be Web Service

##### Motivation: Make sholar.py [to](https://github.com/ckreibich/scholar.py/) offer a cloud service for academic users.

The solution is java based  and use Spring Boot without any backend database and cache.

It is working fine for my case, to search a paper with the title and get the bibtex item.

And more requirement please let me know. If an open access cloud machine is to be provided,

Special thanks will go to you on behalf of all the potential users.

##### Deploy:

1, python 3.6 + java 8 environment installed first; 

2, put *scholar.py* into a folder and modified application.properties with key *scholarpath*;

3, Open terminator and execute following commands:
```shell
git clone https://chenxofhit.github.com/scholar-ws
cd ./scholar-ws 
mvn spring-boot:run 
```

if everything is ok,  click http://localhost:8080/index to rush !

##### Contact:

Any question, please mail to chenxofhit@gmail.com . 