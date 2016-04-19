-- 수강신청
DROP TABLE LEC_APPL;

-- 교육과정
DROP TABLE LECTURES;

-- 강의장
DROP TABLE ROOMS;

-- 강사
DROP TABLE TEACHERS;

-- 주소
DROP TABLE ADDRS;

-- 강의장사진
DROP TABLE ROOM_PHOTO;

-- 강사배치
DROP TABLE TEA_ASSIGN;

-- 회원
DROP TABLE MEMBERS;

-- 수강신청
CREATE TABLE LEC_APPL (
	APNO   INTEGER     NOT NULL, -- 수강신청번호
	LNO    INTEGER     NOT NULL, -- 교육과정번호
	MNO    INTEGER     NOT NULL, -- 회원번호
	AP_TYP VARCHAR(10) NOT NULL, -- 신청유형
	CR_DT  DATE        NOT NULL  -- 신청일
);

-- 수강신청 기본키
CREATE UNIQUE INDEX PK_LEC_APPL
	ON LEC_APPL ( -- 수강신청
		APNO ASC -- 수강신청번호
	);

-- 수강신청
ALTER TABLE LEC_APPL
	ADD
		CONSTRAINT PK_LEC_APPL -- 수강신청 기본키
		PRIMARY KEY (
			APNO -- 수강신청번호
		);

-- 수강신청
COMMENT ON TABLE LEC_APPL IS '수강신청';

-- 수강신청번호
COMMENT ON COLUMN LEC_APPL.APNO IS '수강신청번호';

-- 교육과정번호
COMMENT ON COLUMN LEC_APPL.LNO IS '교육과정번호';

-- 회원번호
COMMENT ON COLUMN LEC_APPL.MNO IS '회원번호';

-- 신청유형
COMMENT ON COLUMN LEC_APPL.AP_TYP IS '신청유형';

-- 신청일
COMMENT ON COLUMN LEC_APPL.CR_DT IS '신청일';

-- 수강신청 기본키
COMMENT ON INDEX PK_LEC_APPL IS '수강신청 기본키';

-- 수강신청 기본키
COMMENT ON CONSTRAINT LEC_APPL.PK_LEC_APPL IS '수강신청 기본키';

-- 교육과정
CREATE TABLE LECTURES (
	LNO    INTEGER      NOT NULL, -- 교육과정번호
	RNO    VARCHAR(10)  NULL,     -- 강의장코드
	TITL   VARCHAR(255) NOT NULL, -- 과목명
	DESCT  TEXT         NOT NULL, -- 설명
	ST_DT  DATE         NOT NULL, -- 강의시작일
	EN_DT  DATE         NOT NULL, -- 강의종료일
	DAY_HR INTEGER      NOT NULL, -- 일강의시간
	TOT_HR INTEGER      NOT NULL, -- 총강의일
	FI_DT  DATE         NOT NULL  -- 신청마감일
);

-- 교육과정 기본키
CREATE UNIQUE INDEX PK_LECTURES
	ON LECTURES ( -- 교육과정
		LNO ASC -- 교육과정번호
	);

-- 교육과정 인덱스
CREATE INDEX IX_LECTURES
	ON LECTURES( -- 교육과정
		TITL ASC -- 과목명
	);

-- 교육과정
ALTER TABLE LECTURES
	ADD
		CONSTRAINT PK_LECTURES -- 교육과정 기본키
		PRIMARY KEY (
			LNO -- 교육과정번호
		);

-- 교육과정
COMMENT ON TABLE LECTURES IS '교육과정';

-- 교육과정번호
COMMENT ON COLUMN LECTURES.LNO IS '교육과정번호';

-- 강의장코드
COMMENT ON COLUMN LECTURES.RNO IS '강의장코드';

-- 과목명
COMMENT ON COLUMN LECTURES.TITL IS '과목명';

-- 설명
COMMENT ON COLUMN LECTURES.DESCT IS '설명';

-- 강의시작일
COMMENT ON COLUMN LECTURES.ST_DT IS '강의시작일';

-- 강의종료일
COMMENT ON COLUMN LECTURES.EN_DT IS '강의종료일';

-- 일강의시간
COMMENT ON COLUMN LECTURES.DAY_HR IS '일강의시간';

