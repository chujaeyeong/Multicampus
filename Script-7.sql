-- 확인문제 복습 

-- 2.
SELECT * FROM HR.PRODUCT3 
ORDER BY price DESC

-- 3.
SELECT NAME, CONTENT, PRICE, COMPANY 
FROM HR.PRODUCT3 
ORDER BY COMPANY 

-- 4. 
SELECT DISTINCT COMPANY 
FROM HR.PRODUCT3 

-- 5. 
SELECT price * 5 AS price5 
FROM HR.PRODUCT3 

-- 6. 
SELECT name, company 
FROM HR.PRODUCT3
WHERE price = 5000 

-- 7. 
SELECT price, company
FROM HR.PRODUCT3
WHERE price BETWEEN 3000 AND 6000 

-- 8. 
SELECT name, company 
FROM HR.PRODUCT3
WHERE company != 'c100'

-- 9. 
SELECT name, price  
FROM HR.PRODUCT3
WHERE company != 'c100' OR company = 'c200'

-- 10. 조건검색 (문자열포함)
SELECT *
FROM HR.PRODUCT3
WHERE name LIKE '%4'

-- 11. 
SELECT *
FROM HR.PRODUCT3
WHERE name LIKE '%food%'

-- 12. 수정 update 
UPDATE HR.PRODUCT3
SET content = '품절'
WHERE price = 5000

SELECT * FROM HR.PRODUCT3
WHERE price = 5000

-- 13. 
UPDATE HR.PRODUCT3
SET img = '0.png', price = 10000
WHERE id = '100' or id = '102'

SELECT * FROM HR.PRODUCT3

-- 14. delete는 컬럼명을 지정하지 않음. 
-- > insert, delete, update의 결과는 실행된 Row수! (정수)
-- > selec의 결과는 테이블이다! 
DELETE FROM HR.PRODUCT3
WHERE COMPANY = 'c100'

-- 15.
--> varchar2, char 의 차이 
--> varchar2 : var(변하다, variable) + char(문자)
--> 		   2글자면 2글자가 들어갈만큼만 저장공간을 사용 
--> 		   100글자면 100글자 들어갈 만큼 저장공간을 사용 
--> char : 저장공간이 고정됨  
DELETE FROM HR.PRODUCT3 -- ROW수
--> 저장공간은 남겨두고, 데이터만 지움 
--> 데이터를 복구/취소 가능 (rollback, 롤백) 


-- 문자함수 연습해보기 
-- 원본은 수정하지 않는 비파괴형 함수 

-- 대문자로 전환
SELECT UPPER(ENAME) FROM HR.EMP;

-- 소문자로 전환
SELECT LOWER(ENAME) FROM HR.EMP;

-- 첫글자만 대문자로 전환 
SELECT INITCAP(ENAME) FROM HR.EMP;

-- 글자 수를 세어주는 기능 
SELECT  LENGTH(ENAME) FROM HR.EMP;

-- 문자열 추출 
SELECT SUBSTR(ename, 2) FROM HR.EMP; -- 2번째 글자부터 끝까지 

SELECT * FROM HR.EMP

SELECT REPLACE(ENAME, ' ', '') FROM HR.EMP

UPDATE HR.EMP
SET COMM = 0
WHERE COMM IS NULL 


-- 문자함수, 숫자함수 정리 문제 

-- 1. ENAME의 글자 수 검색 
SELECT LENGTH(ENAME) FROM HR.EMP;

-- 2. JOB이 MANAGER인 사람의 ENAME 글자 수 검색
SELECT LENGTH(ENAME) FROM HR.EMP
WHERE job = 'manager'

-- 3. COMM이 NULL인 사람의 ENAME, JOB 검색 
SELECT ename, job FROM hr.emp 
WHERE comm IS NULL 

-- 4. COMM이 NULL이 아닌 사람의 HIREDATE 검색 
SELECT hiredate FROM HR.EMP 
WHERE comm IS NOT NULL 

-- 5. ENAME의 2번째 글자부터 끝까지 검색 
SELECT SUBSTR(ename, 1) FROM HR.EMP 

-- 6. JOB의 1번째 글자부터 3번째 글자까지 검색 
SELECT SUBSTR(ename, 1, 3) FROM HR.EMP 

