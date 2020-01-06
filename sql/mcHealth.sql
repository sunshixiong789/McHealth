--诊断筛查基础表
CREATE TABLE `tb_fb_cqsczdxx` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '记录表单编号',
  `fngrbsh` varchar(64) NOT NULL COMMENT '妇女个人标识号',
  `xm` varchar(32) NOT NULL COMMENT '妇女姓名',
  `sfz` varchar(18) NOT NULL COMMENT '妇女身份证号',
  `mcyjrq` datetime DEFAULT NULL COMMENT '末次月经日期',
  `tz` float(5,1) DEFAULT NULL COMMENT '体重（kg）',
  `yzqrff` varchar(20) DEFAULT NULL COMMENT '孕周确认方法',
  `ts` tinyint(3) DEFAULT NULL COMMENT '胎数',
  `cxsj` datetime DEFAULT NULL COMMENT '采血时间',
  `cxdd` varchar(255) DEFAULT NULL COMMENT '采血地点',
  `ybtxm` varchar(200) DEFAULT NULL COMMENT '样本条形码',
  `cqzdyxyj` varchar(64) DEFAULT NULL COMMENT '产前诊断医学意见',
  `rcjj` char(1) DEFAULT NULL COMMENT '妊娠结局',
  `xgbj` char(1) DEFAULT '1' COMMENT '修改标记。1：正常、2：修改、3：删除',
  `zgrq` datetime DEFAULT NULL COMMENT '修改日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='产前筛查诊断信息表';
--筛查
CREATE TABLE `tb_fb_cqscjg` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '筛查结果id',
  `scid` bigint(20) NOT NULL COMMENT '关联筛查表单id',
	`scrq` datetime  NOT NULL COMMENT '筛查日期',
  `scyz` varchar(64) COMMENT '筛查孕周',
	`scxm` varchar(64) COMMENT '筛查项目',
	`scff` varchar(64) COMMENT '筛查方法',
	`scjg` varchar(64) COMMENT '筛查结果',
	`scdw` varchar(64) COMMENT '筛查单位',
	`scry` varchar(64) COMMENT '检查人员',
  `xgbj` char(1) DEFAULT '1' COMMENT '修改标记。1：正常、2：修改、3：撤销',
	`zgrq` datetime DEFAULT NULL COMMENT '修改日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产前筛查结果记录';


CREATE TABLE `tb_fb_cqzhjl` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '召回id',
  `scid` bigint(20) NOT NULL COMMENT '关联筛查表单id',
	`tzsj` datetime  NOT NULL COMMENT '通知时间',
  `tzry` varchar(64) COMMENT '通知人员',
	`tzfs` varchar(64) COMMENT '通知方式',
	`zhjg` varchar(64) COMMENT '召回结果',
	`scjg` varchar(64) COMMENT '筛查结果',
  `xgbj` char(1) DEFAULT '1' COMMENT '修改标记。1：正常、2：修改、3：撤销',
	`zgrq` datetime DEFAULT NULL COMMENT '修改日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产前筛查召回记录';


CREATE TABLE `tb_fb_cqzxjl` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '咨询id',
  `scid` bigint(20) NOT NULL COMMENT '关联筛查表单id',
	`zxrq` datetime  NOT NULL COMMENT '咨询日期',
  `zxys` varchar(64) COMMENT '咨询医生',
	`zxnr` varchar(64) COMMENT '咨询内容',
	`zdyj` varchar(64) COMMENT '指导意见',
  `xgbj` char(1) DEFAULT '1' COMMENT '修改标记。1：正常、2：修改、3：撤销',
	`zgrq` datetime DEFAULT NULL COMMENT '修改日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产前筛查咨询记录';


--诊断
CREATE TABLE `tb_fb_cqsczdjl` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '诊断id',
  `scid` bigint(20) NOT NULL COMMENT '关联筛查表单id',
	`scrq` datetime NOT NULL COMMENT '诊断日期',
  `zdyz` varchar(64) DEFAULT NULL COMMENT '诊断孕周',
  `zdxm` varchar(64) DEFAULT NULL COMMENT '诊断项目',
  `zdff` varchar(64) DEFAULT NULL COMMENT '诊断方法',
  `zdjg` varchar(64) DEFAULT NULL COMMENT '诊断结果',
  `zddw` varchar(64) DEFAULT NULL COMMENT '诊断单位',
  `jcry` varchar(64) DEFAULT NULL COMMENT '检查人员',
  `xgbj` char(1) DEFAULT '1' COMMENT '修改标记。1：正常、2：修改、3：撤销',
	`zgrq` datetime DEFAULT NULL COMMENT '修改日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产前诊断记录';

CREATE TABLE `tb_fb_cqsczfjl` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '追访id',
  `scid` bigint(20) NOT NULL COMMENT '关联筛查表单id',
	`zfrq` datetime NOT NULL COMMENT '追访日期',
  `zfry` varchar(64) DEFAULT NULL COMMENT '追访人员',
  `sfrstbe` char(1) DEFAULT NULL COMMENT '是否染色体病儿,0 否 1是',
  `sfntdstbe` char(1) DEFAULT NULL COMMENT '是否NTD三体病儿,0 否 1是',
  `sfstbe` char(1) DEFAULT NULL COMMENT '是否21三体病儿0 否 1是',
  `sfshibastbe` char(1) DEFAULT NULL COMMENT '是否18三体病儿0 否 1是',
  `ywjx` char(1) DEFAULT NULL COMMENT '有无畸形0 否 1是',
	`fmyz` VARCHAR(32) DEFAULT NULL COMMENT '分娩孕周',
 `sfhc` char(1) DEFAULT NULL COMMENT '是否活产0 否 1是',
	`csrq` datetime DEFAULT NULL COMMENT '出生日期',
  `xgbj` char(1) DEFAULT '1' COMMENT '修改标记。1：正常、2：修改、3：撤销',
	`zgrq` datetime DEFAULT NULL COMMENT '修改日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产前筛查追访记录';


-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('产前筛查诊断信息', '3', '1', '/fn/cqsczdxx', 'C', '0', 'fn:cqsczdxx:view', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '产前筛查诊断信息菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('产前筛查诊断信息查询', @parentId, '1',  '#',  'F', '0', 'fn:cqsczdxx:list',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('产前筛查诊断信息新增', @parentId, '2',  '#',  'F', '0', 'fn:cqsczdxx:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('产前筛查诊断信息修改', @parentId, '3',  '#',  'F', '0', 'fn:cqsczdxx:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('产前筛查诊断信息删除', @parentId, '4',  '#',  'F', '0', 'fn:cqsczdxx:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('产前筛查诊断信息导出', @parentId, '5',  '#',  'F', '0', 'fn:cqsczdxx:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');




