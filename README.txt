README

Github Repo:
https://github.com/Gitgabgap/fiborepobackup

Docker Repo:
https://hub.docker.com/repository/docker/gabrielmarini123/fiborepo/general

Instructions for Mac:

Run in Terminal:

docker pull gabrielmarini123/fiborepo:1.0.1

To run application, open Terminal, and type:

docker run -p 8080:8080 fibodemo-image

To access the app, open browser, navigate to:

http://localhost:8080/

To stop, just close the window.

Or:

Open (a new) Terminal and type: 

docker ps

(To find the container_id)

Then:

docker stop container_id



Or:

docker kill container_id



Thanks for reading this!

