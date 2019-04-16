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



mybatis
```
mybatis streaming query http://ifeve.com/mybatis%E4%B8%AD%E4%BD%BF%E7%94%A8%E6%B5%81%E5%BC%8F%E6%9F%A5%E8%AF%A2%E9%81%BF%E5%85%8D%E6%95%B0%E6%8D%AE%E9%87%8F%E8%BF%87%E5%A4%A7%E5%AF%BC%E8%87%B4oom/

page query:
https://zhuanlan.zhihu.com/p/51104501
```
