![master](https://github.com/Kiselev777/FileFtpClient/actions/workflows/maven.yml/badge.svg?branch=master)


FTP client to get list and download files from an FTP server
My service contains 2 classes:
1. FtpClient - connecting to server, close connection\ get collection files, put in the path or download.
2. FtpApp - user interaction with service. Data to connecting.

Usage, via Docker:
1. Build docker image via ```docker build -t [image_name] https://github.com/Kiselev777/FileFtpClient```
2. Run ```docker run [image_name] java -jar FtpClient1.jar [server,port,user,password]```

