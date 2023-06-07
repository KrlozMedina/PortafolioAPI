create table projects(
    id bigint auto_increment,
    titulo varchar(50) not null unique,
    title varchar(50) not null unique,
    descripcion varchar(250) not null,
    description varchar(250) not null,
    type varchar(20) not null,
    deploy varchar(200) not null unique ,
    repository varchar(200) not null unique,
    image varchar(200) not null unique,

    primary key (id)
)