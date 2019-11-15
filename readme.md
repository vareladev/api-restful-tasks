### Descripción

Aplicación web con Spring Boot que ofrece un API REST para gestionar una lista de tareas. El API contiene los siguientes endpoints:

- GET /tasks -> devuelve todas las tareas
- POST /tasks -> crea una tarea (recibe un formulario con un campo description)
- GET /tasks/{id} -> devuelve una tarea
- PUT /tasks/{id} -> modifica una tarea (recibe un formulario con un campo description)
- DELETE /tasks/{id} -> elimina una tarea

####v1.0
- Las tareas se almacenan en memoria utilizando una lista.
