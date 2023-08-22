-- 스키마 -> 데이터 입력, CUD 테스트 -> join 테스트 

SELECT * 
FROM HR."SUBJECT2" s
INNER JOIN HR."record" r
ON (s.강좌이름 = r.강좌이름)

SELECT * 
FROM HR."record" r
INNER JOIN HR."STUDENT_INFORMATION" st 
ON (r.학생번호 = st.학생번호)

SELECT s.강의실 
FROM HR."SUBJECT2" s
INNER JOIN HR."record" r
ON (s.강좌이름 = r.강좌이름)

SELECT * 
FROM HR."STUDENT_INFORMATION" st 
LEFT JOIN HR."DEPARTMENT" d 
ON (st.학과 = d.학과)

SELECT d."학과 사무실" 
FROM HR."STUDENT_INFORMATION" st 
RIGHT JOIN HR."DEPARTMENT" d 
ON (st.학과 = d.학과)

SELECT *
FROM hr.STUDENT_INFORMATION 
WHERE 학생번호 IN 
(SELECT 학생번호 FROM hr."record" WHERE 성적 = 4)

SELECT *
FROM hr."record" 
WHERE 강좌이름 =
(SELECT 강좌이름 FROM hr.SUBJECT2 WHERE 강의실 = 'B101') 

SELECT * FROM hr."MEMBER" 
WHERE ID IN ('apple', 'ice')

SELECT * FROM hr."MEMBER" 
WHERE id IN 
(SELECT writer FROM hr.BBS)

SELECT * 
FROM HR.YT_CONTENTS con
INNER JOIN HR.YT_USER u
ON (con.이용자명 = u.이용자명)

SELECT con.고유번호, 영상제목, 영상내용, com.댓글내용, u.이용자명 
FROM hr.YT_CONTENTS con
INNER JOIN hr.YT_COMMENTS com ON (con.고유번호 = com.고유번호) 
INNER JOIN hr.YT_USER u ON (u.이용자명 = com.이용자명) 

----------------------------------- 

INSERT INTO hr."MEMBER"
VALUES ('com', 'com', 'com', 'com')

UPDATE hr."MEMBER" SET TEL = '999'
WHERE id = 'com'

DELETE FROM hr."MEMBER" 
WHERE id = 'com'

SELECT * FROM hr."MEMBER" 


