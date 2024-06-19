FROM gitlab.foxtons-cloud.link:5050/qaautomation/uiautomation:fx-maven-base
WORKDIR /APP
ADD . /APP
RUN  mvn clean install
RUN  mvn clean test -Dbrowser=headlesschrome
RUN mvn allure:serve 

