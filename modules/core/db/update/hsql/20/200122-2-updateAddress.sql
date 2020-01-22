alter table ECOMMERCE_ADDRESS add column POST_CODE varchar(255) ^
update ECOMMERCE_ADDRESS set POST_CODE = '' where POST_CODE is null ;
alter table ECOMMERCE_ADDRESS alter column POST_CODE set not null ;
alter table ECOMMERCE_ADDRESS add column STREET varchar(255) ^
update ECOMMERCE_ADDRESS set STREET = '' where STREET is null ;
alter table ECOMMERCE_ADDRESS alter column STREET set not null ;
alter table ECOMMERCE_ADDRESS add column CITY varchar(255) ^
update ECOMMERCE_ADDRESS set CITY = '' where CITY is null ;
alter table ECOMMERCE_ADDRESS alter column CITY set not null ;
