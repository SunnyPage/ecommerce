alter table ECOMMERCE_CUSTOMER add constraint FK_ECOMMERCE_CUSTOMER_ON_ACCOUNT_CUSTOMER foreign key (ACCOUNT_CUSTOMER_ID) references ECOMMERCE_ACCOUNT(ID);
create index IDX_ECOMMERCE_CUSTOMER_ON_ACCOUNT_CUSTOMER on ECOMMERCE_CUSTOMER (ACCOUNT_CUSTOMER_ID);
