#说明
+ 本文档所有接口应答均为如下格式：

  

  成功应答：
```json
{
    "success": 0,
    "data": 6,
    "message": null
}
```


  失败应答：

```json
{
    "success": 1,
    "data": null,
    "message": "不支持手机号登录"
}
```
+ 接口参数说明

参数名称|类型|说明
:---:|:---:|:---:
success|int|业务执行状态 0:成功;1:失败
data|Object|业务执行结果 参照具体应答的参数说明
message|String|业务执行失败时的错误信息

+ 注意
	1.本接口文档的所有接口均为Http请求格式，在使用接口时，应当先判断http返回码
	3.仅当http返回码为200且success=0时，说明业务处理成功。此时应关注data字段返回的业务数据
	4.当http返回码为其他，或http返回码200但success=1时，说明业务处理失败。此时应关注message字段给出的错误提示
##1.登录注册
### 1.1 用户名登录
+ 接口名称：用户名登录
+ 接口地址：/logonWithUserName
+ 请求方式：POST
+ 请求

参数名称|类型|说明|可否为空
:---:|:---:|:---:|:---:
username|String|用户名|notNull
password|String|用户密码|notNull

+ 应答

参数|类型|说明
:---:|:---:|:---:
data|int|用户ID

+ 示例
```json
{
    "data": 6
}
```
### 1.2 手机号登录
+ 接口名称：手机号登录
+ 接口地址：/logonWithPhone
+ 请求方式：POST
+ 请求

参数名称|类型|说明|可否为空
:---:|:---:|:---:|:---:
phone|String|手机号|notNull
password|String|用户密码|notNull

+ 应答

参数|类型|说明
:---:|:---:|:---:
data|int|用户ID

+ 示例
```json
{
    "data": 6
}
```
### 1.3 邮箱登录
+ 接口名称：邮箱登录
+ 接口地址：/logonWithEmail
+ 请求方式：POST
+ 请求

参数名称|类型|说明|可否为空
:---:|:---:|:---:|:---:
email|String|邮箱|notNull
password|String|用户密码|notNull

+ 应答

参数|类型|说明
:---:|:---:|:---:
data|int|用户ID

+ 示例
```json
{
    "data": 6
}
```
### 1.4 注册
+ 接口名称：邮箱登录
+ 接口地址：/register
+ 请求方式：POST
+ 请求(userName/phone/email不可同时为空)

参数名称|类型|说明|可否为空
:---:|:---:|:---:|:---:
userName|String|用户名|null
phone|String|手机号|null
email|String|邮箱|null
password|String|用户密码|notNull

+ 应答

参数|类型|说明
:---:|:---:|:---:
data|int|用户ID

+ 示例
```json
{
    "data": 8
}
```
