README

Instructions for Mac:
(make sure you have Docker installed)
https://hub.docker.com/


Pulling the docker image from Docker Repo:

Docker Repo:
https://hub.docker.com/repository/docker/gabrielmarini123/fiborepo/general

Open a new Terminal and type:

docker pull gabrielmarini123/fiborepo:1.0.1

--------

Building the docker image from Github Repo:

Github Repo:
https://github.com/Gitgabgap/fiborepobackup

Open a terminal in the downloaded github repo folder and type:

docker build -t fibodemo-image .

-------------------

To run application, open Terminal, and type:

docker run -p 8080:8080 fibodemo-image

To run application, open Terminal, and type:

docker run -p 8080:8080 fibodemo-image

To access the app, open browser, navigate to:

http://localhost:8080/

---------------

To stop the application, just close the Terminal window.

Or:

Open (a new) Terminal and type: 

docker ps

(To find the container_id)

Then:

docker stop container_id



Or:

docker kill container_id



Thanks for reading this!

