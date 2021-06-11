# Carpet-DGBCraft

# 特性

## 假人名字前缀限制 (fakePlayerNamePrefixLimit)
阻止玩家使用`/player`召唤未包含指定前缀的假人  
使用指定的前缀有利于服务器管理假人玩家
* 类型: `String`
* 默认值: `#none`
* 建议值: `#none`, `bot_`, `bot.`
* 分类: `FAKE`

## 种子命令权限 (permissionLevelSeed)
修改`/seed`命令的权限等级  
这个规则不会影响单人世界
* 类型: `String`
* 默认值: `2`
* 有效值: `0`, `1`, `2`, `3`, `4`
* 分类: `COMMAND`

## 睡觉忽略假人 (sleepIgnoreFaker)
通过睡觉跳过黑夜时，忽略假人玩家
* 类型: `boolean`
* 默认值: `false`
* 有效值: `true`, `false`
* 分类: `SURVIVAL`, `FAKE`

# 开发
当前主要开发分支: **1.16.x**
当前维护的分支:  
* 1.16.x 用于 Minecraft 1.16.2 到 1.16.5
