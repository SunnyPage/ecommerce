alter table ECOMMERCE_ACCOUNT add constraint FK_ECOMMERCE_ACCOUNT_ON_PAYMENT foreign key (PAYMENT_ID) references ECOMMERCE_PAYMENT(ID);
create index IDX_ECOMMERCE_ACCOUNT_ON_PAYMENT on ECOMMERCE_ACCOUNT (PAYMENT_ID);