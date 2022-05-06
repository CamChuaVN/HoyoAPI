# GenshinImpactAPI
> <em>An API access to user data for Genshin Impact</em>

This API is only access to user who have public their data on Hoyolab or user you provide token

## Usage
Setup your cookie
```java
// Put your ltoken and ltuid
String ltoken = "";
String ltuid = "";
GenshinImpact.inst().setCookie(ltoken, ltuid);
```

Access to API
```java
GenshinImpactAPI api = GenshinImpact.getAPI();
```

Now you can get user data by put your uid
```java
// Change false -> true to access CN data
Player player = api.getPlayer("put your uid here", false);
```

## How to get ltoken and ltuid
- Login into Hoyolab via browser
- Press F12 to open Developer Tools
- Choose "Application" tab
- Select "Cookies" then select Hoyolab domain
- On the right page, copy ltuid and ltoken value
