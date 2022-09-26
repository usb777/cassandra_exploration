Cassandra Exploration project

>1: cassandra

>2: C:\Cassandra\apache-cassandra-3.11.6\bin\cqlsh.py


>CREATE KEYSPACE "dzen" WITH replication = {'class': 'SimpleStrategy', 'replication_factor' : 3};

>use dzen

>CREATE TABLE emp(emp_id int PRIMARY KEY, emp_name text, emp_city text, emp_sal varint, emp_phone varint );

dzen> select * from emp;

dzen> INSERT INTO emp (emp_id, emp_name, emp_city, emp_phone, emp_sal) VALUES(1,'ram', 'Hyderabad', 9848022338, 50000);

dzen> INSERT INTO emp (emp_id, emp_name, emp_city, emp_phone, emp_sal) VALUES(2,'robin', 'Hyderabad', 9848022339, 40000);

dzen> INSERT INTO emp (emp_id, emp_name, emp_city,  emp_phone, emp_sal) VALUES(3,'rahman', 'Chennai', 9848022330, 45000);



--------------------------------------------------------------------------------------------
Links: https://www.baeldung.com/cassandra-with-java
Links: https://www.tutorialspoint.com/cassandra/cassandra_cql_datatypes.htm



