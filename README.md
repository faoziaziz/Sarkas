# Untuk insert

```sql
INSERT INTO `crot` (`id`,`name`,`email`) VALUES (1,'germo','admin@labseni.com');  
```

```sql
INSERT INTO `Crot` (`id`,`name`,`email`) VALUES (1,'germo2','admin@labseni.com');  
```


## Create Table

```sql
CREATE TABLE IF NOT EXISTS Crot (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);
```

## Referensi 
1. [Untuk case sensitif] (https://stackoverflow.com/questions/28571848/spring-boot-jpa-insert-in-table-with-uppercase-name-with-hibernate) 