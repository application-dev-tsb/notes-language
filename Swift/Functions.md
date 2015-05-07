# Functions

"Functions are self-contained chunks of code that perform a specific task. You give a function a name that identifies what it does, and this name is used to “call” the function to perform its task when needed.”

Excerpt From: Apple Inc. “The Swift Programming Language.” iBooks. https://itun.es/ph/jEUH0.l

```swift

//complete function:
func countAPersonsResidence(person:Person, residence: Residence?) -> Int {
    return person.residence!.numberOfRooms;
}
```