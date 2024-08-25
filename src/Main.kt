import java.text.DecimalFormat

fun main() {

    var nomeProduto: String = "Prego"
    var precoUnitario: Double = 12.58
    var quantidadeProduto: Int = 100
    var taxaImposto: Double = 40.0          //porcentagem 40%
    var margemLucro: Double = 47.0          //porcentagem 50%


    val money = DecimalFormat("R$ #,###.00") // formatação modelo dinheiro


    fun valorTotal
                (a: Double = precoUnitario , b: Int = quantidadeProduto): Double {
        return a * b

        var format = money.format(valorTotal())
    }


    fun valorImposto
                (a: Double = valorTotal(), b: Double = taxaImposto): Double {
        return a * (b/100)

        var format = money.format(valorImposto())
    }


    fun valorTotalComImposto
                (a: Double = valorTotal(), b: Double = valorImposto()): Double {
        return a + b

        var format = money.format(valorTotalComImposto())
    }

    fun valorComImpostoIndividual
                (a: Double = valorTotalComImposto(), b: Int = quantidadeProduto): Double {
        return a / b

        var format = money.format(valorComImpostoIndividual())
    }


    // lucro por produto
    fun valorDaMargemDeLucroTotal
                (a: Double = valorTotal(), b: Double = margemLucro): Double {
        return a * (b/100)

        var format = money.format(valorDaMargemDeLucroTotal())
    }


    fun valorDaMargemDeLucroIndividual
                (a: Double = valorDaMargemDeLucroTotal(), b: Int = quantidadeProduto): Double {
        return a / b

        var format = money.format(valorDaMargemDeLucroIndividual())
    }


    fun precoDeVendaTotalFinal
                (a: Double = valorTotalComImposto(), b: Double = valorDaMargemDeLucroTotal()): Double {
        return a + b

        var format = money.format(precoDeVendaTotalFinal())
    }


    fun precoDeVendaFinalIndividual
                (a: Double = precoDeVendaTotalFinal(), b: Int = quantidadeProduto): Double {
        return a / b

        var format = money.format(precoDeVendaFinalIndividual())
    }

    println("Nome Produto: $nomeProduto")
    println("Valor com Imposto: ${money.format(valorComImpostoIndividual())}")
    println("Preço de Venda: ${money.format(precoDeVendaFinalIndividual())}")

    println("")

    println("Valor de compra Unitario R$: $precoUnitario")
    println("Quantidade: $quantidadeProduto")
    println("Taxa Imposto: $taxaImposto %")
    println("Margem de Lucro: $margemLucro %")
    println("")

    println("Valor Total: ${money.format(valorTotal())}")
    println("Valor Imposto: ${money.format(valorImposto())}")
    println("Valor Total com Imposto: ${money.format(valorTotalComImposto())}")
    println("Valor Imposto Individual: ${money.format(valorComImpostoIndividual())}")
    println("Valor da Margem do Lucro Total: ${money.format(valorDaMargemDeLucroTotal())}")
    println("Valor da Margem do Lucro Individual: ${money.format(valorDaMargemDeLucroIndividual())}")
    println("Preço de Venda Total Final: ${money.format(precoDeVendaTotalFinal())}")
    println("Preço de Venda Final Individual: ${money.format(precoDeVendaFinalIndividual())}")



}