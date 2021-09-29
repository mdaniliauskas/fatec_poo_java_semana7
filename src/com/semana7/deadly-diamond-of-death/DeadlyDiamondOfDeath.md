8. Faça uma pesquisa sobre o fenômeno conhecido como Deadly Diamond of Death e escreva cinco linhas sobre ele. Faça um diagrama de classes em que ele aparece.

Deadly Diamond of Death, ou herança múltipla, é um fenômeno que descreve a ambiguidade de quando duas classes filhas (B e C) herdam uma mesma superclass (A) e uma quarta classe (D) é subclasse simultaneamente de (B) e (C) (ver o diagrama abaixo).

![Exemplo do Diagrama do Deadly Diamond of Death](https://miro.medium.com/max/258/1*KMbFLqTeuO_TXXq11Tdojg.png)

No caso apresentado, se há um método na classe (A), tanto a classe (B) como (C) podem sobrescrevê-lo, mas a classe D não, pois afinal, há uma ambiguidade em definir qual versão do método (D) herda.

Para resolver essa situação na linguagem Java, recorre-se à criação de interfaces para lidar com o tema de múltiplas heranças. 