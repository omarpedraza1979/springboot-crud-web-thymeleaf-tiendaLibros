# Spring Boot CRUD Web - Tienda de Libros

Este es un proyecto **Spring Boot CRUD Web** desarrollado con **Thymeleaf** para la gestión de una tienda de libros.

## 🚀 Tecnologías utilizadas
- Java 17+
- Spring Boot
- Spring Data JPA (con MySQL)
- Thymeleaf
- Bootstrap
- Eclipse IDE

## ⚙️ Ejecución del proyecto

### 🔹 Opción 1: Desde Eclipse
El proyecto fue desarrollado en **Eclipse IDE**.  
Puedes ejecutarlo fácilmente haciendo clic en el botón **Play ▶️** dentro de Eclipse, seleccionando la clase principal:

```
src/main/java/com/example/CrudTiendaLibrosApplication.java
```

### 🔹 Opción 2: Desde consola con Maven
También puedes ejecutarlo desde la línea de comandos con:

```bash
mvn spring-boot:run
```

### 🔹 Opción 3: Ejecutar JAR
Si deseas empaquetar el proyecto y ejecutar el JAR:

```bash
mvn clean package
java -jar target/springboot-crud-web-thymeleaf-tiendaLibros-0.0.1-SNAPSHOT.jar
```

## 🛠 Configuración de la base de datos
En el archivo `src/main/resources/application.properties` asegúrate de configurar tu conexión a MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tienda_libros
spring.datasource.username=tu_usuario
spring.datasource.password=tu_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 📸 Capturas de pantalla

```markdown
![inicio](docs/images/inicial.png)
![Libros Disponibles](docs/images/LibrosDisponibles.png)
![Registrar Libros](docs/images/RegistrarLibro.png)
![Mis Libros](docs/images/MisLibros.png)

```

## 📂 Estructura del proyecto

```

├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───bookstore
│   │   │           ├───controller
│   │   │           ├───entity
│   │   │           ├───repository
│   │   │           └───service
│   │   └───resources
│   │       ├───static
│   │       │   └───images
│   │       └───templates
│   └───test
│       └───java
│           └───com
│               └───bookstore


```

## 👨‍💻 Autor
Proyecto desarrollado por **Omar Pedraza** como parte de práctica en **Spring Boot + Thymeleaf**.
