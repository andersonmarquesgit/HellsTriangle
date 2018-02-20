# HellsTriangle

O algoritmo tem o objetivo de calcular o máximo total do topo a base de um triângulo.
Por exemplo:
<pre><code>
   6<br />
  3 5<br />
 9 7 1<br />
4 6 8 4<br />
</code></pre>

representado pela entrada: [[6],[3,5],[9,7,1],[4,6,8,4]]
tem o máximo total igual a <strong>26</strong>.
Ou seja, 6 + 5 + 7 + 8 = 26

Perceba que ele utiliza o critério do maior elemento dos dois elementos mais próximos. Nesse exemplo, os dois elementos próximos de 6 são 3 e 5, sendo o maior igual a 5. Os dois elementos mais próximos de 5 são 7 e 1, sendo o maior igual 7. E por último, os dois elementos mais próximos de 7 são 6 e 8, sendo o maior igual a 8. (6 + 5 + 7 + 8), ou seja, não se trata do maior elemento da linha, mas o maior elementos dos dois elementos mais próximos do elemento selecionado da linha anterior, do topo a base do triângulo.

Estou utilizando entrada e saída padrão, então basta executar, informar o array no formato [[6],[3,5],[9,7,1],[4,6,8,4]], e na linha seguinte é exibida a saída com o resultado do cálculo do máximo total.
