#### Scholar-ws: Scholar.py Web Service Project

##### Motivation: Contribute [scholar.py](https://github.com/ckreibich/scholar.py/) to offer a cloud service for academic users.

The solution is java based  and use Spring Boot without any backend database and cache.

It is working fine for my case, to search a paper with the title and get the bibtex item.

And more requirements please let me know. If an open access cloud machine is to be provided,

special thanks will go to you on behalf of all the potential users.

##### Deploy:

1, python 3.6 + java 8 environment installed first; 

2, put *scholar.py* into a folder and modified application.properties with key *scholarpath*;

3, Open terminator and execute following commands:
```shell
git clone https://chenxofhit.github.com/scholar-ws
cd ./scholar-ws 
mvn spring-boot:run 
```

if everything is ok,  click http://localhost:8080/index to explore !

#### Test:
The following script can be employed to test in the  server machine .
```shell
python /Users/chenx/Documents/Project/googlescholar/scholar.py/scholar.py -c 1 -A "Inferring Biological Networks by SparseIdentification of Nonlinear Dynamics" --citation bt
```
Following is the result:

b'@article{mangan2016inferring,\n  title={Inferring biological networks by sparse identification of nonlinear dynamics},\n  author={Mangan, Niall M and Brunton, Steven L and Proctor, Joshua L and Kutz, J Nathan},\n  journal={IEEE Transactions on Molecular, Biological and Multi-Scale Communications},\n  volume={2},\n  number={1},\n  pages={52--63},\n  year={2016},\n  publisher={IEEE}\n}\n\n'

##### Contact:

Any question, please mail to chenxofhit@gmail.com . 