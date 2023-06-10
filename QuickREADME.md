# Quick Java

Revisão rápida de Java, baseada nos materiais da aula de Computação II do professor Felipe Duarte.

# P6 - Enums

Tipo de variável que consiste de um conjunto fixo de constantes.

```java
enum TamanhoCafe{GRANDE, GIGANTE, GIGANTESCO};
TamanhoCafe tc = TamanhoCafe.GRANDE;
```

Enums podem ser declaradas em uma classe separada ou como membro de uma classe, mas nunca em uma função.

Enums estendem implicitamente java.lang.Enum.

Enums não podem estender de outra classe.

## Declarando construtores de uma Enum

```java
enum TamanhoCafe{
    GRANDE(8), GIGANTE(10), GIGANTESCO(16);

    private int valor;

    TamanhoCafe(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }
}
```

# P7 - Operadores

## + 
- Adicionar duas primitivas
- Concatenação de strings

## &, |, ^
- Operação bit a bit.

## ==
- O operador observa o padrão de bits daquela variável

# P15 - Modificadores de Acesso

<table>
    <tr>
        <th>Modificador</th>
        <th>Classe</th>
        <th>Pacote</th>
        <th>Subclasse</th>
        <th>Mundo</th>
    </tr>
    <tr>
        <td>public</td>
        <td>Sim</td>
        <td>Sim</td>
        <td>Sim</td>
        <td>Sim</td>
    </tr>
    <tr>
        <td>protected</td>
        <td>Sim</td>
        <td>Sim</td>
        <td>Sim</td>
        <td>Não</td>
    </tr>
    <tr>
        <td>default</td>
        <td>Sim</td>
        <td>Sim</td>
        <td>Não</td>
        <td>Não</td>
    </tr>
    <tr>
        <td>private</td>
        <td>Sim</td>
        <td>Não</td>
        <td>Não</td>
        <td>Não</td>
    </tr> 
</table>

# T6 - Herança

## Classes abstratas 

São classes que não geram instâncias diretas.

São utilizadas para organizar e simplificar uma hierarquia de generalização. 

Propriedades comuns a diversas classes podem ser organizadas e definidas em uma classe abstrata.

A hierarquia de uma classe abstrata deve terminar em uma ou mais classes concretas.

```java
abstract class GraphicObject {
   // declare fields
   // declare nonabstract methods
   abstract void draw();
}

class Retangle extends GraphicObject {
    void draw(){
        ...
    }
}

class Circle extends GraphicObject {
    void draw(){
        ...
    }
}
```

# P11 - Garbage Collection

Solução automática de gerenciamento de memória. Seu objetivo é manter o máximo de espaço livre possível na Heap.

## Heap

É uma piscina de contantes e áreas de métodos.

É o lugar onde os objetos vivem e é a única parte da memória envolvida no processo de coleta de lixo.

## O Garbage Collector

Possui o propósito de encontrar e remover objetos inalcançáveis (com referências perdidas).

A Java Virtual Machine executará o Garbage Collector quando sentir que a memória está lenta.

## Objetos elegíveis ao Gargabe Collector

Um objeto é elegível ao GC quando nenhuma thread ativa pode acessá-lo.

Obs.: thread é uma forma de executar dois trechos de código paralelamente, sem que exista uma ordem exata para o inicio ou fim da execução delas.

## Tornando objetos elegíveis para a coleta

- Atribuir a uma variável de referência o valor null.
```java
String myString = "oi";
myString = null;
```

No caso abaixo, atribui-se o valor null a variável, mas como existe outra variável referenciando o objeto "oi", então o objeto não é elegível para a coleta.
```java
String myString = "oi";
String mySecondString = myString;
myString = null;
```

## Forçando a coleta de lixo

Não é possível forçar a coleta de lixo. O java provê métodos que permite requisitar o gc(), mas isso não significa que ele será realmente executado.

## O método finalize() da Classe Object

é um método que força um comportamente a ser realizado antes que o objeto seja destruído.

Não é recomendado contar com esse objeto nem colocar código essencial nele.

# Polimorfismo

Quando duas classes filhas da mesma classe abstrata são capazes de invocar um método de mesmo nome e parâmetros, mas que possuíra comportamentos diferentes, especializados para cada classe derivada.

Em Java o polimorfismo se manifesta somente em chamada de métodos.