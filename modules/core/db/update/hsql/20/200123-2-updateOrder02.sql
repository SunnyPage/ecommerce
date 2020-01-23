alter table ECOMMERCE_ORDER add column ORDER_ID varchar(255) ^
update ECOMMERCE_ORDER set ORDER_ID = '' where ORDER_ID is null ;
alter table ECOMMERCE_ORDER alter column ORDER_ID set not null ;
