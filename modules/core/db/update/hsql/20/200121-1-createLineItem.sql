create table ECOMMERCE_LINE_ITEM (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    QUANTITY integer,
    PRODUCT_ID varchar(36) not null,
    PRICE decimal(19, 2),
    --
    primary key (ID)
);