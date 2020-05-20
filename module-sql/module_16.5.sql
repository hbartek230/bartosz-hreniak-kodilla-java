insert into posts (user_id, body) values (1, "test_body");

update posts
set body = "To delete"
order by id desc limit 1;

delete from posts
order by id desc limit 1;

commit;

insert into posts (user_id, body) values (3, "Hi kodilla. I`m here :)");

update posts
set body = "To delete"
order by id desc limit 1;

delete from posts
order by id desc limit 1;

commit;

insert into posts (user_id, body) values (4, "And now I`m not here :(");

update posts
set body = "To delete"
order by id desc limit 1;

delete from posts
order by id desc limit 1;

commit;



