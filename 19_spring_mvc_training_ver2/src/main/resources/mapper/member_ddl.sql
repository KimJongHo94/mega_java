CREATE DATABASE IF NOT EXISTS SPRING_MVC_TRAINING_VER2;
USE SPRING_MVC_TRAINING_VER2;

CREATE TABLE MEMBER (
    MEMBER_ID 				VARCHAR(20)  PRIMARY KEY,
    PASSWD 					VARCHAR(200) NOT NULL,
    PROFILE_ORIGINAL_NAME	VARCHAR(200) NOT NULL,
    PROFILE_UUID			VARCHAR(200) NOT NULL,
	MEMBER_NM 				VARCHAR(50)  NOT NULL,
	SEX 					CHAR(1)  	 NOT NULL,
	BIRTH_AT 				DATE     	 NOT NULL, 
	HP 						VARCHAR(13)  NOT NULL,
	SMSSTS_YN 				CHAR(1)   	 NOT NULL,
	EMAIL 					VARCHAR(30)  NOT NULL,
	EMAILSTS_YN 			CHAR(1)   	 NOT NULL,
	ZIPCODE 				VARCHAR(10),
	ROAD_ADDRESS 			VARCHAR(200),
	JIBUN_ADDRESS 			VARCHAR(200),
	NAMUJI_ADDRESS 			VARCHAR(200),
	ETC 					VARCHAR(3000),
	ACTIVE_YN				CHAR(1)		DEFAULT 'y',
	INACTIVE_AT				DATE		DEFAULT NULL,
	JOIN_AT 				DATE		DEFAULT (CURRENT_DATE)
);