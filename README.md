README

update: fixed the sorting code
update: changed the README.txt to README.md; less issues

Java version: 17

Instructions for Mac:
(make sure you have Docker installed)
https://hub.docker.com/

-------- 
Suggested method: pulling the image from my Docker Repo
-------- 
(Requires Docker desktop / Daemon to be running)

Pulling the docker image from Docker Repo:

Docker Repo:
https://hub.docker.com/repository/docker/gabrielmarini123/fiborepo/general

Open a new Terminal and type:

docker pull gabrielmarini123/fiborepo:1.0.1

Running the image pulled from Docker Repo:

docker run -p 8080:8080 gabrielmarini123/fiborepo:1.0.1

To access the app, open browser, navigate to:

http://localhost:8080/

-------- 
Alternative method: pulling source code from my Githhub and building the image from source code using an IDE
-------- 
(Requires an IDE of your choice, recommended: Visual Studio Code)
(Requires your Java HOME to be set to version 17)

Github Repo:
https://github.com/Gitgabgap/fiborepobackup

Building the docker image from Github Repo:

Open a Terminal in the downloaded github repo folder and type:

docker build -t fibodemo-image .

To run application built from Github Repo, open Terminal, and type:

docker run -p 8080:8080 fibodemo-image

To access the app, open browser, navigate to:

http://localhost:8080/

--------

To stop the application, just close the Terminal window.

Or:

Open (a new) Terminal and type: 

docker ps

(To find the container_id)

Then:

docker stop container_id


Or:

docker kill container_id

--------

Thanks for reading this!
