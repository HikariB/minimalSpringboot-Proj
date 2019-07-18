DROP TABLE IF EXISTS `user`;


CREATE TABLE `user`
(
    `id`          bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `username`    varchar(255) default null comment '用户名',
    `password`    varchar(255) default null comment '密码',
    `create_time` datetime     default null comment '创建日期',
    primary key (`id`)
) engine = InnoDB auto_increment = 5 default charset =utf8;

show databases
use springbootmybatis
show tables
