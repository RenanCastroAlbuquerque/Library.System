create table livro(
    id bigint not null auto_increment,
    titulo varchar(255) not null,
    autor varchar(255) not null,
    idioma varchar(100) not null,
    genero varchar(100) not null,

    primary key (id)
)