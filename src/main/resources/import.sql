INSERT INTO role (name, id) VALUES ('ROLE_ADMIN', 1);
INSERT INTO role (name, id) VALUES ('ROLE_USER', 2);

INSERT INTO user (id, username, password) VALUES (1, 'test','$2a$10$MF7hYnWLeLT66gNccBgxaONZHbrSMjlUofkp50sSpBw2PJjUqU.zS');

INSERT INTO user_roles (users_id, roles_id) VALUES (1, 1);