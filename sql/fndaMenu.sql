-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('妇女档案', '2001', '1', '/jbda/fnda', 'C', '0', 'jbda:fnda:view', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '妇女档案菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('妇女档案查询', @parentId, '1',  '#',  'F', '0', 'jbda:fnda:list',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('妇女档案新增', @parentId, '2',  '#',  'F', '0', 'jbda:fnda:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('妇女档案修改', @parentId, '3',  '#',  'F', '0', 'jbda:fnda:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('妇女档案删除', @parentId, '4',  '#',  'F', '0', 'jbda:fnda:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('妇女档案导出', @parentId, '5',  '#',  'F', '0', 'jbda:fnda:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');
