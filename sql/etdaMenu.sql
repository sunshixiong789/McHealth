-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('儿童档案', '2001', '1', '/jbda/etda', 'C', '0', 'jbda:etda:view', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '儿童档案菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('儿童档案查询', @parentId, '1',  '#',  'F', '0', 'jbda:etda:list',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('儿童档案新增', @parentId, '2',  '#',  'F', '0', 'jbda:etda:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('儿童档案修改', @parentId, '3',  '#',  'F', '0', 'jbda:etda:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('儿童档案删除', @parentId, '4',  '#',  'F', '0', 'jbda:etda:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('儿童档案导出', @parentId, '5',  '#',  'F', '0', 'jbda:etda:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');
--儿童档案信息表
drop table if exists tx_child_info;
CREATE TABLE `tx_child_info` (
  `HEALTH_FILE_ID` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '健康档案号',
  `cardID` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '身份证号',
  `CHILD_NAME` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '儿童姓名',
  `BIRTHDAY` DATE DEFAULT NULL COMMENT '生日',
  `AGE` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '年龄',
  `GENDER` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '性别',
  `NATIONALITY` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '民族',
  `FATHER_NAME` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '父亲姓名',
  `FATHER_JOB` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '父亲单位',
  `MOTHER_NAME` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '母亲姓名',
  `MOTHER_JOB` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '母亲单位',
  `ADDRESS` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '家庭地址',
  `PHONE` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '联系电话',
  `CREAT_TIME` DATE DEFAULT NULL COMMENT '建卡时间',
  `NURSERY` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '托幼单位',
  `NURSERY_TIME` DATE DEFAULT NULL COMMENT '入托时间',
  `FATHER_ID` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '父亲身份证',
  `MOTHER_ID` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '母亲身份证',
  PRIMARY KEY USING BTREE (`HEALTH_FILE_ID`)
) ENGINE=InnoDB
AUTO_INCREMENT=3 CHARACTER SET 'utf8' COLLATE 'utf8_general_ci'
COMMENT='儿童档案表'
;

--妇女档案信息表
drop table if exists tx_woman_info;
CREATE TABLE `tx_woman_info` (
  `HEALTH_FILE_ID` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '健康档案号',
  `name` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '姓名',
  `gender` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '性别',
  `address` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '住址',
  `birthday` DATE DEFAULT NULL COMMENT '出生日期',
  `cardId` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '身份证号',
  `nation` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '民族',
  `MENOPHANIAN_AGE` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '初潮年龄',
  `MENSTRUAL_CYCLE` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '月经周期',
  `MENSTRUAL_PERIOD` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '行经天数',
  `hurt` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '痛经',
  `MENSTRUAL_QUANTITY` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '月经量',
  `BLOOD_CLOT` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '血块',
  `STOP_FLAG` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '是否绝经',
  `STOP_AGE` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '绝经年龄',
  `OPERATION_STOP` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '手术绝经',
  `BLEEDING_AFTER_STOP` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '绝经后阴道出血',
  `CONTACT_BLEEDING` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '接触出血',
  `SMELL_LEUCORRHEA` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '白带味',
  `DISCARD_FLAG` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '子宫或附件切除',
  `DISCARD_DATE` DATE DEFAULT NULL COMMENT '切除年月',
  `LEUCORRHEA_QUANTITY` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '白带量',
  `LEUCORRHEA_COLOR` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '白带色',
  `LEUCORRHEA_COLOR_OTHER` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '其他',
  `ITCH` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '氧感',
  `MARRIAGE` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '婚否',
  `MARRIAGE_AGE` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '结婚年龄',
  `GESTATION_TIMES` INTEGER(11) DEFAULT NULL COMMENT '妊娠次数',
  `DELIVERY_TIMES` INTEGER(11) DEFAULT NULL COMMENT '生育次数',
  `CESAREAN_TIMES` INTEGER(11) DEFAULT NULL COMMENT '剖宫产次数',
  `ARTIFICIAL_ABORTION` INTEGER(11) DEFAULT NULL COMMENT '人工流产次数',
  `SPONTANEOUS_ABORTION` INTEGER(11) DEFAULT NULL COMMENT '自然流产次数',
  `INDUCED_LABOUR` INTEGER(11) DEFAULT NULL COMMENT '引产次数',
  `DEAT_FETUS` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '死胎',
  `STILLBIRTH` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '死产',
  `PUERPERAL_INFECTION` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '产褥感染',
  `LAST_DELIVERY_DATE` DATE DEFAULT NULL COMMENT '末次分娩日期',
  `CONTRACEPTIVE_RING` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '节育环',
  `CONTRACEPTIVE_RING_LOC` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '环位置',
  `CONTRACEPTIVE_DATE` DATE DEFAULT NULL COMMENT '结扎日期',
  `TAKEN_PILLS` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '口服药',
  `TOOLS` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '工具',
  `DISEASE_HISTORY` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '曾患妇科病',
  `OPERATION_HISTORY` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '妇科手术史',
  `BREAST_CANCER_FAMILY` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '乳癌家族史',
  `BLOOD` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '出血',
  `BREAST_CANCER` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '乳腺癌',
  `BREAST_CANCER_DATE` DATE DEFAULT NULL COMMENT '乳腺癌确诊时间',
  `BREAST_CANCER_TREAT` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '乳腺癌治疗',
  `UTERINE_NECK_CANCER` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '宫颈癌',
  `UTERINE_NECK_CANCER_DATE` DATE DEFAULT NULL COMMENT '宫颈癌确诊时间',
  `UTERINE_NECK_CANCER_TREAT` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '宫颈癌治疗',
  `OTHER_DES` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY USING BTREE (`HEALTH_FILE_ID`)
) ENGINE=InnoDB
AUTO_INCREMENT=3 CHARACTER SET 'utf8' COLLATE 'utf8_general_ci'
COMMENT='妇女档案'
;