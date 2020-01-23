-- alter table ECOMMERCE_ORDER add column ACCOUNT_ID varchar(36) ^
-- update ECOMMERCE_ORDER set ACCOUNT_ID = <default_value> ;
-- alter table ECOMMERCE_ORDER alter column ACCOUNT_ID set not null ;
alter table ECOMMERCE_ORDER add column ACCOUNT_ID varchar(36) not null ;
