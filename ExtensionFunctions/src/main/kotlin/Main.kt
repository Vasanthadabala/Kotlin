class LuxuryCar {
    var SpeakerCount = 4
}
fun LuxuryCar.addMusicSpeaker(speakersToAdd:Int)
{
    this.SpeakerCount=SpeakerCount+speakersToAdd
}
fun main()
{
    val luxuryCar=LuxuryCar()
    print("Speakers Before Modification: ")
    println(luxuryCar.SpeakerCount)
    luxuryCar.addMusicSpeaker(2)
    print("Speakers After  Modification: ")
    println(luxuryCar.SpeakerCount)
}