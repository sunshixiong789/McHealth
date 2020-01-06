--妇女档案和儿童档案
insert into sys_menu values(2001,'档案管理',0,4,'#','menuItem','M','0',NULL,'fa fa-address-card-o','admin','2019-11-12 10:36:41','',NULL,'');

--儿童档案和妇女档案
insert into sys_role_menu values ('2', '2001');
insert into sys_role_menu values ('2', '2002');
insert into sys_role_menu values ('2', '2003');
insert into sys_role_menu values ('2', '2004');
insert into sys_role_menu values ('2', '2005');
insert into sys_role_menu values ('2', '2006');
insert into sys_role_menu values ('2', '2007');
insert into sys_role_menu values ('2', '2008');
insert into sys_role_menu values ('2', '2009');
insert into sys_role_menu values ('2', '2010');
insert into sys_role_menu values ('2', '2011');
insert into sys_role_menu values ('2', '2012');
insert into sys_role_menu values ('2', '2013');
insert into sys_role_menu values ('2', '2014');
insert into sys_role_menu values ('2', '2015');

INSERT INTO sys_dict_type VALUES(100,'痛经','sys_fn_tongjing','0','admin','2019-11-13 11:10:09','',NULL,'痛经');
INSERT INTO sys_dict_type VALUES(101,'月经量','sys_fn_yjl','0','admin','2019-11-13 11:15:47','',NULL,'月经量多少');
INSERT INTO sys_dict_type VALUES(102,'血块','sys_fn_xk','0','admin','2019-11-13 11:18:28','admin','2019-11-13 11:18:44','血块有无');
INSERT INTO sys_dict_type VALUES(103,'是否绝经','sys_fn_jj','0','admin','2019-11-13 11:20:10','',NULL,'是否绝经');
INSERT INTO sys_dict_type VALUES(104,'手术绝经','sys_fn_ssjj','0','admin','2019-11-13 11:29:04','',NULL,'手术绝经');
INSERT INTO sys_dict_type VALUES(105,'绝经后阴道出血','sys_fn_jjhydcx','0','admin','2019-11-13 11:30:36','',NULL,'绝经后阴道出血');
INSERT INTO sys_dict_type VALUES(106,'接触出血','sys_fn_jccx','0','admin','2019-11-13 11:31:37','',NULL,'接触出血');
INSERT INTO sys_dict_type VALUES(107,'白带味','sys_fn_bdw','0','admin','2019-11-13 11:32:38','',NULL,'白带味');
INSERT INTO sys_dict_type VALUES(108,'子宫或附件切除','sys_fn_zghfjqc','0','admin','2019-11-13 11:33:49','',NULL,'子宫或附件切除');
INSERT INTO sys_dict_type VALUES(109,'白带量','sys_fn_bdl','0','admin','2019-11-13 11:34:50','',NULL,'白带量');
INSERT INTO sys_dict_type VALUES(110,'白带色','sys_fn_bds','0','admin','2019-11-13 11:35:57','',NULL,'白带色');
INSERT INTO sys_dict_type VALUES(111,'痒感','sys_fn_yg','0','admin','2019-11-13 13:41:10','',NULL,'痒感');
INSERT INTO sys_dict_type VALUES(112,'婚否','sys_fn_hf','0','admin','2019-11-13 13:42:11','',NULL,'婚否');
INSERT INTO sys_dict_type VALUES(113,'死胎','sys_fn_st','0','admin','2019-11-13 13:43:12','',NULL,'死胎');
INSERT INTO sys_dict_type VALUES(114,'死产','sys_fn_sc','0','admin','2019-11-13 13:43:59','',NULL,'死产');
INSERT INTO sys_dict_type VALUES(115,'产褥感染','sys_fn_crgr','0','admin','2019-11-13 13:44:48','',NULL,'产褥感染');
INSERT INTO sys_dict_type VALUES(116,'出血','sys_fn_cx','0','admin','2019-11-13 13:45:38','admin','2019-11-13 13:55:12','出血');
INSERT INTO sys_dict_type VALUES(117,'乳腺癌','sys_fn_rxa','0','admin','2019-11-13 13:46:24','',NULL,'乳腺癌');
INSERT INTO sys_dict_type VALUES(118,'宫颈癌','sys_fn_gja','0','admin','2019-11-13 13:47:25','',NULL,'宫颈癌');
--数据库字典表
INSERT INTO sys_dict_data VALUES (100,1,'无','0','sys_fn_tongjing',NULL,NULL,'Y','0','admin','2019-11-13 11:12:25','',NULL,'痛经无');
INSERT INTO sys_dict_data VALUES (101,2,'轻','1','sys_fn_tongjing',NULL,NULL,'Y','0','admin','2019-11-13 11:13:09','',NULL,'痛经轻');
INSERT INTO sys_dict_data VALUES (102,3,'中','2','sys_fn_tongjing',NULL,NULL,'Y','0','admin','2019-11-13 11:13:42','',NULL,'痛经中');
INSERT INTO sys_dict_data VALUES (103,4,'重','3','sys_fn_tongjing',NULL,NULL,'Y','0','admin','2019-11-13 11:14:21','',NULL,'痛经重');
INSERT INTO sys_dict_data VALUES (104,1,'无','0','sys_fn_yjl',NULL,NULL,'Y','0','admin','2019-11-13 11:16:43','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (105,2,'少','1','sys_fn_yjl',NULL,NULL,'Y','0','admin','2019-11-13 11:16:57','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (106,3,'中','2','sys_fn_yjl',NULL,NULL,'Y','0','admin','2019-11-13 11:17:38','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (107,4,'多','3','sys_fn_yjl',NULL,NULL,'Y','0','admin','2019-11-13 11:17:52','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (108,1,'无','0','sys_fn_xk',NULL,NULL,'Y','0','admin','2019-11-13 11:19:10','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (109,2,'有','1','sys_fn_xk',NULL,NULL,'Y','0','admin','2019-11-13 11:19:23','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (110,1,'否','0','sys_fn_jj',NULL,NULL,'Y','0','admin','2019-11-13 11:20:58','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (111,2,'有','1','sys_fn_jj',NULL,NULL,'Y','0','admin','2019-11-13 11:21:17','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (112,1,'否','0','sys_fn_ssjj',NULL,NULL,'Y','0','admin','2019-11-13 11:29:30','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (113,2,'是','1','sys_fn_ssjj',NULL,NULL,'Y','0','admin','2019-11-13 11:29:45','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (114,1,'否','0','sys_fn_jjhydcx',NULL,NULL,'Y','0','admin','2019-11-13 11:30:53','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (115,2,'是','1','sys_fn_jjhydcx',NULL,NULL,'Y','0','admin','2019-11-13 11:31:05','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (116,1,'否','0','sys_fn_jccx',NULL,NULL,'Y','0','admin','2019-11-13 11:31:59','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (117,2,'是','1','sys_fn_jccx',NULL,NULL,'Y','0','admin','2019-11-13 11:32:05','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (118,1,'无','0','sys_fn_bdw',NULL,NULL,'Y','0','admin','2019-11-13 11:33:02','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (119,2,'有','1','sys_fn_bdw',NULL,NULL,'Y','0','admin','2019-11-13 11:33:10','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (120,1,'否','0','sys_fn_zghfjqc',NULL,NULL,'Y','0','admin','2019-11-13 11:34:07','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (121,2,'是','1','sys_fn_zghfjqc',NULL,NULL,'Y','0','admin','2019-11-13 11:34:21','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (122,1,'少','0','sys_fn_bdl',NULL,NULL,'Y','0','admin','2019-11-13 11:35:02','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (123,2,'多','1','sys_fn_bdl',NULL,NULL,'Y','0','admin','2019-11-13 11:35:17','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (124,1,'黄色','1','sys_fn_bds',NULL,NULL,'Y','0','admin','2019-11-13 11:36:34','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (125,2,'白色','2','sys_fn_bds',NULL,NULL,'Y','0','admin','2019-11-13 11:36:45','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (126,3,'粉丝','3','sys_fn_bds',NULL,NULL,'Y','0','admin','2019-11-13 11:37:03','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (127,4,'血性','4','sys_fn_bds',NULL,NULL,'Y','0','admin','2019-11-13 11:37:20','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (128,1,'无','1','sys_fn_yg',NULL,NULL,'Y','0','admin','2019-11-13 13:41:33','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (129,2,'有','2','sys_fn_yg',NULL,NULL,'Y','0','admin','2019-11-13 13:41:41','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (130,1,'否','1','sys_fn_hf',NULL,NULL,'Y','0','admin','2019-11-13 13:42:31','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (131,2,'是','2','sys_fn_hf',NULL,NULL,'Y','0','admin','2019-11-13 13:42:47','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (132,1,'无','1','sys_fn_st',NULL,NULL,'Y','0','admin','2019-11-13 13:43:24','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (133,2,'有','2','sys_fn_st',NULL,NULL,'Y','0','admin','2019-11-13 13:43:33','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (134,1,'无','1','sys_fn_sc',NULL,NULL,'Y','0','admin','2019-11-13 13:44:11','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (135,2,'有','2','sys_fn_sc',NULL,NULL,'Y','0','admin','2019-11-13 13:44:20','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (136,1,'无','1','sys_fn_crgr',NULL,NULL,'Y','0','admin','2019-11-13 13:45:00','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (137,2,'有','2','sys_fn_crgr',NULL,NULL,'Y','0','admin','2019-11-13 13:45:09','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (138,1,'无','1','sys_fn_cx',NULL,NULL,'Y','0','admin','2019-11-13 13:45:49','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (139,2,'有','2','sys_fn_cx',NULL,NULL,'Y','0','admin','2019-11-13 13:45:59','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (140,1,'无','1','sys_fn_rxa',NULL,NULL,'Y','0','admin','2019-11-13 13:46:40','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (141,2,'有','2','sys_fn_rxa',NULL,NULL,'Y','0','admin','2019-11-13 13:46:50','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (142,1,'无','1','sys_fn_gja',NULL,NULL,'Y','0','admin','2019-11-13 13:47:36','',NULL,NULL);
INSERT INTO sys_dict_data VALUES (143,2,'有','2','sys_fn_gja',NULL,NULL,'Y','0','admin','2019-11-13 13:47:47','',NULL,NULL);




