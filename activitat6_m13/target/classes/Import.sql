insert into Course (title) values ('Marketing');
insert into Course (title) values ('Sales');
insert into Course (title) values ('Support');
insert into Course (title) values ('Training');
insert into Course (title) values ('Product Management');
insert into Course (title) values ('Human Resources');
insert into Course (title) values ('Engineering');
insert into Course (title) values ('Accounting');
insert into Course (title) values ('Legal');
insert into Course (title) values ('Research and Development');




insert into COURSE_MATERIAL (URL,COURSE_ID) values ('AAAAAAAAA',2);
insert into COURSE_MATERIAL (URL,COURSE_ID) values ('BBBBBBBBB',2);
insert into COURSE_MATERIAL (URL,COURSE_ID) values ('CCCCCCCCC',1);
insert into COURSE_MATERIAL (URL,COURSE_ID) values ('DDDDDDDDD',3);
insert into COURSE_MATERIAL (URL) values ('EEEEEEEEE');




insert into STUDENT (LAST_NAME,FIRST_NAME,BIRTH_DATE,WANTS_NEWSLETTER) values ('HERNANDEZ','XAVI','2003-10-10',true);
insert into STUDENT (LAST_NAME,FIRST_NAME,BIRTH_DATE,WANTS_NEWSLETTER) values ('MARTI','XAVI','2003-10-10',true);
insert into STUDENT (LAST_NAME,FIRST_NAME,BIRTH_DATE,WANTS_NEWSLETTER) values ('OCHOA','JOEL','2003-10-10',true);
insert into STUDENT (LAST_NAME,FIRST_NAME,BIRTH_DATE,WANTS_NEWSLETTER) values ('BLAZE','AXEL','2003-10-10',true);
insert into STUDENT (LAST_NAME,FIRST_NAME,BIRTH_DATE,WANTS_NEWSLETTER) values ('EVANS','MARK','2003-10-10',false);


insert into COURSE_STUDENT (STUDENT_ID,COURSE_ID) values(1,1);
insert into COURSE_STUDENT (STUDENT_ID,COURSE_ID) values(1,2);
insert into COURSE_STUDENT (STUDENT_ID,COURSE_ID) values(2,2);
insert into COURSE_STUDENT (STUDENT_ID,COURSE_ID) values(3,3);
insert into COURSE_STUDENT (STUDENT_ID,COURSE_ID) values(4,1);