create database L10;
use L10;

# now creating student table 
CREATE TABLE students (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50),
    age INT,
    course_id INT
);

 # inserting the value in the  Student table 
INSERT INTO students (student_id, student_name, age, course_id)
VALUES
    (1, 'John Smith', 22, 1),
    (2, 'Jane Doe', 20, 2),
    (3, 'Robert Johnson', 25, 1),
    (4, 'Lisa Wang', 21, 3),
    (5, 'Michael Brown', 32, 2);
 
 #creating  course table
CREATE TABLE courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(50)
);

# inserting the value in the table
INSERT INTO courses (course_id, course_name)
VALUES
    (1, 'Math'),
    (2, 'History'),
    (3, 'Science');
select * from students;
select * from courses


# Solution 1 Retrieve the names of students and the names of the courses they are enrolled in:
SELECT s.student_name, c.course_name
FROM students s
INNER JOIN courses c ON s.course_id = c.course_id;


# solution 2 Find the total number of students in each course:
SELECT c.course_name, COUNT(s.student_id) as total_students
FROM courses c
LEFT JOIN students s ON c.course_id = s.course_id
GROUP BY c.course_name;

# solution 3 Retrieve the names of students who are older than 21 years:
SELECT student_name
FROM students
WHERE age > 21;

# solution 4 Find the average age of students in each course:
SELECT c.course_name, AVG(s.age) as average_age
FROM courses c
LEFT JOIN students s ON c.course_id = s.course_id
GROUP BY c.course_name; 

# solution 5 Retrieve the course with the highest number of enrolled students:
SELECT c.course_name
FROM courses c
LEFT JOIN students s ON c.course_id = s.course_id
GROUP BY c.course_name
ORDER BY COUNT(s.student_id) DESC
LIMIT 1;



