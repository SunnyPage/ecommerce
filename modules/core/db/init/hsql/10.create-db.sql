-- begin ECOMMERCE_PAYMENT
create table ECOMMERCE_PAYMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PAID timestamp not null,
    TOTAL decimal(19, 2) not null,
    DATAILS varchar(255),
    ORDER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end ECOMMERCE_PAYMENT
-- begin ECOMMERCE_CATEGORY
create table ECOMMERCE_CATEGORY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    SUB_CATEGORY_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end ECOMMERCE_CATEGORY
-- begin ECOMMERCE_PRODUCT
create table ECOMMERCE_PRODUCT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CATEGORY_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end ECOMMERCE_PRODUCT
-- begin ECOMMERCE_SUB_CATEGORY
create table ECOMMERCE_SUB_CATEGORY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end ECOMMERCE_SUB_CATEGORY
-- begin ECOMMERCE_CUSTOMER
create table ECOMMERCE_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end ECOMMERCE_CUSTOMER
-- begin ECOMMERCE_ORDER
create table ECOMMERCE_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDERED timestamp not null,
    SHIPPED timestamp not null,
    SHIP_TO_ID varchar(36) not null,
    ORDER_STATUS varchar(50) not null,
    TOTAL decimal(19, 2),
    --
    primary key (ID)
)^
-- end ECOMMERCE_ORDER
-- begin ECOMMERCE_LINE_ITEM
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
)^
-- end ECOMMERCE_LINE_ITEM
-- begin ECOMMERCE_ADDRESS
create table ECOMMERCE_ADDRESS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end ECOMMERCE_ADDRESS
-- begin ECOMMERCE_SHOPPING_CARD
create table ECOMMERCE_SHOPPING_CARD (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CREATED timestamp not null,
    --
    primary key (ID)
)^
-- end ECOMMERCE_SHOPPING_CARD
