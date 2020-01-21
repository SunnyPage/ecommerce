-- alter table ECOMMERCE_SHOPPING_CARD add column USER_ID varchar(36) ^
-- update ECOMMERCE_SHOPPING_CARD set USER_ID = <default_value> ;
-- alter table ECOMMERCE_SHOPPING_CARD alter column USER_ID set not null ;
alter table ECOMMERCE_SHOPPING_CARD add column USER_ID varchar(36) not null ;
