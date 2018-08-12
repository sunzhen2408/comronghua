FROM dockersunibm/finaltomcatimage0701
RUN ls
RUN mkdir /comronghua
COPY . /comronghua
RUN ls
WORKDIR comronghua
RUN ls
ENV JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF8
RUN mvn clean package
RUN cp target/com.ronghua.war /opt/apache-tomcat-8.5.32/webapps/
CMD ["./opt/apache-tomcat-8.5.32/bin/catalina.sh","run"]

