
CREATE TABLE `hobby2` (
  `hobbyid` varchar(100) DEFAULT NULL,
  `content` varchar(100) DEFAULT NULL,
  `location` varchar(100) DEFAULT NULL
)


insert into hobby2 values ('100', 'run', 'seoul')

insert into hobby2 values ('200', 'book', 'busan')


select * from hobby2

SELECT content FROM hobby2

SELECT content, location FROM hobby2
