#FROM gradle:jdk8
#COPY . /home/gradle/project
## вместо . надо путь на root
#WORKDIR /home/gradle/project
#ENTRYPOINT ["gradle"]
#CMD ["bootRun"]