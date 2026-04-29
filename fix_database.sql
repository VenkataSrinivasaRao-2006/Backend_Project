-- Fix script for activities table schema and data insertion

-- 1. Use the correct database
USE nexus_db;

-- 2. Fix the 'enrolled' column (currently erroneously set to DATE in your Workbench)
ALTER TABLE activities MODIFY enrolled INT DEFAULT 0;

-- 3. Correct the 'capacity' column if needed (ensuring it's INT)
ALTER TABLE activities MODIFY capacity INT DEFAULT 0;

-- 4. Correct INSERT statement (including ID and correct data types)
-- Note: 'id' is a required Primary Key in your backend Entity
INSERT INTO activities (id, capacity, category, description, end_date, enrolled, featured, title, status)
VALUES (
    'act-001', 
    50, 
    'technology', 
    'Learn to build robots from scratch with expert guidance.', 
    '2028-04-30', 
    12, 
    1, 
    'Robotics Workshop', 
    'active'
);

-- 5. Another example insert
INSERT INTO activities (id, capacity, category, description, end_date, enrolled, featured, title, status)
VALUES (
    'act-002', 
    30, 
    'sports', 
    'Weekly football practice and inter-college tournament preparation.', 
    '2026-06-15', 
    25, 
    0, 
    'Football Practice', 
    'active'
);

-- 6. Verify data
SELECT * FROM activities;
