FROM ubuntu:latest
LABEL authors="88693"

# Step 1: 使用官方的 Java 17 基礎映像
FROM openjdk:17-jdk-alpine

# Step 2: 設定工作目錄
WORKDIR /app

# Step 3: 複製專案的 jar 檔到容器中
COPY target/SWFinal-0.0.1-SNAPSHOT.jar /app/app.jar

# Step 4: 暴露應用程序端口
EXPOSE 8080

# Step 5: 執行 jar 檔案
ENTRYPOINT ["java", "-jar", "app.jar"]