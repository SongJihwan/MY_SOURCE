-- ������û
DROP TABLE LEC_APPL;

-- ��������
DROP TABLE LECTURES;

-- ������
DROP TABLE ROOMS;

-- ����
DROP TABLE TEACHERS;

-- �ּ�
DROP TABLE ADDRS;

-- ���������
DROP TABLE ROOM_PHOTO;

-- �����ġ
DROP TABLE TEA_ASSIGN;

-- ȸ��
DROP TABLE MEMBERS;

-- ������û
CREATE TABLE LEC_APPL (
	APNO   INTEGER     NOT NULL, -- ������û��ȣ
	LNO    INTEGER     NOT NULL, -- ����������ȣ
	MNO    INTEGER     NOT NULL, -- ȸ����ȣ
	AP_TYP VARCHAR(10) NOT NULL, -- ��û����
	CR_DT  DATE        NOT NULL  -- ��û��
);

-- ������û �⺻Ű
CREATE UNIQUE INDEX PK_LEC_APPL
	ON LEC_APPL ( -- ������û
		APNO ASC -- ������û��ȣ
	);

-- ������û
ALTER TABLE LEC_APPL
	ADD
		CONSTRAINT PK_LEC_APPL -- ������û �⺻Ű
		PRIMARY KEY (
			APNO -- ������û��ȣ
		);

-- ������û
COMMENT ON TABLE LEC_APPL IS '������û';

-- ������û��ȣ
COMMENT ON COLUMN LEC_APPL.APNO IS '������û��ȣ';

-- ����������ȣ
COMMENT ON COLUMN LEC_APPL.LNO IS '����������ȣ';

-- ȸ����ȣ
COMMENT ON COLUMN LEC_APPL.MNO IS 'ȸ����ȣ';

-- ��û����
COMMENT ON COLUMN LEC_APPL.AP_TYP IS '��û����';

-- ��û��
COMMENT ON COLUMN LEC_APPL.CR_DT IS '��û��';

-- ������û �⺻Ű
COMMENT ON INDEX PK_LEC_APPL IS '������û �⺻Ű';

-- ������û �⺻Ű
COMMENT ON CONSTRAINT LEC_APPL.PK_LEC_APPL IS '������û �⺻Ű';

-- ��������
CREATE TABLE LECTURES (
	LNO    INTEGER      NOT NULL, -- ����������ȣ
	RNO    VARCHAR(10)  NULL,     -- �������ڵ�
	TITL   VARCHAR(255) NOT NULL, -- �����
	DESCT  TEXT         NOT NULL, -- ����
	ST_DT  DATE         NOT NULL, -- ���ǽ�����
	EN_DT  DATE         NOT NULL, -- ����������
	DAY_HR INTEGER      NOT NULL, -- �ϰ��ǽð�
	TOT_HR INTEGER      NOT NULL, -- �Ѱ�����
	FI_DT  DATE         NOT NULL  -- ��û������
);

-- �������� �⺻Ű
CREATE UNIQUE INDEX PK_LECTURES
	ON LECTURES ( -- ��������
		LNO ASC -- ����������ȣ
	);

-- �������� �ε���
CREATE INDEX IX_LECTURES
	ON LECTURES( -- ��������
		TITL ASC -- �����
	);

-- ��������
ALTER TABLE LECTURES
	ADD
		CONSTRAINT PK_LECTURES -- �������� �⺻Ű
		PRIMARY KEY (
			LNO -- ����������ȣ
		);

-- ��������
COMMENT ON TABLE LECTURES IS '��������';

-- ����������ȣ
COMMENT ON COLUMN LECTURES.LNO IS '����������ȣ';

-- �������ڵ�
COMMENT ON COLUMN LECTURES.RNO IS '�������ڵ�';

-- �����
COMMENT ON COLUMN LECTURES.TITL IS '�����';

-- ����
COMMENT ON COLUMN LECTURES.DESCT IS '����';

-- ���ǽ�����
COMMENT ON COLUMN LECTURES.ST_DT IS '���ǽ�����';

-- ����������
COMMENT ON COLUMN LECTURES.EN_DT IS '����������';

-- �ϰ��ǽð�
COMMENT ON COLUMN LECTURES.DAY_HR IS '�ϰ��ǽð�';

-- �Ѱ�����
COMMENT ON COLUMN LECTURES.TOT_HR IS '�Ѱ�����';

