FROM dockersunibm/finaltomcatimage0701
RUN mkdir /comronghua
COPY . /comronghua
RUN cd /comronghua
RUN ls
RUN mvn clean package
RUN cd target
RUN cp com.ronghua.war /opt/apache-tomcat-8.5.32/webapps/
CMD ["./opt/apache-tomcat-8.5.32/bin/catalina.sh",run]

