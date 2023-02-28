
create table person
(
	id integer not null, 
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);


INSERT INTO PERSON
       (ID,NAME,LOCATION,BIRTH_DATE)
VALUES
      (10001,'PRATAP','BIKANER',CURRENT_DATE);
      
INSERT INTO PERSON
       (ID,NAME,LOCATION,BIRTH_DATE)
VALUES
      (10002,'NAMAN','BASODA',CURRENT_DATE);
      
INSERT INTO PERSON
       (ID,NAME,LOCATION,BIRTH_DATE)
VALUES
      (10003,'GUDIYA','VIDISHA',CURRENT_DATE);