-- ��û������
COMMENT ON COLUMN LECTURES.FI_DT IS '��û������';

-- �������� �⺻Ű
COMMENT ON INDEX PK_LECTURES IS '�������� �⺻Ű';

-- �������� �ε���
COMMENT ON INDEX IX_LECTURES IS '�������� �ε���';

-- �������� �⺻Ű
COMMENT ON CONSTRAINT LECTURES.PK_LECTURES IS '�������� �⺻Ű';

-- ������
CREATE TABLE ROOMS (
	RNO VARCHAR(10)  NOT NULL, -- �������ڵ�
	RNM VARCHAR(100) NOT NULL  -- �̸�
);

-- ������ �⺻Ű
CREATE UNIQUE INDEX PK_ROOMS
	ON ROOMS ( -- ������
		RNO ASC -- �������ڵ�
	);

-- ������ ����ũ �ε���
CREATE UNIQUE INDEX UIX_ROOMS
	ON ROOMS ( -- ������
		RNM ASC -- �̸�
	);

-- ������
ALTER TABLE ROOMS
	ADD
		CONSTRAINT PK_ROOMS -- ������ �⺻Ű
		PRIMARY KEY (
			RNO -- �������ڵ�
		);

-- ������
ALTER TABLE ROOMS
	ADD
		CONSTRAINT UK_ROOMS -- ������ ����ũ ����
		UNIQUE (
			RNM -- �̸�
		);

-- ������
COMMENT ON TABLE ROOMS IS '������';

-- �������ڵ�
COMMENT ON COLUMN ROOMS.RNO IS '�������ڵ�';

-- �̸�
COMMENT ON COLUMN ROOMS.RNM IS '�̸�';

-- ������ �⺻Ű
COMMENT ON INDEX PK_ROOMS IS '������ �⺻Ű';

-- ������ ����ũ �ε���
COMMENT ON INDEX UIX_ROOMS IS '������ ����ũ �ε���';

-- ������ �⺻Ű
COMMENT ON CONSTRAINT ROOMS.PK_ROOMS IS '������ �⺻Ű';

-- ������ ����ũ ����
COMMENT ON CONSTRAINT ROOMS.UK_ROOMS IS '������ ����ũ ����';

-- ����
CREATE TABLE TEACHERS (
	TNO   INTEGER      NOT NULL, -- �����ȣ
	TNM   VARCHAR(100) NOT NULL, -- �����
	TEL   VARCHAR(30)  NOT NULL, -- ������ȭ
	EMAIL VARCHAR(40)  NOT NULL, -- �����̸���
	PHOT  VARCHAR(255) NULL      -- �������
);

-- ���� �⺻Ű
CREATE UNIQUE INDEX PK_TEACHERS
	ON TEACHERS ( -- ����
		TNO ASC -- �����ȣ
	);

-- ���� ����ũ �ε���
CREATE UNIQUE INDEX UIX_TEACHERS
	ON TEACHERS ( -- ����
		EMAIL ASC -- �����̸���
	);

-- ���� �ε���
CREATE INDEX IX_TEACHERS
	ON TEACHERS( -- ����
		TNM ASC -- �����
	);

-- ����
ALTER TABLE TEACHERS
	ADD
		CONSTRAINT PK_TEACHERS -- ���� �⺻Ű
		PRIMARY KEY (
			TNO -- �����ȣ
		);

-- ����
ALTER TABLE TEACHERS
	ADD
		CONSTRAINT UK_TEACHERS -- ���� ����ũ ����
		UNIQUE (
			EMAIL -- �����̸���
		);

-- ����
COMMENT ON TABLE TEACHERS IS '����';

-- �����ȣ
COMMENT ON COLUMN TEACHERS.TNO IS '�����ȣ';

-- �����
COMMENT ON COLUMN TEACHERS.TNM IS '�����';

-- ������ȭ
COMMENT ON COLUMN TEACHERS.TEL IS '������ȭ';

-- �����̸���
COMMENT ON COLUMN TEACHERS.EMAIL IS '�����̸���';

-- �������
COMMENT ON COLUMN TEACHERS.PHOT IS '�������';

-- ���� �⺻Ű
COMMENT ON INDEX PK_TEACHERS IS '���� �⺻Ű';

-- ���� ����ũ �ε���
COMMENT ON INDEX UIX_TEACHERS IS '���� ����ũ �ε���';

-- ���� �ε���
COMMENT ON INDEX IX_TEACHERS IS '���� �ε���';

