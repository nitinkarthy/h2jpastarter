CREATE TABLE PLAYER(
    id NUMBER(10) NOT NULL,
    name VARCHAR2(50) NOT NULL
);

CREATE TABLE ADDRESS(
    id NUMBER(10) NOT NULL,
    employee_id NUMBER(10) NOT NULL,
    line VARCHAR2(50) NOT NULL,
    street VARCHAR2(50) NOT NULL,
    city VARCHAR2(50) NOT NULL,
    state VARCHAR2(50) NOT NULL,
    pin NUMBER(6) NOT NULL
);

CREATE TABLE SKILL(
    id NUMBER(10) NOT NULL,
    name VARCHAR2(50) NOT NULL
);

CREATE TABLE PLAYER_SKILL(
    player_id NUMBER(10) NOT NULL,
    skill_id NUMBER(10) NOT NULL,
    last_used_date DATE NOT NULL
);

CREATE SEQUENCE ALL_SEQ START WITH 10 INCREMENT BY 10;

INSERT INTO PLAYER (id, name) VALUES (1, 'DHONI');
INSERT INTO PLAYER (id, name) VALUES (2, 'KOHLI');
INSERT INTO ADDRESS (id, employee_id, line, street, city, state, pin) VALUES (1, 1, 'home', 'high street', 'jabalpur', 'mp', 898989);
INSERT INTO ADDRESS (id, employee_id, line, street, city, state, pin) VALUES (2, 1, 'office', 'mg road', 'jabalpur', 'mp', 898990);
INSERT INTO ADDRESS (id, employee_id, line, street, city, state, pin) VALUES (3, 2, 'office', 'mg road', 'patiala', 'punjab', 787878);
INSERT INTO SKILL (id, name) VALUES (1, 'Batting');
INSERT INTO SKILL (id, name) VALUES (2, 'Bowling');
INSERT INTO SKILL (id, name) VALUES (3, 'Keeping');
INSERT INTO PLAYER_SKILL (player_id, skill_id, last_used_date) VALUES (1, 1, DATE '2019-12-31');
INSERT INTO PLAYER_SKILL (player_id, skill_id, last_used_date) VALUES (1, 2, DATE '2019-12-31');
INSERT INTO PLAYER_SKILL (player_id, skill_id, last_used_date) VALUES (2, 1, DATE '2019-12-31');