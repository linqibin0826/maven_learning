CREATE DATABASE db_imperial_court;
USE db_imperial_court;
CREATE TABLE t_emp
(
    emp_id         INT PRIMARY KEY auto_increment,
    emp_name       CHAR(100) NOT NULL,
    emp_position   CHAR(100) NOT NULL,
    login_account  CHAR(100) NOT NULL UNIQUE,
    login_password CHAR(100) NOT NULL
);
INSERT INTO t_emp (emp_name, emp_position, login_account, login_password)
VALUES ('爱新觉罗·玄烨', 'emperor', 'xiaoxuanzi1654', '25325C896624D444B2E241807DCAC98B'),# 16540504
       ('纳兰明珠', 'minister', 'brightball1635', 'A580D0EF93C22036C859E194C14CB777'),# 16351119
       ('赫舍里·索额图', 'minister', 'tutu1636', 'E40FD7D49B8B7EF46F47407D583C3538');# 17030921


CREATE TABLE t_memorials
(
    memorials_id          INT PRIMARY KEY auto_increment,
    memorials_title       CHAR(100)     NOT NULL,
    memorials_content     VARCHAR(5000) NOT NULL,
    memorials_emp         INT           NOT NULL,
    memorials_create_time CHAR(100),
    feedback_time         CHAR(100),
    feedback_content      VARCHAR(1000),
    memorials_status      INT           NOT NULL
);
INSERT INTO t_memorials (memorials_title, memorials_content, memorials_emp, memorials_create_time, feedback_time,
                         feedback_content, memorials_status)
VALUES ('浙江巡抚奏钱塘堤决口疏', '皇上啊，不好啦！钱塘江发大水啦！堤坝冲毁啦！您看这咋弄
	啊！', 2, '1690-05-07', NULL, NULL, 0),
       ('左都御史参鳌拜圈地疏', '皇上啊，鳌拜这厮不是东西呀！占老百姓的地哇！还打人呀！您
	看咋弄啊！', 3, '1690-04-14', NULL, NULL, 0),
       ('都察院劾吴三桂不臣疏', '皇上啊，不得了啦！吴三桂那孙子想造反呀！', 2, '1693-
	11-18', NULL, NULL, 0),
       ('兵部奏准噶尔犯境疏', '皇上啊，不得了啦！葛尔丹要打过来了呀！', 3, '1693-11-
	18', NULL, NULL, 0),
       ('朝鲜使臣朝拜事宜呈皇上御览', '皇上啊！朝鲜国的人要来啦！咱们请他们吃猪肉炖粉条子
	吧！', 2, '1680-06-11', NULL, NULL, 0),
       ('英吉利炮舰购买事宜疏', '皇上啊！英国的小船船咱们买多少啊？', 3, '1680-06-
	12', NULL, NULL, 0),
       ('劾杭州织造贪墨疏', '皇上啊！杭州织造有问题啊！', 2, '1680-06-13', NULL, NULL, 0),
       ('禀畅春园落成疏', '皇上啊！畅春园修好了哇！您啥时候过来看看呀！', 3, '1680-06-
	14', NULL, NULL, 0),
       ('请旨木兰秋狝疏', '皇上啊！秋天到啦，又该打猎啦！', 2, '1680-06-15', NULL, NULL, 0),
       ('核准西北军饷银两疏', '皇上啊！您看看这钱数算的对不对呀！', 3, '1680-06-16', NULL, NULL, 0),
       ('请旨裁撤三藩疏', '皇上啊！咱们不裁撤三藩就芭比Q了哇！', 2, '1680-06-17', NULL, NULL, 0),
       ('蒙古王公进京朝拜疏', '皇上啊！蒙古王公要来啦！咱们请他们吃猪肉炖粉条子吧！', 3, '1680-06-18', NULL, NULL, 0),
       ('礼部请旨九阿哥赐名疏', '皇上啊！您看九阿哥该叫什么名字呀？', 2, '1680-06-
	19', NULL, NULL, 0),
       ('户部尚书请旨告老还乡疏', '皇上啊！臣想回家养老啦！您看看啥时候给臣把俸禄结一下
	啊！', 3, '1680-06-20', NULL, NULL, 0),
       ('查江宁织造贪墨疏', '皇上啊！江宁织造有问题啊！', 2, '1680-06-21', NULL, NULL, 0);