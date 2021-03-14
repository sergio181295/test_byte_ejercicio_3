Este es un API REST de un CRUD para la entidad empresas

Se utilizo el IDE Spring Tool Suite 4 es un eclipse configurado para usar spring con maven y tomcat incluido

Para ejecutar:

Base de datos
	1. Ejecute scritp bytedb, creara el esquema y la tabla necesaria

Servidor
	1. Descargar el Spring Tool Suite 4 https://spring.io/tools
	2. Abrir el proyecto desde el IDE
	3. Actualzar dependencias, click derecho en proyecto -> Maven -> Update project
	4. Configure conexion de base de datos
		- Abra el archivo application.properties ubicado en \src\main\resources
		- Modifique el atributo spring.datasource.username con el nombre de usuario
		- Modifique el atributo spring.datasource.password con la contraseña
		- Si desea cambiar al puerto modifiquelo en el atributo spring.datasource.url
	5. Iniciar servidor, click derecho en proyecto -> Run as -> Spring boot app
		-El servidor se iniciara usando el puerto 9000, si desea cambiarlo modifique el atributo 
		server.port del archivo application.properties

Las rutas disponibles las puede encontra documentadas en el siguien link

https://documenter.getpostman.com/view/2973272/Tz5qaxGp