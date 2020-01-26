-- alter table ECOMMERCE_ADDRESS add column CUSTOMER_ID varchar(36) ^
-- update ECOMMERCE_ADDRESS set CUSTOMER_ID = <default_value> ;
-- alter table ECOMMERCE_ADDRESS alter column CUSTOMER_ID set not null ;
alter table ECOMMERCE_ADDRESS add column CUSTOMER_ID varchar(36) not null ;
