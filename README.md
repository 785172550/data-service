# data-service

mybatis demo web app. mybatis configured by **xml** file.

### regarding the config file:
```python
application-dev.properties: is for mysql DB
application-test.properties: is for h2 DB, memory model

db/schema.sql: is DB initial sql
h2 DB config indicates the hikari connection pool
```

### project structure

```python
UserController.java is CRUD for users table.
SampleDataController.java is pure controller for web api, without any DAO operation.

```
