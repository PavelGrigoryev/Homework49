create table if not exists student_group
(
    id   int not null auto_increment,
    name varchar(45),
    primary key (id)
);

create table if not exists student
(
    id       int not null auto_increment,
    name     varchar(45),
    surname  varchar(45),
    payment  boolean,
    group_id int,
    primary key (id),
    foreign key (group_id) references my_db.student_group (id)
);
