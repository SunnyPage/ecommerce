-- alter table ECOMMERCE_LINE_ITEM add column ORDER_ID varchar(36) ^
-- update ECOMMERCE_LINE_ITEM set ORDER_ID = <default_value> ;
-- alter table ECOMMERCE_LINE_ITEM alter column ORDER_ID set not null ;
alter table ECOMMERCE_LINE_ITEM add column ORDER_ID varchar(36) not null ;
