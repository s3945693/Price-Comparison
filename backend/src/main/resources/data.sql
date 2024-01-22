-- Insert a user
INSERT INTO USER_ACCOUNTS(firstname,password,email,lastname,role) VALUES('john','password','john@example.com','dam','customer');

-- TODO for Sandrup
-- Make 10 categories (Fruits, Vegs, Meat, Dairy, Drinks, Snacks, Bakery, Household, Seafood, Pet)
-- For each category 4-6 products
-- And for each product around 1-3 items
-- Wanting around 50 products all together, across all categories
-- And 100 items across all the products combines

--Process to insert a product

--Ensure a Supermarket exists
-- Insert a supermarket
INSERT INTO Supermarkets (name,imgurl) VALUES ('Aldi','https://cannoncentral.com.au/wp-content/uploads/2019/02/new-aldi-logo-png-latest-.png');
INSERT INTO Supermarkets (name,imgurl) VALUES ('Coles','https://pbs.twimg.com/profile_images/1480692480748122113/Utk6zrlI_400x400.png');
INSERT INTO Supermarkets (name,imgurl) VALUES ('Woolworths','https://www.chirnsidepark.com.au/Upload/ChirnsidePark/Media/Store-Logo/logo-woolworths.jpg?width=250&height=161');

--Create relavent categories and product, insert into following tables
-- Insert a category
INSERT INTO category (name, description) VALUES ('Fruits', 'Fresh Fruits');

INSERT INTO category (name, description) VALUES ('Vegetable', 'Fresh Vegetables');

INSERT INTO category (name, description) VALUES ('Meat', 'Not fruits and vegetables');

INSERT INTO category (name, description) VALUES ('Dairy', 'Some white stuff + eggs');

INSERT INTO category (name, description) VALUES ('Drinks', 'Non-carbonated drinks and carbonated drinks');

INSERT INTO category (name, description) VALUES ('Snacks', 'All snack froms chips to biscuits');

INSERT INTO category (name, description) VALUES ('Bakery', 'Baked stuff');

INSERT INTO category (name, description) VALUES ('Household', 'Home stuff and Toiletry');

INSERT INTO category (name, description) VALUES ('Seafood', 'Fishy things');

INSERT INTO category (name, description) VALUES ('Pet', 'Pet Food');

-- Insert a product
-- fruits
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1230', 'Apple', 'Red delicious apple', 'https://www.applesfromny.com/wp-content/uploads/2020/06/SnapdragonNEW.png', 1);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1231', 'Orange', 'Orange delicious Orange', 'https://upload.wikimedia.org/wikipedia/commons/4/43/Ambersweet_oranges.jpg', 1);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1232', 'Banana', 'Yellow delicious Banana', 'https://www.rainforest-alliance.org/wp-content/uploads/2021/06/bananas-1-e1624909301641-416x400.jpg.optimal.jpg', 1);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1233', 'Pear', 'Green delicious Pear', 'https://static.independent.co.uk/s3fs-public/thumbnails/image/2014/11/06/17/pears3.jpg', 1);

-- veg
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1234', 'Carrot', 'Vitamin A filled Carrot', 'https://harvestmarkets.com.au/cdn/shop/products/ResizerImage2048X1535_1024x1024.jpg?v=1585620612', 2);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1235', 'Potato', 'Cripsy Potato', 'https://cdn.mos.cms.futurecdn.net/iC7HBvohbJqExqvbKcV3pP.jpg', 2);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1236', 'Tomato', 'Red juicy Tomato', 'https://images-prod.healthline.com/hlcmsresource/images/AN_images/tomatoes-1296x728-feature.jpg', 2);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1237', 'Onion', 'Onion', 'https://www.capitalagro.com/wp-content/uploads/2023/04/onion.jpg', 2);

-- meat
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1238', 'Chicken', 'White meat', 'https://images.themodernproper.com/billowy-turkey/production/posts/2020/How-to-spatchcock-a-chicken-5.jpg?w=960&h=720&q=82&fm=jpg&fit=crop&dm=1599768907&s=89c6263d02bb785b77b58e1c58971c1e', 3);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1239', 'Beef', 'Red meat', 'https://cdn.britannica.com/68/143268-050-917048EA/Beef-loin.jpg', 3);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1240', 'Pork', 'Pink meat', 'https://www.meatemporium.com.au/cdn/shop/products/JA_AME_Rolledporkloin_31.jpg?v=1631617038', 3);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1241', 'Lamb', 'Other red meat', 'https://www.foodandwine.com/thmb/_TAeqmL6RvD3VFJnxHbC8Y7ATnk=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/FAW-garlic-crusted-roast-rack-lamb-step-05-02-465518514eaf4b1181743b001408a766.jpg', 3);

