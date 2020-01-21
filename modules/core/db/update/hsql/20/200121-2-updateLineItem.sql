alter table ECOMMERCE_LINE_ITEM alter column PRODUCT_ID rename to PRODUCT_ID__U64933 ^
alter table ECOMMERCE_LINE_ITEM alter column PRODUCT_ID__U64933 set null ;
alter table ECOMMERCE_LINE_ITEM drop constraint FK_ECOMMERCE_LINE_ITEM_ON_PRODUCT ;
drop index IDX_ECOMMERCE_LINE_ITEM_ON_PRODUCT ;
