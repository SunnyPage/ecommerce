alter table ECOMMERCE_ORDER alter column SHIP_TO_ID rename to SHIP_TO_ID__U94075 ^
alter table ECOMMERCE_ORDER alter column SHIP_TO_ID__U94075 set null ;
alter table ECOMMERCE_ORDER drop constraint FK_ECOMMERCE_ORDER_ON_SHIP_TO ;
drop index IDX_ECOMMERCE_ORDER_ON_SHIP_TO ;
alter table ECOMMERCE_ORDER add column ADDRESS_ID varchar(36) ;
