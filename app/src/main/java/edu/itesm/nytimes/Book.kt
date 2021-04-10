package edu.itesm.nytimes

data class Results(
    var results:Books?
)

data class Books(
 var books:List<Book>?
)

data class Book(val rank: Int,
                val title: String,
                val description: String,
                val book_image: String)

