from selenium/standalone-chrome

RUN sudo useradd -ms /bin/bash javauser
USER javauser
WORKDIR /home/javauser

# Setup framework requirements
RUN sudo apt-get update && \
    sudo apt-get install -y maven && \
    sudo apt-get clean && \
    sudo mkdir reports && sudo chmod -R 777 reports
RUN sudo apt-get install -y wget openjdk-8-jdk-headless
COPY entrypoint.sh entrypoint.sh
COPY jupitertoys jupitertoys
RUN sudo chown -R javauser:javauser /home/javauser
WORKDIR /home/javauser/jupitertoys
RUN mvn -Dmaven.test.skip=true install
ENTRYPOINT ["../entrypoint.sh"]