CREATE TABLE category
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    name          VARCHAR(255) NULL,
    `description` VARCHAR(255) NULL,
    CONSTRAINT pk_category PRIMARY KEY (id)
);

CREATE TABLE delivery
(
    id          BIGINT AUTO_INCREMENT NOT NULL,
    address     VARCHAR(255) NULL,
    timeslot_id BIGINT NULL,
    status      BIT(1) NULL,
    CONSTRAINT pk_delivery PRIMARY KEY (id)
);

CREATE TABLE items
(
    id             BIGINT AUTO_INCREMENT NOT NULL,
    product_id     BIGINT NULL,
    price DOUBLE NULL,
    supermarket_id BIGINT NULL,
    CONSTRAINT pk_items PRIMARY KEY (id)
);

CREATE TABLE notifications
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    user_id    BIGINT NULL,
    product_id BIGINT NULL,
    CONSTRAINT pk_notifications PRIMARY KEY (id)
);

CREATE TABLE order_products
(
    id       BIGINT AUTO_INCREMENT NOT NULL,
    order_id BIGINT NULL,
    item_id  BIGINT NULL,
    quantity INT NULL,
    price DOUBLE NULL,
    CONSTRAINT pk_order_products PRIMARY KEY (id)
);

CREATE TABLE orders
(
    id          BIGINT AUTO_INCREMENT NOT NULL,
    user_id     BIGINT NULL,
    delivery_id BIGINT NULL,
    total_price DOUBLE NULL,
    CONSTRAINT pk_orders PRIMARY KEY (id)
);

CREATE TABLE products
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    sku           VARCHAR(255) NULL,
    name          VARCHAR(255) NULL,
    `description` VARCHAR(255) NULL,
    image_url     VARCHAR(255) NULL,
    category_id   BIGINT NULL,
    CONSTRAINT pk_products PRIMARY KEY (id)
);

CREATE TABLE ratings
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    user_id    BIGINT NULL,
    product_id BIGINT NULL,
    rating     INT NULL,
    comment    VARCHAR(255) NULL,
    CONSTRAINT pk_ratings PRIMARY KEY (id)
);

CREATE TABLE supermarkets
(
    id     BIGINT AUTO_INCREMENT NOT NULL,
    name   VARCHAR(255) NULL,
    imgurl VARCHAR(255) NULL,
    CONSTRAINT pk_supermarkets PRIMARY KEY (id)
);

CREATE TABLE timeslots
(
    id          BIGINT AUTO_INCREMENT NOT NULL,
    date_year   INT NULL,
    date_month  INT NULL,
    date_day    INT NULL,
    time_hour   INT NULL,
    time_minute INT NULL,
    CONSTRAINT pk_timeslots PRIMARY KEY (id)
);

CREATE TABLE user_accounts
(
    id        BIGINT AUTO_INCREMENT NOT NULL,
    firstname VARCHAR(255) NULL,
    password  VARCHAR(255) NULL,
    email     VARCHAR(255) NULL,
    lastname  VARCHAR(255) NULL,
    `role`    VARCHAR(255) NULL,
    CONSTRAINT pk_useraccounts PRIMARY KEY (id)
);

ALTER TABLE user_accounts
    ADD CONSTRAINT uc_44f8d02451e4803366c6e2665 UNIQUE (email);

ALTER TABLE timeslots
    ADD CONSTRAINT uc_7c45f620729789eff7477d250 UNIQUE (date_year, date_month, date_day, time_hour, time_minute);

ALTER TABLE category
    ADD CONSTRAINT uc_b6c25264ce1642b4407b6d333 UNIQUE (name);

ALTER TABLE products
    ADD CONSTRAINT uc_ef755ae5746cea3d98be5355a UNIQUE (sku);

ALTER TABLE supermarkets
    ADD CONSTRAINT uc_f61568ad2192bf7b993796e39 UNIQUE (name);

ALTER TABLE delivery
    ADD CONSTRAINT FK_DELIVERY_ON_TIMESLOT FOREIGN KEY (timeslot_id) REFERENCES timeslots (id);

ALTER TABLE items
    ADD CONSTRAINT FK_ITEMS_ON_PRODUCT FOREIGN KEY (product_id) REFERENCES products (id);

ALTER TABLE items
    ADD CONSTRAINT FK_ITEMS_ON_SUPERMARKET FOREIGN KEY (supermarket_id) REFERENCES supermarkets (id);

ALTER TABLE notifications
    ADD CONSTRAINT FK_NOTIFICATIONS_ON_PRODUCT FOREIGN KEY (product_id) REFERENCES products (id);

ALTER TABLE notifications
    ADD CONSTRAINT FK_NOTIFICATIONS_ON_USER FOREIGN KEY (user_id) REFERENCES user_accounts (id);

ALTER TABLE orders
    ADD CONSTRAINT FK_ORDERS_ON_DELIVERY FOREIGN KEY (delivery_id) REFERENCES delivery (id);

ALTER TABLE orders
    ADD CONSTRAINT FK_ORDERS_ON_USER FOREIGN KEY (user_id) REFERENCES user_accounts (id);

ALTER TABLE order_products
    ADD CONSTRAINT FK_ORDER_PRODUCTS_ON_ITEM FOREIGN KEY (item_id) REFERENCES items (id);

ALTER TABLE order_products
    ADD CONSTRAINT FK_ORDER_PRODUCTS_ON_ORDER FOREIGN KEY (order_id) REFERENCES orders (id);

ALTER TABLE products
    ADD CONSTRAINT FK_PRODUCTS_ON_CATEGORY FOREIGN KEY (category_id) REFERENCES category (id);

ALTER TABLE ratings
    ADD CONSTRAINT FK_RATINGS_ON_PRODUCT FOREIGN KEY (product_id) REFERENCES products (id);

ALTER TABLE ratings
    ADD CONSTRAINT FK_RATINGS_ON_USER FOREIGN KEY (user_id) REFERENCES user_accounts (id);