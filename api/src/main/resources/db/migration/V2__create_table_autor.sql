create table autor(
    id bigint auto_increment not null,
    nome varchar(255) not null,
    dateOfBirth date not null,
    dateOfDeath date,

    primary key (id)
)