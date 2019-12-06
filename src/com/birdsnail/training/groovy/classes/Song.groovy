package com.birdsnail.training.groovy.classes

class Song {
    def name
    def artist
    def genre

    def getGenre() {
        genre?.toUpperCase()
    }

    @Override
    String toString() {
        "${name}, ${artist}，${getGenre()}"
    }

    @SuppressWarnings("GroovyAssignabilityCheck")
    static void main(args) {
        def song = new Song(name: "yanghaudong", artist: "haha")
        println song.name
        song["name"] = "lisi"
        println song.getName()
        println(song)
        println(song.getGenre())
    }
}
