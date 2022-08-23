# HoyoAPI
> <em>An API access to Hoyo Data</em>

This API is only access to user who have public their data on Hoyolab or user you provide token

## Usage
Setup your cookie
```java
// Put your ltoken and ltuid
String ltoken = "";
String ltuid = "";
String cookie_token = "";
String uid = "";
HoyoAPI.inst().setCookie(ltoken, ltuid, cookie_token);
```

## Access to API HoyoLab
```java
HoyoLabAPI api = HoyoAPI.inst().hoyolab();
```

Search something on HoyoLab
```java
String keyword = "search";
HoyoGame hoyoGame = HoyoGame.HOYOLAB;
HoyoSearch search = api.search(keyword, hoyoGame);
```

## Access to API Genshin
```java
GenshinImpactAPI api = HoyoAPI.inst().genshin();
```

Now you can get user data by put your uid
```java
Player player = api.getPlayer(uid);
```

## How to get ltoken, ltuid and cookie token
- Login into Hoyolab via browser
- Press F12 to open Developer Tools
- Choose "Application" tab
- Select "Cookies" then select Hoyolab domain
- On the right page, copy ltuid, ltoken and cookie token value

## Note Genshin
Daily Note, Traveler Diary, Daily Reward and Spiral Abyss can only access to you data, can not access to other user. If you trying to get other user data, it will return your data.