-- 총강의일
COMMENT ON COLUMN LECTURES.TOT_HR IS '총강의일';

-- 신청마감일
COMMENT ON COLUMN LECTURES.FI_DT IS '신청마감일';

-- 교육과정 기본키
COMMENT ON INDEX PK_LECTURES IS '교육과정 기본키';

-- 교육과정 인덱스
COMMENT ON INDEX IX_LECTURES IS '교육과정 인덱스';

-- 교육과정 기본키
COMMENT ON CONSTRAINT LECTURES.PK_LECTURES IS '교육과정 기본키';

-- 강의장
CREATE TABLE ROOMS (
	RNO VARCHAR(10)  NOT NULL, -- 강의장코드
	RNM VARCHAR(100) NOT NULL  -- 이름
);

-- 강의장 기본키
CREATE UNIQUE INDEX PK_ROOMS
	ON ROOMS ( -- 강의장
		RNO ASC -- 강의장코드
	);

-- 강의장 유니크 인덱스
CREATE UNIQUE INDEX UIX_ROOMS
	ON ROOMS ( -- 강의장
		RNM ASC -- 이름
	);

-- 강의장
ALTER TABLE ROOMS
	ADD
		CONSTRAINT PK_ROOMS -- 강의장 기본키
		PRIMARY KEY (
			RNO -- 강의장코드
		);

-- 강의장
ALTER TABLE ROOMS
	ADD
		CONSTRAINT UK_ROOMS -- 강의장 유니크 제약
		UNIQUE (
			RNM -- 이름
		);

-- 강의장
COMMENT ON TABLE ROOMS IS '강의장';

-- 강의장코드
COMMENT ON COLUMN ROOMS.RNO IS '강의장코드';

-- 이름
COMMENT ON COLUMN ROOMS.RNM IS '이름';

-- 강의장 기본키
COMMENT ON INDEX PK_ROOMS IS '강의장 기본키';

-- 강의장 유니크 인덱스
COMMENT ON INDEX UIX_ROOMS IS '강의장 유니크 인덱스';

-- 강의장 기본키
COMMENT ON CONSTRAINT ROOMS.PK_ROOMS IS '강의장 기본키';

-- 강의장 유니크 제약
COMMENT ON CONSTRAINT ROOMS.UK_ROOMS IS '강의장 유니크 제약';

-- 강사
CREATE TABLE TEACHERS (
	TNO   INTEGER      NOT NULL, -- 강사번호
	TNM   VARCHAR(100) NOT NULL, -- 강사명
	TEL   VARCHAR(30)  NOT NULL, -- 강사전화
	EMAIL VARCHAR(40)  NOT NULL, -- 강사이메일
	PHOT  VARCHAR(255) NULL      -- 강사사진
);

-- 강사 기본키
CREATE UNIQUE INDEX PK_TEACHERS
	ON TEACHERS ( -- 강사
		TNO ASC -- 강사번호
	);

-- 강사 유니크 인덱스
CREATE UNIQUE INDEX UIX_TEACHERS
	ON TEACHERS ( -- 강사
		EMAIL ASC -- 강사이메일
	);

-- 강사 인덱스
CREATE INDEX IX_TEACHERS
	ON TEACHERS( -- 강사
		TNM ASC -- 강사명
	);

-- 강사
ALTER TABLE TEACHERS
	ADD
		CONSTRAINT PK_TEACHERS -- 강사 기본키
		PRIMARY KEY (
			TNO -- 강사번호
		);

-- 강사
ALTER TABLE TEACHERS
	ADD
		CONSTRAINT UK_TEACHERS -- 강사 유니크 제약
		UNIQUE (
			EMAIL -- 강사이메일
		);

-- 강사
COMMENT ON TABLE TEACHERS IS '강사';

-- 강사번호
COMMENT ON COLUMN TEACHERS.TNO IS '강사번호';

-- 강사명
COMMENT ON COLUMN TEACHERS.TNM IS '강사명';

-- 강사전화
COMMENT ON COLUMN TEACHERS.TEL IS '강사전화';

-- 강사이메일
COMMENT ON COLUMN TEACHERS.EMAIL IS '강사이메일';

-- 강사사진
COMMENT ON COLUMN TEACHERS.PHOT IS '강사사진';