-- ���� �⺻Ű
COMMENT ON CONSTRAINT TEACHERS.PK_TEACHERS IS '���� �⺻Ű';

-- ���� ����ũ ����
COMMENT ON CONSTRAINT TEACHERS.UK_TEACHERS IS '���� ����ũ ����';

-- �ּ�
CREATE TABLE ADDRS (
	ANO      INTEGER      NOT NULL, -- �ּҹ�ȣ
	POSNO    VARCHAR(10)  NOT NULL, -- �����ȣ
	BAS_ADDR VARCHAR(255) NOT NULL  -- �⺻�ּ�
);

-- �ּ� �⺻Ű
CREATE UNIQUE INDEX PK_ADDRS
	ON ADDRS ( -- �ּ�
		ANO ASC -- �ּҹ�ȣ
	);

-- �ּ� �ε���
CREATE INDEX IX_ADDRS
	ON ADDRS( -- �ּ�
		POSNO ASC -- �����ȣ
	);

-- �ּ�
ALTER TABLE ADDRS
	ADD
		CONSTRAINT PK_ADDRS -- �ּ� �⺻Ű
		PRIMARY KEY (
			ANO -- �ּҹ�ȣ
		);

-- �ּ�
COMMENT ON TABLE ADDRS IS '�ּ�';

-- �ּҹ�ȣ
COMMENT ON COLUMN ADDRS.ANO IS '�ּҹ�ȣ';

-- �����ȣ
COMMENT ON COLUMN ADDRS.POSNO IS '�����ȣ';

-- �⺻�ּ�
COMMENT ON COLUMN ADDRS.BAS_ADDR IS '�⺻�ּ�';

-- �ּ� �⺻Ű
COMMENT ON INDEX PK_ADDRS IS '�ּ� �⺻Ű';

-- �ּ� �ε���
COMMENT ON INDEX IX_ADDRS IS '�ּ� �ε���';

-- �ּ� �⺻Ű
COMMENT ON CONSTRAINT ADDRS.PK_ADDRS IS '�ּ� �⺻Ű';

-- ���������
CREATE TABLE ROOM_PHOTO (
	RPNO INTEGER      NOT NULL, -- ��������� ��ȣ
	RNO  VARCHAR(10)  NOT NULL, -- �������ڵ�
	PHOT VARCHAR(255) NOT NULL  -- ����
);

-- ��������� �⺻Ű
CREATE UNIQUE INDEX PK_ROOM_PHOTO
	ON ROOM_PHOTO ( -- ���������
		RPNO ASC -- ��������� ��ȣ
	);

-- ���������
ALTER TABLE ROOM_PHOTO
	ADD
		CONSTRAINT PK_ROOM_PHOTO -- ��������� �⺻Ű
		PRIMARY KEY (
			RPNO -- ��������� ��ȣ
		);

-- ���������
COMMENT ON TABLE ROOM_PHOTO IS '���������';

-- ��������� ��ȣ
COMMENT ON COLUMN ROOM_PHOTO.RPNO IS '��������� ��ȣ';

-- �������ڵ�
COMMENT ON COLUMN ROOM_PHOTO.RNO IS '�������ڵ�';

-- ����
COMMENT ON COLUMN ROOM_PHOTO.PHOT IS '����';

-- ��������� �⺻Ű
COMMENT ON INDEX PK_ROOM_PHOTO IS '��������� �⺻Ű';

-- ��������� �⺻Ű
COMMENT ON CONSTRAINT ROOM_PHOTO.PK_ROOM_PHOTO IS '��������� �⺻Ű';

-- �����ġ
CREATE TABLE TEA_ASSIGN (
	TANO  INTEGER NOT NULL, -- �����ġ��ȣ
	LNO   INTEGER NOT NULL, -- ����������ȣ
	TNO   INTEGER NOT NULL, -- �����ȣ
	ST_DT DATE    NULL,     -- ���ǽ�����
	EN_DT DATE    NULL,     -- ����������
	DESCT TEXT    NULL,     -- ���ǳ���
	HR    INTEGER NULL      -- ���ǽð�
);

-- �����ġ �⺻Ű
CREATE UNIQUE INDEX PK_TEA_ASSIGN
	ON TEA_ASSIGN ( -- �����ġ
		TANO ASC -- �����ġ��ȣ
	);

