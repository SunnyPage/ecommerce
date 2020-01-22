create table ECOMMERCE_ACCOUNT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ISCLOSED boolean,
    OPEN_ timestamp not null,
    CLOSED timestamp,
    CUSTOMER_ACCOUNT_ID varchar(36) not null,
    --
    primary key (ID)
);