基于MQTT的android推送服务
===
搭建基于MQTT的推送服务需要：

1. App Service（调用Push API发送数据给服务器）

2. Push Service（接收App Service发送的数据,并将数据推送给RSMB）

3. RSMB Service（用于实现推送服务，将数据推送给客户端）

4. App Client（用于接收RSMB推送的数据）

推送原理图如下：

![这是一个推送原理图片](http://img.my.csdn.net/uploads/201208/23/1345699153_6792.png)

（感谢 http://blog.csdn.net/shagoo/article/details/7899466 提供图片）

App Service和App Client可以是同一个应用！（即发送数据，也可以接收数据）

详细
===
RSMB Service下载地址：[RSMB下载](https://www.ibm.com/developerworks/community/groups/service/html/communityview?communityUuid=d5bedadd-e46f-4c97-af89-22d65ffee070)
 [RSMB服务搭建说明](http://blog.sina.com.cn/s/blog_6c762bb30101bkfp.html)

Push Service下载地址：[基于php的PushService](https://github.com/bluerhinos/phpMQTT)

基于Android的App Client：代码如上TestPush工程

基于java的App Service/Client实例：[ia92.zip](http://www-01.ibm.com/support/docview.wss?uid=swg24006006)
