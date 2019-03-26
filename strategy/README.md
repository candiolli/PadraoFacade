# Padrão Strategy

Foram criados 3 tipos de impostos, onde cada um tem o seu calculo especifico. A classe que CalculadoraImposto.java que efetua os calculos desconhece as implementações, somente invoca o metodo pois conhece seu contrato. Então para ela, basta receber uma classe que implementa Imposto.java e um valor a ser calculado.

Exemplos de implementações:
- Calculo de impostos, implementado

Pontos positivos:
- Isola algoritmos diferentes
- Permite execução de implementações em momentos diferentes, podendo ser trocado em momento de execução
- Permite adicionar implementações sem alterar o que ja esta pronto
- Diminui acomplamento de código
- Diminui condicionais no código
- Diminui o tamanho da classe principal

Pontos negativos:
- Aumenta a quantidade de classes no projeto, dificultando o gerenciamento
- Aumenta um pouco a complexidade para criar novas implementações, pois precisa ser criada e configurada
