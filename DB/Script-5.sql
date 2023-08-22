CREATE TABLE "HR"."NOTICE" 
   (	"BOARDNO" NUMBER(38,0), 
	"TITLE" VARCHAR2(100), 
	"CONTENT" VARCHAR2(100), 
	"WRITER" VARCHAR2(100), 
	"WRITEDATE" DATE, 
	"RECOMMEND" NUMBER(38,0), 
	"VIEWCOUNT" NUMBER(38,0)
   )
   
   -- 추천게시판을 만들어보자 (recommend)
   -- re_no 숫자,  
   
  CREATE TABLE RECOMMEND ( 
  	RE_NO NUMBER(38,0),
	TITLE VARCHAR2(100),
	CONTENT VARCHAR2(100),
	WRITER VARCHAR2(100)
	)
	
	DROP TABLE RECOMMEND 
	
	  CREATE TABLE RECOMMEND ( 
  	RE_NO NUMBER(38,0),
	TITLE VARCHAR2(100),
	CONTENT VARCHAR2(100),
	WRITER VARCHAR2(100)
	)
	
		DROP TABLE RECOMMEND 
		
	CREATE TABLE RECOMMEND ( 
  	RE_NO NUMBER(38,0),
	TITLE VARCHAR2(100),
	CONTENT VARCHAR2(100),
	WRITER VARCHAR2(100)
	)
	
	
	-- DCL : DB 관리 / 제어해주는 문법 (계정생성, 계정권한부여, 백업, 복구 )
	
	CREATE USER APPLE IDENTIFIED BY a1234
	
	GRANT CONNECT, RESOURCE, DBA TO APPLE
	
	INSERT INTO "MEMBER" VALUES ('100', '100', 'park', '011')
	
	INSERT INTO "MEMBER" VALUES ('200', '200', 'park', '011')
	
	INSERT INTO "MEMBER" VALUES ('300', '300', 'park', '011')
	
	SELECT * FROM "MEMBER"

	SELECT id, name FROM "MEMBER" WHERE id = '100' -- id가 100인 id 컬럼 

	SELECT name, id FROM "MEMBER" WHERE id = '100' -- id가 100인 id 컬럼

	SELECT id AS 아이디 FROM "MEMBER" WHERE id = '100' -- id가 100인 id 컬럼
	
	SELECT tel FROM "MEMBER" WHERE NAME = 'park'
	
	UPDATE "MEMBER" SET name = 'kim' WHERE ID = '100'

	UPDATE "MEMBER" SET name = 'yang' WHERE ID = '200'

	UPDATE "MEMBER" SET name = 'lee' WHERE ID = '300'
	
	SELECT * FROM "MEMBER"
	
	UPDATE "MEMBER" SET pw = '8888', tel = '9999' WHERE id = 'ice'
	
	DELETE FROM "MEMBER" WHERE id = '100'

	DELETE FROM "MEMBER" WHERE tel = '011'
	
	SELECT * FROM "MEMBER" WHERE id = '200' AND tel = '011'

	SELECT * FROM "MEMBER" WHERE id = '200' OR tel = '011'
	
	
CREATE TABLE product (
	id varchar2(200), 
	name varchar2(200), 
	content varchar2(200), 
	price varchar2(200), 
	company varchar2(200), 
	img varchar2(200)
)

SELECT * FROM "MEMBER" ORDER BY id -- 오름차순 

SELECT * FROM "MEMBER" ORDER BY id DESC -- 내림차순 

SELECT * FROM "PRODUCT"

SELECT * FROM "PRODUCT" ORDER BY price DESC -- 1 

SELECT * FROM "PRODUCT" ORDER BY company -- 2 

SELECT id FROM "PRODUCT" WHERE id = '100' -- 3

SELECT name, company FROM "PRODUCT" WHERE price = '5000' -- 4

SELECT name, img FROM "PRODUCT" WHERE id = '100' AND price = '1000' -- 5

SELECT company, img FROM "PRODUCT" WHERE company = 'c100' -- 6

SELECT name, price FROM "PRODUCT" WHERE company = 'c100' OR company = 'c200' -- 7

UPDATE "PRODUCT" SET content = 'sold out' WHERE price = '5000' -- 8

UPDATE "PRODUCT" SET img = 'o.png', price = '10000' WHERE id = '100' OR id = '200' -- 9

SELECT * FROM "PRODUCT"

UPDATE "PRODUCT" SET company = 'apple', name = 'appleshose' WHERE id = '101' -- 10

DELETE FROM "PRODUCT" WHERE name = 'shose1' OR id = '107' -- 11

DELETE FROM "PRODUCT" WHERE company = 'c100' -- 12

DELETE FROM "PRODUCT" -- 13

DROP TABLE PRODUCT -- 14






