# 指定基础镜像
FROM java:8

# 拷贝 jar 包到容器内
COPY *.jar /app.jar

# 指定运行参数
CMD ["--server.port=8080"]

# 暴露端口
EXPOSE 8080

# 指定启动时调用的命令
ENTRYPOINT ["java","-jar","/app.jar"]