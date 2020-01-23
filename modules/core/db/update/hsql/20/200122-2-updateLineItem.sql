alter table ECOMMERCE_LINE_ITEM alter column PRODUCT_ID rename to PRODUCT_ID__U27340 ^
alter table ECOMMERCE_LINE_ITEM alter column PRODUCT_ID__U27340 set null ;
alter table ECOMMERCE_LINE_ITEM drop constraint FK_ECOMMERCE_LINE_ITEM_ON_PRODUCT ;
drop index IDX_ECOMMERCE_LINE_ITEM_ON_PRODUCT ;
-- alter table ECOMMERCE_LINE_ITEM add column ORDER_ID varchar(36) ^
-- update ECOMMERCE_LINE_ITEM set ORDER_ID = <default_value> ;
-- alter table ECOMMERCE_LINE_ITEM alter column ORDER_ID set not null ;
alter table ECOMMERCE_LINE_ITEM add column ORDER_ID varchar(36) not null ;