-- �����ġ
ALTER TABLE TEA_ASSIGN
	ADD
		CONSTRAINT PK_TEA_ASSIGN -- �����ġ �⺻Ű
		PRIMARY KEY (
			TANO -- �����ġ��ȣ
		);

-- �����ġ
COMMENT ON TABLE TEA_ASSIGN IS '�����ġ';

-- �����ġ��ȣ
COMMENT ON COLUMN TEA_ASSIGN.TANO IS '�����ġ��ȣ';

-- ����������ȣ
COMMENT ON COLUMN TEA_ASSIGN.LNO IS '����������ȣ';

-- �����ȣ
COMMENT ON COLUMN TEA_ASSIGN.TNO IS '�����ȣ';

-- ���ǽ�����
COMMENT ON COLUMN TEA_ASSIGN.ST_DT IS '���ǽ�����';

-- ����������
COMMENT ON COLUMN TEA_ASSIGN.EN_DT IS '����������';

-- ���ǳ���
COMMENT ON COLUMN TEA_ASSIGN.DESCT IS '���ǳ���';

-- ���ǽð�
COMMENT ON COLUMN TEA_ASSIGN.HR IS '���ǽð�';

-- �����ġ �⺻Ű
COMMENT ON INDEX PK_TEA_ASSIGN IS '�����ġ �⺻Ű';

-- �����ġ �⺻Ű
COMMENT ON CONSTRAINT TEA_ASSIGN.PK_TEA_ASSIGN IS '�����ġ �⺻Ű';

-- ȸ��
CREATE TABLE MEMBERS (
	MNO      INTEGER      NOT NULL, -- ȸ����ȣ
	ANO      INTEGER      NULL,     -- �ּҹ�ȣ
	MNM      VARCHAR(100) NOT NULL, -- �̸�
	TEL      VARCHAR(30)  NOT NULL, -- ��ȭ
	EMAIL    VARCHAR(40)  NOT NULL, -- �̸���
	DET_ADDR VARCHAR(255) NULL,     -- ���ּ�
	STEP     VARCHAR(10)  NULL,     -- �з�
	SCH_NM   VARCHAR(255) NULL,     -- �б�
	WORK     CHAR(1)      NOT NULL, -- ��������
	PHOT     VARCHAR(255) NULL      -- ����
);

-- ȸ�� �⺻Ű
CREATE UNIQUE INDEX PK_MEMBERS
	ON MEMBERS ( -- ȸ��
		MNO ASC -- ȸ����ȣ
	);

-- ȸ�� ����ũ �ε���
CREATE UNIQUE INDEX UIX_MEMBERS
	ON MEMBERS ( -- ȸ��
		EMAIL ASC -- �̸���
	);

-- ȸ�� �ε���
CREATE INDEX IX_MEMBERS
	ON MEMBERS( -- ȸ��
		MNM ASC -- �̸�
	);

-- ȸ��
ALTER TABLE MEMBERS
	ADD
		CONSTRAINT PK_MEMBERS -- ȸ�� �⺻Ű
		PRIMARY KEY (
			MNO -- ȸ����ȣ
		);

-- ȸ��
ALTER TABLE MEMBERS
	ADD
		CONSTRAINT UK_MEMBERS -- ȸ�� ����ũ ����
		UNIQUE (
			EMAIL -- �̸���
		);

-- ȸ��
COMMENT ON TABLE MEMBERS IS 'ȸ��';

-- ȸ����ȣ
COMMENT ON COLUMN MEMBERS.MNO IS 'ȸ����ȣ';

-- �ּҹ�ȣ
COMMENT ON COLUMN MEMBERS.ANO IS '�ּҹ�ȣ';

-- �̸�
COMMENT ON COLUMN MEMBERS.MNM IS '�̸�';

-- ��ȭ
COMMENT ON COLUMN MEMBERS.TEL IS '��ȭ';

-- �̸���
COMMENT ON COLUMN MEMBERS.EMAIL IS '�̸���';

-- ���ּ�
COMMENT ON COLUMN MEMBERS.DET_ADDR IS '���ּ�';

-- �з�
COMMENT ON COLUMN MEMBERS.STEP IS '�з�';

-- �б�
COMMENT ON COLUMN MEMBERS.SCH_NM IS '�б�';

-- ��������
COMMENT ON COLUMN MEMBERS.WORK IS '��������';

-- ����
COMMENT ON COLUMN MEMBERS.PHOT IS '����';

