# 1. Define a imagem base oficial do Java 17, usando uma versão Linux ultra leve (Alpine)
FROM eclipse-temurin:17-jdk-alpine

# 2. Informações de autoria para o seu portfólio
LABEL maintainer="davidabx-dev"
LABEL description="Microsserviço de Compensação Financeira - Certsys"

# 3. Define a pasta de trabalho dentro do contêiner Linux
WORKDIR /app

# 4. Copia o arquivo empacotado que o Maven gerou para dentro do contêiner
# Nota: O nome do arquivo JAR gerado fica na pasta /target
COPY target/certsys-financial-hub-0.0.1-SNAPSHOT.jar app.jar

# 5. Expõe a porta 8080 para que o mundo exterior possa falar com a API
EXPOSE 8080

# 6. O comando que o contêiner vai executar assim que for ligado
ENTRYPOINT ["java", "-jar", "app.jar"]