-- 7. ENAME의 글자 중 K를 P로 변경하여 검색 
SELECT REPLACE(ename, 'K', 'P') FROM HR.EMP

-- 8. ENAME과 ENPNO을 이용하여 '7369번은 SMITH입니다' 로 출력 
SELECT empno || '번은' || ename || '입니다' FROM HR.EMP

-- 9. HIREDATE 이용하여 입사한 월과 요일을 출력 
SELECT hiredate, 
to_char(sysdate, 'mm') AS mm, TO_CHAR(sysdate,'day') AS DAY 
FROM HR.EMP

-- 10. JOB이 MANAGER이면 level1. SALESMAN이면 level2, 기타이면 level3라고 LEVEL_RESULT컬럼에 출력 
SELECT job,
CASE job
	WHEN 'manager' THEN 'level1'
	WHEN 'salesman' THEN 'level2'
	ELSE 'level3'
END AS level_result 
FROM HR.EMP



---------------------------------------------

SELECT * FROM HR.EMP

SELECT count(*)
FROM HR.EMP

SELECT count(SAL)
FROM HR.EMP

SELECT count(SAL), SUM(SAL), AVG(SAL), MIN(SAL), MAX(SAL)  
FROM HR.EMP
WHERE JOB = 'SALESMAN'

SELECT count(SAL), SUM(SAL), AVG(SAL), MIN(SAL), MAX(SAL)  
FROM HR.EMP
GROUP BY JOB

SELECT count(SAL), SUM(SAL), AVG(SAL), MIN(SAL), MAX(SAL)  
FROM HR.EMP
GROUP BY JOB
ORDER BY JOB DESC 

SELECT count(SAL), SUM(SAL), AVG(SAL), MIN(SAL), MAX(SAL)  
FROM HR.EMP
GROUP BY JOB
HAVING COUNT(SAL) >= 4 -- 그룹을 지어서 검색 후, 필터링을 하고자 하는 경우 
ORDER BY JOB DESC -- 이미 모든 검색이 다 끝난 후, 그 결과를 정렬하고자 하는 경우 


-- 집계/그룹함수 정리 문제 

-- 1. 전체 직원 수 출력 
SELECT COUNT(EMPNO) FROM HR.EMP

-- 2. DEPTNO가 20이거나 MGR이 7700이하인 직원 수 출력 
SELECT COUNT(EMPNO) FROM HR.EMP
WHERE DEPTNO = 20 OR MGR <= 7700

-- 3. DEPTNO가 10 또는 20인 직원의 SAL 최저 출력 
SELECT MIN(SAL) FROM HR.EMP
WHERE DEPTNO = 10 OR DEPTNO = 20

-- 4. 직원의 SAL최저, 최고, 합계 출력 
SELECT MIN(SAL), MAX(SAL), SUM(SAL) FROM HR.EMP

-- 5. DEPTNO별 SAL 평균 출력 
SELECT avg(SAL) FROM HR.EMP
GROUP BY DEPTNO 

-- 6. DEPTNO별 SAL 합계를 DEPTNO 오름차순으로 출력 
SELECT SUM(SAL) FROM HR.EMP
GROUP BY DEPTNO 
ORDER BY DEPTNO ASC  

-- 7. DEPTNO별 SAL 평균이 2000 이상인 SAL 평균을 DEPTNO 역순으로 출력 
SELECT AVG(SAL) FROM HR.EMP
GROUP BY DEPTNO 
HAVING AVG(SAL) >= 2000
ORDER BY DEPTNO DESC 

-- 8. JOB이 MANAGER인 직원의 전체 수, 월급의 평균 검색 
SELECT COUNT(EMPNO), AVG(SAL)
FROM HR.EMP
WHERE JOB = 'MANAGER'

-- 9. ENAME에 S를 포함하는 직원의 전체 수를 검색 
SELECT COUNT(*) FROM HR.EMP
WHERE ENAME LIKE '%S%'

-- 10. SAL이 3000 이상이고, COMM이 null이 아닌 직원의 전체 수 검색, SAL의 역순으로 출력 
SELECT * FROM HR.EMP 
WHERE SAL >= 1000 AND 'COMM' IS NOT NULL 
ORDER BY SAL DESC 
