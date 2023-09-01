create table if not exists patient (
    id bigint(10) auto_increment not null primary key,
    patient_name varchar(100) not null,
    age int default null,
    gender varchar(10) not null,
    phone varchar(10) not null,
    op_date DATE not null,
    father_name varchar(100),
    identity_proof varchar(20) not null
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;