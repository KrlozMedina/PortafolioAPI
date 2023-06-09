drop table academies;

alter table projects add active boolean not null;
alter table projects add front varchar(20) default null;
alter table projects add style varchar(20) default null;
alter table projects add back varchar(20) default null;
alter table projects add db varchar(20) default null;
alter table projects add cloud varchar(20) default null;

alter table certificates change academyutil academy varchar(50);
alter table certificates modify name varchar(100);