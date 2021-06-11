# Carpet-DGBCraft

[>>中文版<<](README_zhCN.md)

# Features

## fakePlayerNamePrefixLimit
Prevent players from using `/player` to summon fake player whose names don't contain the prefix
Using the specified prefix is good for the server to manage fake players
* Type: `String`
* Default value: `#none`
* Suggested options: `#none`, `bot_`, `bot.`
* Categories: `FAKE`

## permissionLevelSeed
Modify permission level of `/seed` command  
This rule does not affect the single player world  
* Type: `String`
* Default value: `2`
* Required options: `0`, `1`, `2`, `3`, `4`
* Categories: `COMMAND`

## sleepIgnoreFaker
Ignore fake players when skipping the night by sleeping  
* Type: `boolean`
* Default value: `false`
* Required options: `true`, `false`
* Categories: `SURVIVAL`, `FAKE`

# Development
Current main development branch: **1.17.x**  
Current maintaining branches:
* 1.17.x for Minecraft 1.17
* 1.16.x for Minecraft 1.16.2 to 1.16.5
