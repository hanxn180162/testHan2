--用户信息表
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` varchar(100) NOT NULL COMMENT '用户姓名',
  `user_alias` varchar(100) DEFAULT NULL COMMENT '用户别名',
  `user_id_card` varchar(18) NOT NULL COMMENT '身份证号',
  `user_domicile` varchar(500) DEFAULT NULL COMMENT '户籍所在地',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `creat_time` datetime NOT NULL COMMENT '创建时间',
  `user_phone` int(11) NOT NULL COMMENT '用户手机号',
  `user_addr` varchar(500) DEFAULT NULL COMMENT '用户住址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;