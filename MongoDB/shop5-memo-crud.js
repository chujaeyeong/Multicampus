db.memo.find({}) 
// select * from memo 

use shop5 
db.memo.find({})

db.createUser({
    user : "winner",
    pwd : "1234",
    roles : ["readWrite", "dbAdmin"]
})

use shop5

show databases

db.createCollection("member2")

show collections

db.member2.insertOne({
    "id" : "hong",
    "pw" : "1234",
    "name" : "honggg",
    "tel" : "010"
})

db.member2.find({})

db.member2.insertMany([
    {
        "id" : "hong2",
        "pw" : "1234",
        "name" : "honggg",
        "tel" : "010"
    },
    {
        "id" : "hong3",
        "pw" : "1234",
        "name" : "honggg",
        "tel" : "010"
    }
])

db.member2.drop()

show collections

db.dropDatabase()

show dbs