-- 강사 기본키
COMMENT ON INDEX PK_TEACHERS IS '강사 기본키';

-- 강사 유니크 인덱스
COMMENT ON INDEX UIX_TEACHERS IS '강사 유니크 인덱스';

-- 강사 인덱스
COMMENT ON INDEX IX_TEACHERS IS '강사 인덱스';

-- 강사 기본키
COMMENT ON CONSTRAINT TEACHERS.PK_TEACHERS IS '강사 기본키';

-- 강사 유니크 제약
COMMENT ON CONSTRAINT TEACHERS.UK_TEACHERS IS '강사 유니크 제약';

-- 주소
CREATE TABLE ADDRS (
	ANO      INTEGER      NOT NULL, -- 주소번호
	POSNO    VARCHAR(10)  NOT NULL, -- 우편번호
	BAS_ADDR VARCHAR(255) NOT NULL  -- 기본주소
);

-- 주소 기본키
CREATE UNIQUE INDEX PK_ADDRS
	ON ADDRS ( -- 주소
		ANO ASC -- 주소번호
	);

-- 주소 인덱스
CREATE INDEX IX_ADDRS
	ON ADDRS( -- 주소
		POSNO ASC -- 우편번호
	);

-- 주소
ALTER TABLE ADDRS
	ADD
		CONSTRAINT PK_ADDRS -- 주소 기본키
		PRIMARY KEY (
			ANO -- 주소번호
		);

-- 주소
COMMENT ON TABLE ADDRS IS '주소';

-- 주소번호
COMMENT ON COLUMN ADDRS.ANO IS '주소번호';

-- 우편번호
COMMENT ON COLUMN ADDRS.POSNO IS '우편번호';

-- 기본주소
COMMENT ON COLUMN ADDRS.BAS_ADDR IS '기본주소';

-- 주소 기본키
COMMENT ON INDEX PK_ADDRS IS '주소 기본키';

-- 주소 인덱스
COMMENT ON INDEX IX_ADDRS IS '주소 인덱스';

-- 주소 기본키
COMMENT ON CONSTRAINT ADDRS.PK_ADDRS IS '주소 기본키';

-- 강의장사진
CREATE TABLE ROOM_PHOTO (
	RPNO INTEGER      NOT NULL, -- 강의장사진 번호
	RNO  VARCHAR(10)  NOT NULL, -- 강의장코드
	PHOT VARCHAR(255) NOT NULL  -- 사진
);

-- 강의장사진 기본키
CREATE UNIQUE INDEX PK_ROOM_PHOTO
	ON ROOM_PHOTO ( -- 강의장사진
		RPNO ASC -- 강의장사진 번호
	);

-- 강의장사진
ALTER TABLE ROOM_PHOTO
	ADD
		CONSTRAINT PK_ROOM_PHOTO -- 강의장사진 기본키
		PRIMARY KEY (
			RPNO -- 강의장사진 번호
		);

-- 강의장사진
COMMENT ON TABLE ROOM_PHOTO IS '강의장사진';

-- 강의장사진 번호
COMMENT ON COLUMN ROOM_PHOTO.RPNO IS '강의장사진 번호';

-- 강의장코드
COMMENT ON COLUMN ROOM_PHOTO.RNO IS '강의장코드';

-- 사진
COMMENT ON COLUMN ROOM_PHOTO.PHOT IS '사진';

-- 강의장사진 기본키
COMMENT ON INDEX PK_ROOM_PHOTO IS '강의장사진 기본키';

-- 강의장사진 기본키
COMMENT ON CONSTRAINT ROOM_PHOTO.PK_ROOM_PHOTO IS '강의장사진 기본키';

-- 강사배치
CREATE TABLE TEA_ASSIGN (
	TANO  INTEGER NOT NULL, -- 강사배치번호
	LNO   INTEGER NOT NULL, -- 교육과정번호
	TNO   INTEGER NOT NULL, -- 강사번호
	ST_DT DATE    NULL,     -- 강의시작일
	EN_DT DATE    NULL,     -- 강의종료일
	DESCT TEXT    NULL,     -- 강의내용
	HR    INTEGER NULL      -- 강의시간
);

-- 강사배치 기본키
CREATE UNIQUE INDEX PK_TEA_ASSIGN
	ON TEA_ASSIGN ( -- 강사배치
		TANO ASC -- 강사배치번호
	);

