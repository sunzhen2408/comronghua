FROM dockersunibm/finaltomcatimage0701
RUN ls
RUN mkdir /comronghua
COPY . /comronghua
RUN ls
RUN WORKDIR comronghua
RUN ls
RUN mvn clean package
RUN WORKDIR target
RUN cp com.ronghua.war /opt/apache-tomcat-8.5.32/webapps/
CMD ["./opt/apache-tomcat-8.5.32/bin/catalina.sh",run]

