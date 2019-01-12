CREATE TABLE `users` (
  `id`        INT(11) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `user_name` VARCHAR(20)                           DEFAULT NULL,
  `pass_word` VARCHAR(20)                           DEFAULT NULL,
  `role`      VARCHAR(20)                           DEFAULT NULL,
);

INSERT INTO `users` (
  user_name, pass_word, role
)
VALUES (
  'Li, Cloud Dragon', 'Italy Cannon', 'Warriors'
);