基于MQTT的android推送服务
===
搭建基于MQTT的推送服务需要：

1. App Service（调用Push API发送数据给服务器）

2. Push API（接收App Service发送的数据,并将数据推送给RSMB）

3. RSMB Service（用于实现推送服务，将数据推送给客户端）

4. App Client（用于接收RSMB推送的数据）

推送原理图如下：

![这是一个推送原理图片](http://img.my.csdn.net/uploads/201208/23/1345699153_6792.png)

（感谢 http://blog.csdn.net/shagoo/article/details/7899466 提供图片）

App Service和App Client可以是同一个应用！（即发送数据，也可以接收数据）

详细
===

API服务器
TestPush: 基于MQTT的android客户端
API服务器：php开发