-- dairy
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1242', 'Milk', 'Things that come out of cows', 'https://static.toiimg.com/thumb/msid-70139351,width-1280,resizemode-4/70139351.jpg', 4);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1243', 'Cheese', 'Things made from milk', 'https://www.harrisfarm.com.au/cdn/shop/products/82302-done_1024x1024.jpg?v=1605910613', 4);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1244', 'Yogurt', 'Other things made from milk', 'https://www.daringgourmet.com/wp-content/uploads/2021/01/How-to-Make-Yogurt-7.jpg', 4);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1245', 'Butter', 'Other other things made from milk', 'https://www.allrecipes.com/thmb/gjqwCdxVSuMm9nGxNwK2kvtXk-c=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/GettyImages-149134517-2000-da0f871a31e74910adea236f29b5ccfb.jpg', 4);

-- drinks
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1246', 'Coke', 'Tastes worse than pepsi', 'https://kentstreetcellars.com.au/cdn/shop/files/coke-125l_2048x.png?v=1687842735', 5);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1247', 'Pepsi', 'tastes better than coke', 'https://scbc.au/cdn/shop/products/600ml-pepsi-bottles.jpg?v=1589372481', 5);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1248', 'Sprite', 'Basically sparkling lemonade', 'https://mygoodness.com.au/wp-content/uploads/2021/05/MG_Sprite-1-25lt.jpg', 5);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1249', 'Fanta', 'Sparkling orange drink', 'https://cdn0.woolworths.media/content/wowproductimages/large/032812.jpg', 5);

-- snacks
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1250', 'Chips', 'Chips', 'https://www.servedfromscratch.com/wp-content/uploads/2021/05/Homemade-Potato-Chips-08.jpg', 6);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1251', 'Chocolate', 'Not white chocolate', 'https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/Milka_Alpine_Milk_Chocolate_bar_100g_with_chunks_broken_off.jpg/1200px-Milka_Alpine_Milk_Chocolate_bar_100g_with_chunks_broken_off.jpg', 6);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1252', 'Lollies', 'Squishy sweets', 'https://theoriginallollystore.com.au/cdn/shop/products/image_40c9eb66-e86f-40dc-9515-17ce8b7dc46b.jpg?v=1676974049', 6);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1253', 'Biscuits', 'Hard sweets', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQrKWYha5oBk51KN0OEztZxJ4y2mvEqib3bbtkySk0bBUZebz7HXP8zx6-548DpvV2RYr8&usqp=CAU', 6);

-- bakery
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1254', 'Bread', 'Bread', 'https://houseofnasheats.com/wp-content/uploads/2022/02/French-Bread-1.jpg', 7);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1255', 'Cake', 'Used at Bday parties', 'https://www.recipetineats.com/wp-content/uploads/2020/08/My-best-Vanilla-Cake_9-SQ.jpg', 7);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1256', 'Croissant', 'French bread', 'https://static01.nyt.com/images/2021/04/07/dining/06croissantsrex1/merlin_184841898_ccc8fb62-ee41-44e8-9ddf-b95b198b88db-articleLarge.jpg', 7);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1257', 'Muffin', 'Small cakes', 'https://thefirstyearblog.com/wp-content/uploads/2020/05/Chocolate-Chip-Muffins-2023-Square.png', 7);

-- household
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1258', 'Toilet Paper', 'Paper for pooping', 'https://prestigewa.com.au/wp-content/uploads/1970/01/25b2916b5c49db617f5265-scaled-1.jpg', 8);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1259', 'Paper Towel', 'Towel made from paper', 'https://upload.wikimedia.org/wikipedia/commons/thumb/5/54/Paper_towel.jpg/1200px-Paper_towel.jpg', 8);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1260', 'Tissues', 'Used when people are crying', 'https://s3-ap-southeast-2.amazonaws.com/wc-prod-pim/JPEG_1000x1000/SC57607_tork_premium_2_ply_facial_tissues_224_sheets.jpg', 8);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1261', 'Dishwashing Liquid', 'Liquid for dishwashing', 'https://cdn0.woolworths.media/content/wowproductimages/large/208112.jpg', 8);

-- seafood
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1262', 'Salmon', 'Pink fish', 'https://cdn.apartmenttherapy.info/image/upload/f_jpg,q_auto:eco,c_fill,g_auto,w_1500,ar_1:1/k%2F2023-04-baked-salmon-how-to%2Fbaked-salmon-step6-4792', 9);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1263', 'Prawns', 'Shrimp on da barbie', 'https://www.seafoodandmore.com.au/cdn/shop/products/cookedandpeeledprawns.jpg?v=1588605997', 9);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1264', 'Squid', 'Not octopus', 'https://www.thespruceeats.com/thmb/WktfcPsWx0Inh0xm9oQdW4228IY=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/calamari_1806999-2-e8a531d5915e49719d5b049fd6fa00a1.jpg', 9);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1265', 'Crab', 'Not the STD', 'https://fishme.com.au/cdn/shop/products/Mud-Crab_4_53527aae-13e0-4da2-a21e-6f8e01b63756_512x512.jpg?v=1642648348', 9);

