create table Department(
departmentID number(10) not null PRIMARY KEY,
departName varchar2(50)not null,
managerID number(10));

drop table Department;

ALTER TABLE Department
ADD 
(
CONSTRAINT promo_idss_uyy foreign key(managerID) references  employeess (employeeID) on delete cascade
);  


create table employeess(
employeeID number(10) not null PRIMARY KEY,
firstName varchar2(50) not null,
lastName varchar2(50) not null,
email varchar2(50) not null,
phoneNumber number(10) not null,
hireDate date not null,
designation varchar2(50) not null,
salary number(10) not null,
managerID number(10),
departmentID number(10) not null,
CONSTRAINT promo_id_uy foreign key (departmentID) references Department(departmentID) on delete cascade);




drop table employeess;

insert into employeess values(1,'Ravi','a','lala0@yahoo.com',928237045,'12-Jan-2003','GM', 40000,'',1);
insert into employeess values(2,'Ricky','a','lala1@yahoo.com',918237945,'12-Jan-2000','AGM', 40000,1,1);
insert into employeess values(3,'Migom','a','lala2@yahoo.com',918227945,'12-Jan-2002','Manager', 35000,2,1);
insert into employeess values(4,'Ankit','a','lala3@yahoo.com',918237945,'12-Jan-2000','AGM', 40000,1,2);
insert into employeess values(5,'Avi','a','lala5@yahoo.com',918257945,'12-Jan-2002','Manager', 35000,4,2);
insert into employeess values(6,'Rothi','a','lala6@yahoo.com',926237945,'12-Jan-2003','AsstManager', 20000,5,2);
insert into employeess values(7,'Rohan','a','lala7@yahoo.com',928237945,'12-Jan-2003','AGM', 20000,1,3); 
insert into employeess values(8,'Gopal','a','lala8@yahoo.com',918257945,'12-Jan-2002','Manager', 35000,7,3);
insert into employeess values(9,'Bitop','a','lala9@yahoo.com',926237945,'12-Jan-2003','AsstManager', 20000,8,3);
insert into employeess values(10,'Troney','a','lala10@yahoo.com',918237945,'12-Jan-1997','AGM', 40000,1,5);
insert into employeess values(11,'Ishan','a','lala11@yahoo.com',918254945,'12-Jan-2002','Manager', 35000,10,5);
insert into employeess values(12,'Hitesh','a','lala12@yahoo.com',926227945,'12-Jan-2003','AsstManager', 20000,11,5);
insert into employeess values(13,'bfbf','abfb','lala12@bfbfbyah',9262245,'12-Jan-2003','Assnager', 2000,11,5);
delete from employeess;

select * from employeess;

UPDATE employeess 
set
managerid=1
WHERE employeeID=1;   



select * from employeess;
insert into Department values(1,'HR','');
insert into Department values(2,'Transport','');
insert into Department values(3,'Finance','');
insert into Department values(4,'GM','');
insert into Department values(5,'ADMIN','');
                                                            
select * from Department;
select * from employeess;

desc employeess

update Department
set managerid= 1
where departmentid=4;



UPDATE Department 
set
departName='HOD'
WHERE departmentId=4;   




CREATE SEQUENCE Department_sequence
START WITH 6;

CREATE SEQUENCE employeess_sequence
START WITH 13;


update employeess set departmentID = 2 where employeeID = 13;



SELECT e.FIRSTNAME ,f.departName FROM employeess e INNER JOIN Department f ON e.departmentID = f.departmentID;


SELECT employeess.FIRSTNAME ,Department.departName FROM employeess INNER JOIN Department ON employeess.departmentID = Department.departmentID;


SELECT * FROM Department INNER JOIN employeess ON Department.departmentID = employeess.departmentID;