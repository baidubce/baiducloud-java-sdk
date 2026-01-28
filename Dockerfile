# Using openjdk 17 with skywalking agent
# FROM iregistry.baidu-int.com/baidu-base/openjdk:17-jre-skywalking-alpine3.16
FROM iregistry.baidu-int.com/baidu-base/openjdk:17-jre-alpine3.16

ENV APP_NAME=baiducloud-java-sdk \
#   When using skywalking agent, plz uncomment the following lines:
#   SW_AGENT_COLLECTOR_BACKEND_SERVICES="127.0.0.1:11800" \
#   SW_AGENT_NAME="baiducloud-java-sdk" \
#   SW_AGENT_NAMESPACE="namespace"
    CONFIG_LOCATION=/app/config/application.properties

WORKDIR /app
# 复制output下spring-boot的jar文件到/app路径下
COPY output/baiducloud-java-sdk-1.0.0-SNAPSHOT.jar /app/baiducloud-java-sdk-1.0.0-SNAPSHOT.jar

# 以下为默认启动命令
# 如果使用Skywalking, 请改为如下命令
# ENTRYPOINT ["sh", "-c", "java -Duser.timezone=GMT+08 $JAVA_OPTS \
# -jar /app/baiducloud-java-sdk-1.0.0-SNAPSHOT.jar --spring.config.location=$CONFIG_LOCATION -javaagent:/skywalking/agent/skywalking-agent.jar"]
# 如果指定特定环境的配置文件, 请增加 --spring.config.location=$CONFIG_LOCATION 参数
ENTRYPOINT ["sh", "-c", "java -Duser.timezone=GMT+08 $JAVA_OPTS \
-jar /app/baiducloud-java-sdk-1.0.0-SNAPSHOT.jar"]