-- 강사배치
ALTER TABLE TEA_ASSIGN
	ADD
		CONSTRAINT PK_TEA_ASSIGN -- 강사배치 기본키
		PRIMARY KEY (
			TANO -- 강사배치번호
		);

-- 강사배치
COMMENT ON TABLE TEA_ASSIGN IS '강사배치';

-- 강사배치번호
COMMENT ON COLUMN TEA_ASSIGN.TANO IS '강사배치번호';

-- 교육과정번호
COMMENT ON COLUMN TEA_ASSIGN.LNO IS '교육과정번호';

-- 강사번호
COMMENT ON COLUMN TEA_ASSIGN.TNO IS '강사번호';

-- 강의시작일
COMMENT ON COLUMN TEA_ASSIGN.ST_DT IS '강의시작일';

-- 강의종료일
COMMENT ON COLUMN TEA_ASSIGN.EN_DT IS '강의종료일';

-- 강의내용
COMMENT ON COLUMN TEA_ASSIGN.DESCT IS '강의내용';

-- 강의시간
COMMENT ON COLUMN TEA_ASSIGN.HR IS '강의시간';

-- 강사배치 기본키
COMMENT ON INDEX PK_TEA_ASSIGN IS '강사배치 기본키';

-- 강사배치 기본키
COMMENT ON CONSTRAINT TEA_ASSIGN.PK_TEA_ASSIGN IS '강사배치 기본키';

-- 회원
CREATE TABLE MEMBERS (
	MNO      INTEGER      NOT NULL, -- 회원번호
	ANO      INTEGER      NULL,     -- 주소번호
	MNM      VARCHAR(100) NOT NULL, -- 이름
	TEL      VARCHAR(30)  NOT NULL, -- 전화
	EMAIL    VARCHAR(40)  NOT NULL, -- 이메일
	DET_ADDR VARCHAR(255) NULL,     -- 상세주소
	STEP     VARCHAR(10)  NULL,     -- 학력
	SCH_NM   VARCHAR(255) NULL,     -- 학교
	WORK     CHAR(1)      NOT NULL, -- 재직여부
	PHOT     VARCHAR(255) NULL      -- 사진
);

-- 회원 기본키
CREATE UNIQUE INDEX PK_MEMBERS
	ON MEMBERS ( -- 회원
		MNO ASC -- 회원번호
	);

-- 회원 유니크 인덱스
CREATE UNIQUE INDEX UIX_MEMBERS
	ON MEMBERS ( -- 회원
		EMAIL ASC -- 이메일
	);

-- 회원 인덱스
CREATE INDEX IX_MEMBERS
	ON MEMBERS( -- 회원
		MNM ASC -- 이름
	);

-- 회원
ALTER TABLE MEMBERS
	ADD
		CONSTRAINT PK_MEMBERS -- 회원 기본키
		PRIMARY KEY (
			MNO -- 회원번호
		);

-- 회원
ALTER TABLE MEMBERS
	ADD
		CONSTRAINT UK_MEMBERS -- 회원 유니크 제약
		UNIQUE (
			EMAIL -- 이메일
		);

-- 회원
COMMENT ON TABLE MEMBERS IS '회원';

-- 회원번호
COMMENT ON COLUMN MEMBERS.MNO IS '회원번호';

-- 주소번호
COMMENT ON COLUMN MEMBERS.ANO IS '주소번호';

-- 이름
COMMENT ON COLUMN MEMBERS.MNM IS '이름';

-- 전화
COMMENT ON COLUMN MEMBERS.TEL IS '전화';

-- 이메일
COMMENT ON COLUMN MEMBERS.EMAIL IS '이메일';

-- 상세주소
COMMENT ON COLUMN MEMBERS.DET_ADDR IS '상세주소';

-- 학력
COMMENT ON COLUMN MEMBERS.STEP IS '학력';

-- 학교
COMMENT ON COLUMN MEMBERS.SCH_NM IS '학교';

-- 재직여부
COMMENT ON COLUMN MEMBERS.WORK IS '재직여부';

-- 사진
COMMENT ON COLUMN MEMBERS.PHOT IS '사진';

-- 회원 기본키
COMMENT ON INDEX PK_MEMBERS IS '회원 기본키';

