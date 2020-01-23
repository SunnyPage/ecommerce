-- alter table ECOMMERCE_CUSTOMER add column USER_ID varchar(36) ^
-- update ECOMMERCE_CUSTOMER set USER_ID = <default_value> ;
-- alter table ECOMMERCE_CUSTOMER alter column USER_ID set not null ;
alter table ECOMMERCE_CUSTOMER add column USER_ID varchar(36) not null ;
alter table ECOMMERCE_CUSTOMER add column EMAIL varchar(255) ^
update ECOMMERCE_CUSTOMER set EMAIL = '' where EMAIL is null ;
alter table ECOMMERCE_CUSTOMER alter column EMAIL set not null ;
-- alter table ECOMMERCE_CUSTOMER add column ACCOUNT_CUSTOMER_ID varchar(36) ^
-- update ECOMMERCE_CUSTOMER set ACCOUNT_CUSTOMER_ID = <default_value> ;
-- alter table ECOMMERCE_CUSTOMER alter column ACCOUNT_CUSTOMER_ID set not null ;
alter table ECOMMERCE_CUSTOMER add column ACCOUNT_CUSTOMER_ID varchar(36) not null ;
