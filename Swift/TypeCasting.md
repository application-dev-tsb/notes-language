# Type Casting
Type casting is a way to check the type of an instance, and/or to treat that instance as if it is a different superclass or subclass from somewhere else in its own class hierarchy
```swift
class MediaItem {
    
    var name: String
    
    init(name: String) {
        self.name = name
    }
}

class Movie: MediaItem {
    
    var director: String
    
    init(name: String, director: String) {
        self.director = director
        super.init(name: name)
    }
}

class Song: MediaItem {
    
    var artist: String
    
    init(name: String, artist: String) {
        self.artist = artist
        super.init(name: name)
    }
}

var song: MediaItem = Song(name: "Happy Bday", artist: "Unknown")

//use "is" to check if class is a Song
if song is Song {
    println("This is a song")
}

//casting
if let s = song as? Song {
    println("The song is by \(s.artist)")
}
```
