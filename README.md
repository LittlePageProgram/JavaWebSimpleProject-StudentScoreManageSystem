# JavaWebSimpleProject-StudentScoreManageSystem
A simple web project. 

# 学生成绩管理系统
## IDE
IntelJ IDEA
Hbuilder
## language
Chinese
## Function
一个简易的crud管理系统
## Technology
### 前端部分
框架使用了mdui
图片自己用photoshop进行裁剪设计，图片来源：百度图片
### 后端部分
dao层使用hibernate框架
HibernateUtils可以复用，传入参数可以对任意一个Hibernate参数进行增删改查，
变更entity中的实体，执行void reloadTables()可以进行数据库表的更新，数据库表
的账户密码在src/hibernate.cfg.xml进行设置<br/>
HibernateUtilsPool主要实例化实体，减少每次进行增删改查的时间
### filter层
CodingFilter作用是将除资源文件以外的其他文件全部进行request和response编码的过滤
LoginFilter主要用于登录权限的过滤
### service层
桥接dao层和servlet层，主要是进行封装主要的service方法
### servlet层
用于与web层和service层的简单连接，处理jsp的简单跳转和session的释放与存储
## Design
数据库表的设计没有使用太复杂的设计，由于hibernate的逻辑性，使用了0物理外键，
在设计时采用了简单的学生老师分数的管理系统作为web初步开发和hibernate简单使用的例子
## Author want to say
这次主要是想开发一个web应用来进行练手，分层按照传统的web技术进行分层，然后进行下一阶段的过渡
自己应该是对逻辑处理的后端开发有了清晰的认知，也大概知道了这一方向接下来的学习目标和前进的方向
所以，继续就要有
## Annotation
这并不是一个完整的实战例子，仅仅完成了管理员中学生表的增删改查，另外其他的功能以及权限
相当于重复工作，所以有待完善，不过架构体系完整。仅供参考
