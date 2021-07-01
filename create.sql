
    create table user_model (
       id int8 generated by default as identity,
        login varchar(255),
        password varchar(255),
        primary key (id)
    );

    alter table if exists user_model 
       add constraint UK_4gc46myl96faikydlcfh09v6c unique (login);
