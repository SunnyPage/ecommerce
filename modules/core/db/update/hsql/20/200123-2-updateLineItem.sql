-- alter table ECOMMERCE_LINE_ITEM add column PRODUCT_ID varchar(36) ^
-- update ECOMMERCE_LINE_ITEM set PRODUCT_ID = <default_value> ;
-- alter table ECOMMERCE_LINE_ITEM alter column PRODUCT_ID set not null ;
alter table ECOMMERCE_LINE_ITEM add column PRODUCT_ID varchar(36) not null ;
