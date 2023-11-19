CREATE TABLE IF NOT EXISTS Homework
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    description TEXT         NOT NULL
);


CREATE TABLE IF NOT EXISTS Lesson
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    updatedAt   TIMESTAMP    NOT NULL,
    homework_id INT          NOT NULL,
    FOREIGN KEY (homework_id) REFERENCES Homework (id)
);


CREATE TABLE IF NOT EXISTS Schedule
(
    id        SERIAL PRIMARY KEY,
    name      VARCHAR(255) NOT NULL,
    updatedAt TIMESTAMP    NOT NULL
);


CREATE TABLE IF NOT EXISTS Schedule_Lessons
(
    schedule_id INT NOT NULL,
    lesson_id   INT NOT NULL,
    FOREIGN KEY (schedule_id) REFERENCES Schedule (id),
    FOREIGN KEY (lesson_id) REFERENCES Lesson (id)
);
INSERT INTO Homework (name, description)
VALUES ('Math Homework', 'Solving algebraic equations'),
       ('History Assignment', 'Research on ancient civilizations'),
       ('Programming Task', 'Develop a simple web application');


INSERT INTO Lesson (name, updatedAt, homework_id)
VALUES ('Math Lesson 1', NOW() AT TIME ZONE 'EET', 1),
       ('History Class', NOW() AT TIME ZONE 'EET', 2),
       ('Programming Lab', NOW() AT TIME ZONE 'EET', 3);


INSERT INTO Schedule (name, updatedAt)
VALUES ('Monday Schedule', NOW() AT TIME ZONE 'EET'),
       ('Wednesday Schedule', NOW() AT TIME ZONE 'EET'),
       ('Friday Schedule', NOW() AT TIME ZONE 'EET');


INSERT INTO Schedule_Lessons (schedule_id, lesson_id)
VALUES (1, 1),
       (1, 2),
       (2, 3),
       (3, 1),
       (3, 3);