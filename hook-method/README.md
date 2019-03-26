# Padrão Hook Method

Pontos positivos:
- Centraliza validações de NullPointerException da classe Carrinho
- Diminui a complexidade do código da classe principal, ApresentacaoCarrinho, pois as validações != null sao retiradas dela

Pontos negativos:
- De algum forma deixa escondido as validações de null.
