create table academies(
    id bigint not null auto_increment,
    name varchar(100) not null unique ,
    link varchar(200) not null,
    foundation date not null,
    type varchar(50) not null,
    industry varchar(50),

    primary key (id)
)