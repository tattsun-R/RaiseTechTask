# 概要
名前とタイプを含んだポケモンのテーブルを作成し、テーブルからレコードを全件取得するAPIとクエリ文字列を指定して検索するAPIを実装しました。


# 動作確認

## レコードを全件取得するAPI
ステータスコード200を確認しました。
`curl --location 'http://localhost:8080/pokemon_index'`
![image](https://github.com/tattsun-R/RaiseTechTask/assets/138351540/4a90efdd-9eef-4404-800b-069f689f7e59)


## クエリ文字列で名前を指定して検索するAPI
ステータスコード200を確認しました。画像では、名前が"ヒ"で始まるポケモンのレコードを取得しています。
`curl --location 'http://localhost:8080/pokemon_index/names?startsWith=%E3%83%92'`
![image](https://github.com/tattsun-R/RaiseTechTask/assets/138351540/6e3ffeea-803b-4be5-a2eb-2c459f02fc3a)


## クエリ文字列でタイプを指定して検索するAPI
ステータスコード200を確認しました。画像では、タイプが"みず"のポケモンのレコードを取得しています。
`curl --location 'http://localhost:8080/pokemon_index/types?type=%E3%81%BF%E3%81%9A'`
![image](https://github.com/tattsun-R/RaiseTechTask/assets/138351540/5e4d2caf-9959-41da-9a80-3d7f996d1686)
