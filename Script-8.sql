-- join 연습하기 (BBS & MEMBER)

-- join 은 왜 하는가? 
-- : 검색을 하고 싶은데, 항목들이 여러개의 테이블에 흩어져있는 경우 
--   테이블을 모아서(합해서) 검색을 할 수 있게 해줌 

SELECT * FROM HR."MEMBER" m, HR."BBS" b
WHERE m.ID = b.WRITER 

-- Inner join : 양쪽 테이블간 공통된 값만 추출  

SELECT b."no", title, NAME 
FROM HR."MEMBER" m, HR."BBS" b
WHERE m.ID = b.WRITER 

-- outer join : 한 쪽은 다 보이게 하고, 한 쪽은 공통된 값만 출력 
-- left join :  왼쪽 테이블(table1)의 모든 레코드와 
-- 				오른쪽 테이블(table2)의 일치하는 레코드를 추출 
-- 				교집합 + 오른

-- right join : 오른쪽 테이블(table2)의 모든 레코드와 
-- 				왼쪽 테이블(table1)의 일치하는 레코드를 추출 

SELECT e.EMPNO, e.ENAME, e.JOB, d.DEPTNO, d.LOC 
FROM HR.DEPT d, HR.EMP e
WHERE d.DEPTNO = e.DEPTNO 

SELECT *
FROM HR."MEMBER" m 
LEFT OUTER JOIN HR.BBS b 
on (m.ID = b.WRITER)

SELECT *
FROM HR."MEMBER" m 
LEFT OUTER JOIN HR.BBS b 
on (m.ID = b.WRITER) 

SELECT *
FROM HR."MEMBER" m 
RIGHT OUTER JOIN HR.BBS b 
on (m.ID = b.WRITER)


CREATE TABLE HR.COMPANY (
	id varchar2(200) PRIMARY KEY,
	name varchar2(200),
	addr varchar2(200),
	tel varchar2(200)
)

SELECT * FROM HR.COMPANY


---------------------------
-- company, product 로 join 연습하기 

SELECT * FROM HR."COMPANY" c
INNER JOIN HR."PRODUCT" p
ON (c.ID = p.COMPANY)

SELECT * FROM HR."COMPANY" c
LEFT OUTER JOIN HR."PRODUCT" p
ON (c.ID = p.COMPANY)

SELECT * FROM HR."PRODUCT" p
LEFT OUTER JOIN HR."COMPANY" c
ON (c.ID = p.COMPANY)

SELECT * FROM HR."COMPANY" c
RIGHT OUTER JOIN HR."PRODUCT" p
ON (c.ID = p.COMPANY)

SELECT * FROM HR."PRODUCT" p
RIGHT OUTER JOIN HR."COMPANY" c
ON (c.ID = p.COMPANY) 

------- 정리문제 

-- 1. SQL을 3가지로 구분, 각각 간단 설명, 예를 들어보세요.
-- : DDL(스키마, CREATE 등) DML(데이터 조작, INSERT등 ) DCL(DB제어관리, CREATE USER, GRANT 등) 

-- 2. DML로 할 수 있는 조작 3가지를 부르는 말 
-- : CRUD

-- 3. DML의 조작 4가지에 해당하는 각 SQL문 
-- : 인서트, 셀렉트, 업데이트, 딜리트  

-- 4. 정형데이터베이스란?
-- : DB

-- 5. 스키마란? 
-- : 틀, DB명 + 테이블명 + 컬럼명 + 제약조건

-- 6. 제약조건이란? 예 1가지 이상 
-- : NOT NULL, pk, fk 등 

-- 7. PRIMARY KEY 를 왜 설정하는가?
-- : not null, UNIQUE 설정 

-- 8. FOREIGN KEY 를 왜 설정하는가? 
-- : 문제가 있는 데이터가 들어가지 않게 자동 체크 

-- 9. 저장할 대상을 부르는 말? 한글 / 영어 
-- : 개체 / 엔터티(엔티티)

-- 10. varchar2와 char의 차이 
-- : 바캐릭터는 가변, 캐릭터는 불변 

-- 11. join을 왜 하는가? 
-- : 검색할 내용이 여러 테이블을 합해서 해야하는 경우 

-- 12. join의 3가지 종류 비교 
-- : 이너조인, 레프트아우터조인, 라이트아우터조인 

