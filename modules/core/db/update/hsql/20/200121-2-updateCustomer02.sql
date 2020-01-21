-- alter table ECOMMERCE_CUSTOMER add column USER_ID varchar(36) ^
-- update ECOMMERCE_CUSTOMER set USER_ID = <default_value> ;
-- alter table ECOMMERCE_CUSTOMER alter column USER_ID set not null ;
alter table ECOMMERCE_CUSTOMER add column USER_ID varchar(36) not null ;
