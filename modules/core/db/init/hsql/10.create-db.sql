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
-- begin ECOMMERCE_ACCOUNT
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
    CUSTOMER_ACCOUNT_ID varchar(36),
    PAYMENT_ID varchar(36),
    --
    primary key (ID)
)^
-- end ECOMMERCE_ACCOUNT
-- begin ECOMMERCE_PHONE
create table ECOMMERCE_PHONE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ varchar(255) not null,
    CUSTOMER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end ECOMMERCE_PHONE
-- begin ECOMMERCE_TENANT
create table ECOMMERCE_TENANT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAMA varchar(255) not null,
    CODE varchar(255) not null,
    --
    primary key (ID)
)^
-- end ECOMMERCE_TENANT
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
    ORDER_ID varchar(255) not null,
    ORDERED timestamp not null,
    SHIPPED timestamp not null,
    ORDER_STATUS varchar(50) not null,
    TOTAL decimal(19, 2),
    ADDRESS_ID varchar(36),
    ACCOUNT_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end ECOMMERCE_ORDER
-- begin ECOMMERCE_DOCUMENTS
create table ECOMMERCE_DOCUMENTS (
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
    FILE_ID varchar(36) not null,
    TYPE_ varchar(50),
    ORDER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end ECOMMERCE_DOCUMENTS
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
    PRICE decimal(19, 2),
    PRODUCT_ID varchar(36) not null,
    ORDER_ID varchar(36) not null,
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
    STREET varchar(255) not null,
    POST_CODE varchar(255) not null,
    CITY varchar(255) not null,
    CUSTOMER_ID varchar(36) not null,
    ACCOUNT_ID varchar(36),
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
    USER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end ECOMMERCE_SHOPPING_CARD
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
    TENANT_ID varchar(36) not null,
    --
    ACCOUNT_CUSTOMER_ID varchar(36) not null,
    EMAIL varchar(255) not null,
    USER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end ECOMMERCE_CUSTOMER