-- pet
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1266', 'Dog Food', 'Food for dog', 'https://www.goblespetandgrain.com.au/cdn/shop/products/sd-adult-large-breed-dog-food-dry-productKibble_500_grande.png?v=1564203648', 10);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1267', 'Cat Food', 'Food for cat', 'https://cdn0.woolworths.media/content/wowproductimages/large/053224.jpg', 10);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1268', 'Fish Food', 'Food for fish', 'https://i.ebayimg.com/images/g/E7IAAOSwYgdj770I/s-l1600.jpg', 10);
INSERT INTO products (SKU, name, description, image_url, category_id) VALUES ('1269', 'Bird Food', 'Food for birds', 'https://i.etsystatic.com/22936368/r/il/621c4c/3610986359/il_fullxfull.3610986359_96es.jpg', 10);


-- For each supermarket, insert an item that is matches to the product
-- Insert an item
-- Fruit
INSERT INTO items (product_id, price, supermarket_id) VALUES (1, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (1, 3.99, 2);

INSERT INTO items (product_id, price, supermarket_id) VALUES (2, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (2, 3.99, 2);
INSERT INTO items (product_id, price, supermarket_id) VALUES (2, 4.99, 3);

INSERT INTO items (product_id, price, supermarket_id) VALUES (3, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (3, 4.99, 3);

INSERT INTO items (product_id, price, supermarket_id) VALUES (4, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (4, 3.99, 2);

-- Veg
INSERT INTO items (product_id, price, supermarket_id) VALUES (5, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (5, 3.99, 2);

INSERT INTO items (product_id, price, supermarket_id) VALUES (6, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (6, 3.99, 2);
INSERT INTO items (product_id, price, supermarket_id) VALUES (6, 4.99, 3);

INSERT INTO items (product_id, price, supermarket_id) VALUES (7, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (7, 3.99, 2);

INSERT INTO items (product_id, price, supermarket_id) VALUES (8, 2.99, 1);

-- Meat
INSERT INTO items (product_id, price, supermarket_id) VALUES (9, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (9, 3.99, 2);

INSERT INTO items (product_id, price, supermarket_id) VALUES (10, 2.99, 3);

INSERT INTO items (product_id, price, supermarket_id) VALUES (11, 2.99, 2);

INSERT INTO items (product_id, price, supermarket_id) VALUES (12, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (12, 3.99, 2);

-- Dairy
INSERT INTO items (product_id, price, supermarket_id) VALUES (13, 2.99, 1);

INSERT INTO items (product_id, price, supermarket_id) VALUES (14, 2.99, 3);

INSERT INTO items (product_id, price, supermarket_id) VALUES (15, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (15, 3.99, 3);

INSERT INTO items (product_id, price, supermarket_id) VALUES (16, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (16, 3.99, 2);

-- Drinks
INSERT INTO items (product_id, price, supermarket_id) VALUES (17, 2.99, 2);

INSERT INTO items (product_id, price, supermarket_id) VALUES (18, 2.99, 3);
INSERT INTO items (product_id, price, supermarket_id) VALUES (18, 3.99, 2);

INSERT INTO items (product_id, price, supermarket_id) VALUES (19, 2.99, 1);

INSERT INTO items (product_id, price, supermarket_id) VALUES (20, 2.99, 3);

-- Snacks
INSERT INTO items (product_id, price, supermarket_id) VALUES (21, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (21, 3.99, 2);

INSERT INTO items (product_id, price, supermarket_id) VALUES (22, 2.99, 3);
INSERT INTO items (product_id, price, supermarket_id) VALUES (22, 3.99, 2);

INSERT INTO items (product_id, price, supermarket_id) VALUES (23, 2.99, 1);

INSERT INTO items (product_id, price, supermarket_id) VALUES (24, 2.99, 2);

-- Bakery
INSERT INTO items (product_id, price, supermarket_id) VALUES (25, 2.99, 3);

INSERT INTO items (product_id, price, supermarket_id) VALUES (26, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (26, 3.99, 2);
INSERT INTO items (product_id, price, supermarket_id) VALUES (26, 4.99, 3);

INSERT INTO items (product_id, price, supermarket_id) VALUES (27, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (27, 3.99, 2);

INSERT INTO items (product_id, price, supermarket_id) VALUES (28, 2.99, 3);

-- Household
INSERT INTO items (product_id, price, supermarket_id) VALUES (29, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (29, 3.99, 2);

INSERT INTO items (product_id, price, supermarket_id) VALUES (30, 2.99, 3);

INSERT INTO items (product_id, price, supermarket_id) VALUES (31, 2.99, 1);

INSERT INTO items (product_id, price, supermarket_id) VALUES (32, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (32, 3.99, 2);
INSERT INTO items (product_id, price, supermarket_id) VALUES (32, 4.99, 3);

-- Seafood
INSERT INTO items (product_id, price, supermarket_id) VALUES (33, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (33, 3.99, 2);
INSERT INTO items (product_id, price, supermarket_id) VALUES (33, 4.99, 3);

INSERT INTO items (product_id, price, supermarket_id) VALUES (34, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (34, 3.99, 2);

INSERT INTO items (product_id, price, supermarket_id) VALUES (35, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (35, 3.99, 2);

INSERT INTO items (product_id, price, supermarket_id) VALUES (36, 2.99, 3);

-- Pet
INSERT INTO items (product_id, price, supermarket_id) VALUES (37, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (37, 3.99, 2);

INSERT INTO items (product_id, price, supermarket_id) VALUES (38, 2.99, 2);

INSERT INTO items (product_id, price, supermarket_id) VALUES (39, 2.99, 1);

INSERT INTO items (product_id, price, supermarket_id) VALUES (40, 2.99, 1);
INSERT INTO items (product_id, price, supermarket_id) VALUES (40, 3.99, 2);

-- -- attempt to simplify the process
-- -- fruits
-- INSERT INTO items (product_id, price, supermarket_id)
-- VALUES (1, 2.99, 1), (1, 3.99, 2), (2, 2.99, 1), (2, 3.99, 2), (2, 4.99, 3), (3, 2.99, 1), (3, 4.99, 3), (4, 2.99, 1), (4, 3.99, 2),

-- -- Veg
-- INSERT INTO items (product_id, price, supermarket_id)
-- VALUES (5, 2.99, 1), (5, 3.99, 2),
--     (6, 2.99, 1), (6, 3.99, 2), (6, 4.99, 3),
--     (7, 2.99, 1), (7, 3.99, 2),
-- -- Meat
--     (9, 2.99, 1), (9, 3.99, 2),
--     (10, 2.99, 1),
--     (11, 2.99, 1),
--     (12, 2.99, 1), (12, 3.99, 2),
-- -- Dairy
--     (13, 2.99, 1),
--     (14, 2.99, 1),
--     (15, 2.99, 1), (15, 3.99, 2),
--     (16, 2.99, 1), (16, 3.99, 2),
-- -- Drinks
--     (17, 2.99, 1),
--     (18, 2.99, 1), (18, 3.99, 2),
--     (19, 2.99, 1),
--     (20, 2.99, 1),
-- -- Snacks
--     (21, 2.99, 1), (21, 3.99, 2),
--     (22, 2.99, 1), (22, 3.99, 2),
--     (23, 2.99, 1),
--     (24, 2.99, 1),
-- -- Bakery
--     (25, 2.99, 1),
--     (26, 2.99, 1), (26, 3.99, 2), (26, 4.99, 3),
--     (27, 2.99, 1), (27, 3.99, 2),
--     (28, 2.99, 1),
-- -- Household
--     (29, 2.99, 1), (29, 3.99, 2),
--     (30, 2.99, 1),
--     (31, 2.99, 1),
--     (32, 2.99, 1), (32, 3.99, 2), (32, 4.99, 3),
-- -- Seafood
--     (33, 2.99, 1), (33, 3.99, 2), (33, 4.99, 3),
--     (34, 2.99, 1), (34, 3.99, 2),
--     (35, 2.99, 1), (35, 3.99, 2),
--     (36, 2.99, 1),
-- -- Pet
--     (37, 2.99, 1), (37, 3.99, 2),
--     (38, 2.99, 1),
--     (39, 2.99, 1),
--     (40, 2.99, 1), (40, 3.99, 2);

--Process for inserting an order

--Create the timeslot for the delivery first, and then create the delivery with the timeslot
--Status represent devilery status, true for delivered
-- Insert a timeslot
INSERT INTO timeslots (date_year,date_month,date_day,time_hour,time_minute) VALUES(2023,12,6,15,30);
-- Insert a delivery
INSERT INTO delivery (address, timeslot_id,status) VALUES ('123 Main St', 1, false);

--Create the order with the relavent delivery and user
-- Insert an order
INSERT INTO orders (user_id, delivery_id, total_price) VALUES (1, 1, 10.99);

--For each product within the order, insert an order product, linking it to the orderId
-- Insert an order product
INSERT INTO order_products (order_id, item_id, quantity, price) VALUES (1, 1, 2, 5.98);

-- Insert a rating
INSERT INTO ratings (user_id, product_id, rating, comment) VALUES (1, 1, 5, 'Great product!');

-- Insert a Notification
INSERT INTO notifications (user_id, product_id, price) VALUES (1, 1, 2.99);