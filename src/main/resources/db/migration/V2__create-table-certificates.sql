create table certificates(
    id bigint not null auto_increment,
    academyutil varchar(50) not null,
    type varchar(50) not null,
    name varchar(200) not null,
    linkcloud varchar(200) not null unique,
    linkacademy varchar(200) not null unique,
    category varchar(50) not null,
    datefinal date not null,

    primary key (id)
);