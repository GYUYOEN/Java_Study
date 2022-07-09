-- 계정과 패스워드 생성하는 방법
CREATE USER study IDENTIFIED BY study;

-- 생성한 계정에 권한 부여
-- CONNECT : 접속과 관련된 묶음, 
-- RESOURCE : 데이터베이스의 자원을 사용할 수 있게 해줌
GRANT RESOURCE, CONNECT TO study;
GRANT INSERT ANY TABLE, UPDATE ANY TABLE
	, DELETE ANY TABLE, CREATE VIEW
	TO study;
GRANT CREATE SESSION TO study;

-- 테이블스페이스 사용 권한 부여
ALTER USER study quota 10M ON USERS;