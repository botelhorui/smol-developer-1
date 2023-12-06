-- Create Todo
INSERT INTO todo (title, description, status) VALUES (:title, :description, :status);

-- Read Todo
SELECT * FROM todo WHERE id = :id;

-- Update Todo
UPDATE todo SET title = :title, description = :description, status = :status WHERE id = :id;

-- Delete Todo
DELETE FROM todo WHERE id = :id;

-- List all Todos
SELECT * FROM todo;