-- alter table ECOMMERCE_ACCOUNT add column PAYMENT_ID varchar(36) ^
-- update ECOMMERCE_ACCOUNT set PAYMENT_ID = <default_value> ;
-- alter table ECOMMERCE_ACCOUNT alter column PAYMENT_ID set not null ;
alter table ECOMMERCE_ACCOUNT add column PAYMENT_ID varchar(36) not null ;
