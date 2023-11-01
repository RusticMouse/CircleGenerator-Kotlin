object CircleGenerator {
    @JvmStatic
    fun drawCircle(radius: Int, symbol: String?): String? {
        for (i in -radius..radius) {
            for (j in -radius..radius) {
                if (i * i + j * j <= radius * radius) {
                    print(symbol)
                } else {
                    print(" ")
                }
            }
            println()
        }
        return symbol
    }

    @JvmStatic
    fun main(args: Array<String>) {
        drawCircle(100, ".")
    }
}
