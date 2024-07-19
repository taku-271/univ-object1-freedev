CREATE TABLE IF NOT EXISTS `user` (
    `id` int AUTO_INCREMENT not null PRIMARY KEY,
    `name` varchar(50)
);

CREATE TABLE IF NOT EXISTS `subject` (
    `id` int AUTO_INCREMENT not null PRIMARY KEY,
    `name` varchar(50),
    `time` int,
    `user_id` int,
    `teacher_id` int
);

CREATE TABLE IF NOT EXISTS `teacher` (
    `id` int AUTO_INCREMENT not null PRIMARY KEY,
    `name` varchar(50)
);