-- 회원 유니크 인덱스
COMMENT ON INDEX UIX_MEMBERS IS '회원 유니크 인덱스';

-- 회원 인덱스
COMMENT ON INDEX IX_MEMBERS IS '회원 인덱스';

-- 회원 기본키
COMMENT ON CONSTRAINT MEMBERS.PK_MEMBERS IS '회원 기본키';

-- 회원 유니크 제약
COMMENT ON CONSTRAINT MEMBERS.UK_MEMBERS IS '회원 유니크 제약';

-- 수강신청
ALTER TABLE LEC_APPL
	ADD
		CONSTRAINT FK_LECTURES_TO_LEC_APPL -- 교육과정 -> 수강신청
		FOREIGN KEY (
			LNO -- 교육과정번호
		)
		REFERENCES LECTURES ( -- 교육과정
			LNO -- 교육과정번호
		);

-- 교육과정 -> 수강신청
COMMENT ON CONSTRAINT LEC_APPL.FK_LECTURES_TO_LEC_APPL IS '교육과정 -> 수강신청';

-- 수강신청
ALTER TABLE LEC_APPL
	ADD
		CONSTRAINT FK_MEMBERS_TO_LEC_APPL -- 회원 -> 수강신청
		FOREIGN KEY (
			MNO -- 회원번호
		)
		REFERENCES MEMBERS ( -- 회원
			MNO -- 회원번호
		);

-- 회원 -> 수강신청
COMMENT ON CONSTRAINT LEC_APPL.FK_MEMBERS_TO_LEC_APPL IS '회원 -> 수강신청';

-- 교육과정
ALTER TABLE LECTURES
	ADD
		CONSTRAINT FK_ROOMS_TO_LECTURES -- 강의장 -> 교육과정
		FOREIGN KEY (
			RNO -- 강의장코드
		)
		REFERENCES ROOMS ( -- 강의장
			RNO -- 강의장코드
		);

-- 강의장 -> 교육과정
COMMENT ON CONSTRAINT LECTURES.FK_ROOMS_TO_LECTURES IS '강의장 -> 교육과정';

-- 강의장사진
ALTER TABLE ROOM_PHOTO
	ADD
		CONSTRAINT FK_ROOMS_TO_ROOM_PHOTO -- 강의장 -> 강의장사진
		FOREIGN KEY (
			RNO -- 강의장코드
		)
		REFERENCES ROOMS ( -- 강의장
			RNO -- 강의장코드
		);

-- 강의장 -> 강의장사진
COMMENT ON CONSTRAINT ROOM_PHOTO.FK_ROOMS_TO_ROOM_PHOTO IS '강의장 -> 강의장사진';

-- 강사배치
ALTER TABLE TEA_ASSIGN
	ADD
		CONSTRAINT FK_LECTURES_TO_TEA_ASSIGN -- 교육과정 -> 강사배치
		FOREIGN KEY (
			LNO -- 교육과정번호
		)
		REFERENCES LECTURES ( -- 교육과정
			LNO -- 교육과정번호
		);

-- 교육과정 -> 강사배치
COMMENT ON CONSTRAINT TEA_ASSIGN.FK_LECTURES_TO_TEA_ASSIGN IS '교육과정 -> 강사배치';

-- 강사배치
ALTER TABLE TEA_ASSIGN
	ADD
		CONSTRAINT FK_TEACHERS_TO_TEA_ASSIGN -- 강사 -> 강사배치
		FOREIGN KEY (
			TNO -- 강사번호
		)
		REFERENCES TEACHERS ( -- 강사
			TNO -- 강사번호
		);

-- 강사 -> 강사배치
COMMENT ON CONSTRAINT TEA_ASSIGN.FK_TEACHERS_TO_TEA_ASSIGN IS '강사 -> 강사배치';

-- 회원
ALTER TABLE MEMBERS
	ADD
		CONSTRAINT FK_ADDRS_TO_MEMBERS -- 주소 -> 회원
		FOREIGN KEY (
			ANO -- 주소번호
		)
		REFERENCES ADDRS ( -- 주소
			ANO -- 주소번호
		);

-- 주소 -> 회원
COMMENT ON CONSTRAINT MEMBERS.FK_ADDRS_TO_MEMBERS IS '주소 -> 회원';