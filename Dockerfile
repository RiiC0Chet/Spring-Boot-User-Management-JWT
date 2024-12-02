# Usa una imagen base de JDK
FROM openjdk:17-jdk-alpine

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Expone el puerto que usa tu aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación (el JAR estará presente gracias al volumen)
CMD ["sh", "-c", "java -jar /app/target/erp_management-0.0.1-SNAPSHOT.jar"]