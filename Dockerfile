FROM dockersunibm/finaltomcatimage0701
RUN ls
#RUN mkdir /
COPY . /opt/apache-tomcat-8.5.32/
RUN ls
WORKDIR /opt/apache-tomcat-8.5.32/
RUN ls
ENV JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF8
RUN mvn clean package
RUN cp target/com.ronghua.war webapps/
CMD ["./bin/catalina.sh","run"]

