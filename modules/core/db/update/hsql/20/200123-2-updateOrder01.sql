alter table ECOMMERCE_ORDER add constraint FK_ECOMMERCE_ORDER_ON_ACCOUNT foreign key (ACCOUNT_ID) references ECOMMERCE_ACCOUNT(ID);
create index IDX_ECOMMERCE_ORDER_ON_ACCOUNT on ECOMMERCE_ORDER (ACCOUNT_ID);