-- ȸ�� �⺻Ű
COMMENT ON INDEX PK_MEMBERS IS 'ȸ�� �⺻Ű';

-- ȸ�� ����ũ �ε���
COMMENT ON INDEX UIX_MEMBERS IS 'ȸ�� ����ũ �ε���';

-- ȸ�� �ε���
COMMENT ON INDEX IX_MEMBERS IS 'ȸ�� �ε���';

-- ȸ�� �⺻Ű
COMMENT ON CONSTRAINT MEMBERS.PK_MEMBERS IS 'ȸ�� �⺻Ű';

-- ȸ�� ����ũ ����
COMMENT ON CONSTRAINT MEMBERS.UK_MEMBERS IS 'ȸ�� ����ũ ����';

-- ������û
ALTER TABLE LEC_APPL
	ADD
		CONSTRAINT FK_LECTURES_TO_LEC_APPL -- �������� -> ������û
		FOREIGN KEY (
			LNO -- ����������ȣ
		)
		REFERENCES LECTURES ( -- ��������
			LNO -- ����������ȣ
		);

-- �������� -> ������û
COMMENT ON CONSTRAINT LEC_APPL.FK_LECTURES_TO_LEC_APPL IS '�������� -> ������û';

-- ������û
ALTER TABLE LEC_APPL
	ADD
		CONSTRAINT FK_MEMBERS_TO_LEC_APPL -- ȸ�� -> ������û
		FOREIGN KEY (
			MNO -- ȸ����ȣ
		)
		REFERENCES MEMBERS ( -- ȸ��
			MNO -- ȸ����ȣ
		);

-- ȸ�� -> ������û
COMMENT ON CONSTRAINT LEC_APPL.FK_MEMBERS_TO_LEC_APPL IS 'ȸ�� -> ������û';

-- ��������
ALTER TABLE LECTURES
	ADD
		CONSTRAINT FK_ROOMS_TO_LECTURES -- ������ -> ��������
		FOREIGN KEY (
			RNO -- �������ڵ�
		)
		REFERENCES ROOMS ( -- ������
			RNO -- �������ڵ�
		);

-- ������ -> ��������
COMMENT ON CONSTRAINT LECTURES.FK_ROOMS_TO_LECTURES IS '������ -> ��������';

-- ���������
ALTER TABLE ROOM_PHOTO
	ADD
		CONSTRAINT FK_ROOMS_TO_ROOM_PHOTO -- ������ -> ���������
		FOREIGN KEY (
			RNO -- �������ڵ�
		)
		REFERENCES ROOMS ( -- ������
			RNO -- �������ڵ�
		);

-- ������ -> ���������
COMMENT ON CONSTRAINT ROOM_PHOTO.FK_ROOMS_TO_ROOM_PHOTO IS '������ -> ���������';

-- �����ġ
ALTER TABLE TEA_ASSIGN
	ADD
		CONSTRAINT FK_LECTURES_TO_TEA_ASSIGN -- �������� -> �����ġ
		FOREIGN KEY (
			LNO -- ����������ȣ
		)
		REFERENCES LECTURES ( -- ��������
			LNO -- ����������ȣ
		);

-- �������� -> �����ġ
COMMENT ON CONSTRAINT TEA_ASSIGN.FK_LECTURES_TO_TEA_ASSIGN IS '�������� -> �����ġ';

-- �����ġ
ALTER TABLE TEA_ASSIGN
	ADD
		CONSTRAINT FK_TEACHERS_TO_TEA_ASSIGN -- ���� -> �����ġ
		FOREIGN KEY (
			TNO -- �����ȣ
		)
		REFERENCES TEACHERS ( -- ����
			TNO -- �����ȣ
		);

-- ���� -> �����ġ
COMMENT ON CONSTRAINT TEA_ASSIGN.FK_TEACHERS_TO_TEA_ASSIGN IS '���� -> �����ġ';

-- ȸ��
ALTER TABLE MEMBERS
	ADD
		CONSTRAINT FK_ADDRS_TO_MEMBERS -- �ּ� -> ȸ��
		FOREIGN KEY (
			ANO -- �ּҹ�ȣ
		)
		REFERENCES ADDRS ( -- �ּ�
			ANO -- �ּҹ�ȣ
		);

-- �ּ� -> ȸ��
COMMENT ON CONSTRAINT MEMBERS.FK_ADDRS_TO_MEMBERS IS '�ּ� -> ȸ��';