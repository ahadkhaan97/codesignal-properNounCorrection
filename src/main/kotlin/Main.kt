fun main() {
    print(solution("pARiS"))
}

fun solution(noun: String): String {
    return noun[0].titlecase() + noun.substring(1, noun.length).lowercase()
}
