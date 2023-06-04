-- Example 1
INSERT INTO persons (first_name, last_name, age, country)
VALUES
    ('Vikram', 'Verma', 27, 'India'),
    ('Priya', 'Reddy', 31, 'India'),
    ('Rahul', 'Sinha', 29, 'India'),
    ('Isha', 'Malhotra', 26, 'India'),
    ('Karan', 'Shah', 33, 'India');

-- Example 2
INSERT INTO persons (first_name, last_name, age, country)
VALUES
    ('Sanjana', 'Bose', 24, 'India'),
    ('Rohit', 'Gupta', 30, 'India'),
    ('Pooja', 'Chopra', 28, 'India'),
    ('Kunal', 'Mukherjee', 32, 'India'),
    ('Ananya', 'Rajput', 26, 'India');

-- Example 3
INSERT INTO persons (first_name, last_name, age, country)
VALUES
    ('Rishi', 'Thakur', 29, 'India'),
    ('Tanvi', 'Nair', 27, 'India'),
    ('Arjun', 'Iyer', 31, 'India'),
    ('Trisha', 'Raj', 25, 'India'),
    ('Aditya', 'Menon', 33, 'India');

-- Example 4
INSERT INTO persons (first_name, last_name, age, country)
VALUES
    ('Lakshmi', 'Rajesh', 35, 'United States'),
    ('Aarav', 'Kapoor', 28, 'Canada'),
    ('Sneha', 'Sharma', 32, 'Australia'),
    ('Akash', 'Mehta', 30, 'United Kingdom'),
    ('Simran', 'Kaur', 27, 'Germany');

-- Example 5
INSERT INTO persons (first_name, last_name, age, country)
VALUES
    ('Nikhil', 'Sharma', 29, 'France'),
    ('Shreya', 'Chatterjee', 26, 'Singapore'),
    ('Rajiv', 'Gupta', 33, 'United Arab Emirates'),
    ('Ayesha', 'Malik', 31, 'Malaysia'),
    ('Rahul', 'Saxena', 28, 'Japan');

INSERT INTO email (person_id, email)
VALUES
    (1, 'vikram.verma@gmail.com'),
    (2, 'priya.reddy@yahoo.com'),
    (3, 'rahul.sinha@hotmail.com'),
    (4, 'isha.malhotra@outlook.com'),
    (5, 'karan.shah@live.com'),
    (6, 'sanjana.bose@icloud.com'),
    (7, 'rohit.gupta@protonmail.com'),
    (7, 'rohit.gupta2@fastmail.com'),
    (7, 'rohit.gupta3@zoho.com'), -- Repeated ID with different email addresses
    (8, 'pooja.chopra@yandex.com'),
    (9, 'kunal.mukherjee@rediffmail.com'),
    (10, 'ananya.rajput@mail.com'),
    (10, 'ananya.rajput2@gmx.com'),
    (11, 'rishi.thakur@inbox.com'),
    (12, 'tanvi.nair@protonmail.com'),
    (12, 'tanvi.nair2@fastmail.com'), -- Repeated ID with different email addresses
    (13, 'arjun.iyer@yandex.com'),
    (14, 'trisha.raj@mail.com'),
    (15, 'aditya.menon@outlook.com'),
    (16, 'lakshmi.rajesh@hotmail.com'),
    (16, 'lakshmi.rajesh2@gmail.com'),
    (17, 'aarav.kapoor@yahoo.com'),
    (17, 'aarav.kapoor2@icloud.com'), -- Repeated ID with different email addresses
    (18, 'sneha.sharma@protonmail.com'),
    (19, 'akash.mehta@rediffmail.com'),
    (19, 'akash.mehta2@zoho.com'),
    (20, 'simran.kaur@gmx.com'),
    (21, 'nikhil.sharma@inbox.com'),
    (21, 'nikhil.sharma2@yahoo.com'),
    (22, 'shreya.chatterjee@mail.com'),
    (23, 'rajiv.gupta@outlook.com'),
    (24, 'ayesha.malik@live.com'),
    (24, 'ayesha.malik2@protonmail.com'), -- Repeated ID with different email addresses
    (25, 'rahul.saxena@fastmail.com'),
    (25, 'rahul.saxena2@yandex.com');


-- Example 1
INSERT INTO phone (person_id, phone)
VALUES
    (1, '12345'),
    (2, '23456'),
    (3, '34567'),
    (4, '45678'),
    (5, '56789'),
    (6, '67890'),
    (7, '78901'),
    (7, '89012'),
    (7, '90123'),
    (8, '01234'),
    (9, '12346'),
    (10, '23457'),
    (10, '34568'),
    (11, '45679'),
    (12, '56780'),
    (12, '67891'),
    (13, '78902'),
    (14, '89013'),
    (15, '90124'),
    (16, '01235'),
    (16, '12347'),
    (17, '23458'),
    (17, '34569'),
    (18, '45670'),
    (19, '56781'),
    (19, '67892'),
    (20, '78903'),
    (21, '89014'),
    (21, '90125'),
    (22, '01236'),
    (23, '12348'),
    (24, '23459'),
    (24, '34560'),
    (25, '45671'),
    (25, '56782');