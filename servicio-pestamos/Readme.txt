- El servicio web esta desarrollado en REST
  Se entrega war y código fuente del proyecto:
  El war se puede montar en un servidor Tomcat desde Eclipse IDE.
  El código fuente del proyecto se puede importar o abrir y ejecutar desde Eclipse IDE tambien sobre servidor Tomcat.

- El cliente fue desarrollado en JAVA JSP:
  Este se puede importar o abrir desde Eclipse IDE Y ejecutar sobre servidor Tomcat.
- Motor de bases de datos MYSQL.

Pasos:
1- Ejecutar Script de BD con configuraciones necesarias detalladas en el docuemnto en la carpetas de servicios.
2- Montar el war en un servidor Tomcat y ejecutarlo, se sugiere hacer pruebas al servicio desde herramientas como PsotMan o SOAP UI para comprobar correcto funcionamiento y respuesta del servicio, en la carpeta de servicios y el mismo documento estan las instrucciones necesarias para probar el servicio.
3-Montar la aplicación cliente Java JSP en un servidor Tomcat y ejecutar, asegurarse de que descarguen las librerias necesarias(La GSON a veces da problemas).

Tecnologías usadas:

Java 
JSP
GSON(Aunque esta cargada la libreria puede generar problemas, ya logrando descargarla funciona correctamente)
SERVICIOS WEB REST
MYSQL
Eclipse IDE for Enterprise Java Developers Version: 2018-12 (4.10.0)
TOMCAT v8.5
