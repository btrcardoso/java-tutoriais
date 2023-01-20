# <center> [**"The Java™ Tutorials" em Português**](https://docs.oracle.com/javase/tutorial/index.html) </center>

Este documento é uma base de estudos em Português para a Documentação ["The Java™ Tutorials"](https://docs.oracle.com/javase/tutorial/index.html) disponibilizada pela Oracle. A organização deste documento segue o mesmo padrão da organização da documentação da Oracle. Você pode conferir a fonte de cada tópico clicando no título correspondente.

# <center> [Começando](https://docs.oracle.com/javase/tutorial/getStarted/index.html) </center>

## <center> [O fenômeno tecnológico Java](https://docs.oracle.com/javase/tutorial/getStarted/intro/index.html) </center>

### Compilador 

A IDE chama o Javac (compilador Java) que compilará o arquivo .java em um arquivo .class. O arquivo class possui os bytecodes que são compreendidos pela Java Virtual Machine. Então a JavaVM transformará o arquivo .class nos bits compreendidos pela máquina.

![](compilador.png)

### Plataforma Java

Plataforma é o hardware ou software onde uma aplicação roda. A plataforma Java roda a nível de software e possui dois componentes:
- Java Virtual Machine (Java VM): transforma o arquivo .class bytecode em arquivos para serem entendidos pela máquina.
- Java Application Programming Interface (API): provê as principais classes usadas em Java. Ex: System.

![](plataforma-java.png)

## <center> [Aplicação "Hello World"](https://docs.oracle.com/javase/tutorial/getStarted/cupojava/index.html) </center>

## Organização do Projeto Java

Ao criar uma aplicação Java, os arquivos ficarão na pasta src. 
Os arquivos .class com os bytecodes de cada arquivo .java ficarão na pasta bin.

### [Questões e Exercícios](https://docs.oracle.com/javase/tutorial/getStarted/QandE/questions.html)

Question 1: When you compile a program written in the Java programming language, the compiler converts the human-readable source file into platform-independent code that a Java Virtual Machine can understand. What is this platform-independent code called?
```
BinaryCode, it is on a .class file
```

Question 2: Which of the following is not a valid comment:

a. /** comment */
b. /* comment */
c. /* comment
d. // comment
```
c
```

Question 3: What is the first thing you should check if you see the following error at runtime:

Exception in thread "main" java.lang.NoClassDefFoundError:
HelloWorldApp.java.
```
The classpath. The class was not found.
```

Question 4: What is the correct signature of the main method?
```
public static void main(String[] args){}
or
public static void main(String... args){}
```

Question 5: When declaring the main method, which modifier must come first, public or static?
```
Both.
```

Question 6: What parameters does the main method define?
```
String parameters.
```

Exercises
Exercise 1: Change the HelloWorldApp.java program so that it displays Hola Mundo! instead of Hello World!.

Exercise 2: You can find a slightly modified version of HelloWorldApp here: [HelloWorldApp2.java](https://docs.oracle.com/javase/tutorial/getStarted/QandE/HelloWorldApp2.java)

The program has an error. Fix the error so that the program successfully compiles and runs. What was the error?
```
Miss a "
```

[Answers](https://docs.oracle.com/javase/tutorial/getStarted/QandE/answers.html)

# <center> [Aprendendo a Linguagem Java](https://docs.oracle.com/javase/tutorial/java/index.html) </center>

## <center> [Conceitos de Programação Orientada a Objetos](https://docs.oracle.com/javase/tutorial/java/concepts/index.html) </center>

## O que é Herança

Uma classe herda de outra quando pega para si os atributos e os métodos não privados da superclasse.Classes Java podem ter vários subclasses, mas apenas uma superclasse:
~~~Java
class MountainBike extends Bicycle{}
~~~

## O que é uma Interface

A interface é um grupo de métodos com conteúdos vazios:

```java
interface Bicycle {
	
	void changeCadence(int newValue);
	
	void changeGear(int newValue);
	
	void speedUp(int increment);
	
	void applyBrakes(int decrement);
	
}
```
A classe que implementa a interface é:
```java
class ACMEBicycle implements Bicycle{

	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	public void main(String[] args) {
		changeCadence(2);
		printStates();
	}
	
	public void changeCadence(int newValue) {
		cadence = newValue;
	}
	
	public void changeGear(int newValue) {
		gear = newValue;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public void applyBrakes(int decrement) {
		speed -= decrement;
	}
	
	public void printStates() {
		System.out.println(
				"candece: " +  cadence +
				"\nspeed: " + speed +
				"\ngear: " + gear
				);
	}
	
}
```

## O que é um pacote

Organizam as classes e as interfaces.

A Plataforma Java provê uma grande biblioteca de classes (conjunto de pacotes). Esta biblioteca é a API do Java. Seus pacotes representam as tarefas mais utilizadas. Existem milhares de classes que podem ser utilizadas desta biblioteca e isto permite que o programador foque apenas na sua aplicação sem se preocupar com infraestrutura.

Acesse a [Especificação da Java Plataforma API](https://docs.oracle.com/javase/8/docs/api/index.html) que lista todos os pacotes, classes, interfaces, campos e métodos que a plataforma oferece.

## [Questões e exercícios: Conceitos de Orientação a Objeto](https://docs.oracle.com/javase/tutorial/java/concepts/QandE/questions.html)

Questions
1. Real-world objects contain _STATES_ and _BEHAVIOR_.
2. A software object's state is stored in _FIELDS_.
3. A software object's behavior is exposed through _METHODS_.
4. Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data *ENCAPSULATION*.
5. A blueprint for a software object is called a *CLASS*.
6. Common behavior can be defined in a _SUPERCLASS_ and inherited into a _SUBCLASS_ using the _EXTENDS_ keyword.
7. A collection of methods with no implementation is called an _INTERFACE_.
8. A namespace that organizes classes and interfaces by functionality is called a _PACKAGE_.
9. The term API stands for _APLICATION PROGRAM INTERFACE_.

Exercises
1. Create new classes for each real-world object that you observed at the beginning of this trail. Refer to the Bicycle class if you forget the required syntax.
2. For each new class that you've created above, create an interface that defines its behavior, then require your class to implement it. Omit one or two methods and try compiling. What does the error look like?

[Projeto WhatIsAnInterface](Workspace/LearningTheJavaLanguage/Object-OrientedProgrammingConcepts/WhatIsAnInterface)

## <center> [O básico da Linguagem](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html) <center>

## Variáveis 

- **Variáveis de Instância (Non-static fields)**: quando objetos armazenam suas próprias variáveis/fields, independente das variáveis de outros objetos da mesma classe.
- **Variáveis de Classe (Static Fields)**: quando há uma variável/field estática em uma classe, todas as instâncias desta classe (ou seja, objetos) compartilham a mesma cópia desta variável.
- **Variáveis locais**: variáveis/fields visíveis apenas dentro dos métodos.
- **Parâmetros**: variáveis (não fields) que são parâmetros para os métodos.

### Tipos de dados primitivos

Java suporta oito tipos primitivos de dados:

- **byte**: inteiro de complemento de dois de 8 bits. Vai do -128 até o 127.
- **short**: inteiro de complemento de dois de 16 bits. Vai do -32768 até o 32767. 
- **int**: inteiro de complemento de dois de 32 bits. Vai de -2<sup>31</sup> até 2<sup>31</sup>-1
- **long**: inteiro de complemento de dois de 64 bits.
- **float**: número de ponto flutuante de 32 bits. 
- **double**: número de ponto flutuante de 64 bits.
- **boolean**: true e false.
- **char**: caractere de 16 bits. Tem valor mínimo de '\u0000' (0) e valor máximo '\uffff' (65535).

Além dos 8 tipos de dados primitivos, o Java também dá suporte para string pela Classe java.lang.String. Objeto String são imutáveis. Uma vez que se cria um objeto do tipo String, ele não pode ser alterado ([Testei](Workspace/LearningTheJavaLanguage/LanguageBasics), e parece que isso é mentira).

Obs: byte e short geralmente são utilizados quando economia de memória for importante na aplicação.

- Valores default:
<table border="1" summary="Default values for primitive types">
<tbody><tr>
<th id="h1" align="left"><strong>Data Type</strong></th>
<th id="h2" align="left"><strong>Default Value (for fields)</strong></th>
</tr>
<tr>
<td headers="h1">byte</td>
<td headers="h2">0</td>
</tr>
<tr>
<td headers="h1">short</td>
<td headers="h2">0</td>
</tr>
<tr>
<td headers="h1">int</td>
<td headers="h2">0</td>
</tr>
<tr>
<td headers="h1">long</td>
<td headers="h2">0L</td>
</tr>
<tr>
<td headers="h1">float</td>
<td headers="h2">0.0f</td>
</tr>
<tr>
<td headers="h1">double</td>
<td headers="h2">0.0d</td>
</tr>
<tr>
<td headers="h1">char</td>
<td headers="h2">'\u0000'</td>
</tr>
<tr>
<td headers="h1">String (or any object) &nbsp;</td>
<td headers="h2">null</td>
</tr>
<tr>
<td headers="h1">boolean</td>
<td headers="h2">false</td>
</tr>
</tbody></table>

#### **Literais inteiros em diferentes bases**

Para representar inteiros binários, utilize 0b.
```java
int binVal = 0b11010; // Número 26 em binário: 11010
```
Para representar inteiros hexadecimais, utilize 0x.
```java
int hexVal = 0x1a; // Número 26 em hexadecimal: 1a
```

#### **Literais em ponto flutuante**

Você pode utilizar a notação científica "e" para representar literais em ponto flutuante:
```java
double d1 = 123.4;
double d2 = 1.234e2; // Mesmo valor de d1, mas com notação científica
```

Para escrever um número do tipo float, é necessário colocar F/f no fim.
```java
float f1 = 1.1;  // Type mismatch: cannot convert from double to float
float f2 = 1.1F; // Correct
```

#### **Unicode scape**

Você pode utilizar Unicode scapes para representar símbolos de acentuação:
```java
String sisenor = "S\u00ED Se\u00F1or"; // Sí Señor
```

#### **Usando underscore em caracteres e literais numéricos**

O underscore pode ser utilizado para separar numerais:
```java
long creditCardNumber = 1234_5678_9012_3456L; //1234567890123456
```

### Arrays

Arrays são containers de tamanho fixo que contém objetos do mesmo tipo.
```java
int[] anArray;          // declara o array de inteiros
anArray = new int[10]   // aloca 10 espaços de memória para inteiros

int[] array2 = {1, 2, 3}; //shortcut syntax
```

#### **Copiando Arrays**

Para copiar arrays, utiliza-se o método **arraycopy()** da classe System. Ele possui o seguinte formato:
```java
public static void arraycopy(
	Object src,   // array to copy from
	int srcPos,   // starting position
	Object dest,  // array to copy to
	int destPso,  // starting position
	int length    // number of array elements to copy
)
```

O exemplo abaixo demonstra a utilização do método arraycopy:
```java
String[] copyFrom = {
	"Affogato0", "Americano1", "Cappuccino2", "Corretto3", "Cortado4", "Doppio5", "Espresso6", "Frappucino7", "Freddo8", "Lungo9",  "Macchiato10", "Marocchino11", "Ristretto12"
};

String[] copyTo = new String[7];

System.arraycopy(copyFrom, 2, copyTo, 0, 7);

for(String coffe : copyTo) {
	System.out.println(coffe + " ");
}
```

A saída será:
```
Cappuccino2 Corretto3 Cortado4 Doppio5 Espresso6 Frappucino7 Freddo8
```

O método copyOfRange() da classe [java.util.Arrays](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html) também pode ser utilizado para fazer a cópia de arrays. A diferença, é que ele criará e retornará o array destino, então não será necessário alocar o espaço do array de destino. A saída será a mesma do anterior.
```java
String[] copyFrom = {
	"Affogato0", "Americano1", "Cappuccino2", "Corretto3", "Cortado4", "Doppio5", "Espresso6", "Frappucino7", "Freddo8", "Lungo9",  "Macchiato10", "Marocchino11", "Ristretto12"
};

String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9); // copie os elementos de índice 2 até o índice 8 do array copyFrom

for(String coffee : copyTo) {
	System.out.println(coffee + " ");
}
```

#### **Convertendo um array para String**

o Método toString de da classe [java.util.Arrays](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html) transforma os elementos de uma array em Strings.

```java
System.out.println(java.util.Arrays.toString(copyTo)); // saída: [Cappuccino2, Corretto3, Cortado4, Doppio5, Espresso6, Frappucino7, Freddo8]
```

## [Questões e exercícios: Variáveis](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/questions_variables.html)

Questions
1. The term "instance variable" is another name for _NON-STATIC FIELD_.
2. The term "class variable" is another name for _STATIC FIELD_.
3. A local variable stores temporary state; it is declared inside a _METHOD_.
4. A variable declared within the opening and closing parenthesis of a method signature is called a _PARAMETER_.
5. What are the eight primitive data types supported by the Java programming language? _byte, short, int, long, float, double, boolean, char_
6. Character strings are represented by the class _java.lang.String_.
7. An _ARRAY_ is a container object that holds a fixed number of values of a single type.

Exercises
1. Create a small program that defines some fields. Try creating some illegal field names and see what kind of error the compiler produces. Use the naming rules and conventions as a guide.
2. In the program you created in Exercise 1, try leaving the fields uninitialized and print out their values. Try the same with a local variable and see what kind of compiler errors you can produce. Becoming familiar with common compiler errors will make it easier to recognize bugs in your code.

[Check your answers](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/answers_variables.html)

## Operadores

<table border="1" cellpadding="5" summary="This table lists operators according to precedence order">
<caption id="nutsandbolts-precedence"><strong>Operator Precedence</strong></caption>
<tbody><tr>
<th id="h1">Operators</th>
<th id="h2">Precedence</th>
</tr>
<tr>
<td headers="h1">postfix</td>
<td headers="h2"><code><em>expr</em>++ <em>expr</em>--</code></td>
</tr>
<tr>
<td headers="h1">unary</td>
<td headers="h2"><code>++<em>expr</em> --<em>expr</em> +<em>expr</em> -<em>expr</em> ~ !</code></td>
</tr>
<tr>
<td headers="h1">multiplicative</td>
<td headers="h2"><code>* / %</code></td>
</tr>
<tr>
<td headers="h1">additive</td>
<td headers="h2"><code>+ -</code></td>
</tr>
<tr>
<td headers="h1">shift</td>
<td headers="h2"><code>&lt;&lt; &gt;&gt; &gt;&gt;&gt;</code></td>
</tr>
<tr>
<td headers="h1">relational</td>
<td headers="h2"><code>&lt; &gt; &lt;= &gt;= instanceof</code></td>
</tr>
<tr>
<td headers="h1">equality</td>
<td headers="h2"><code>== !=</code></td>
</tr>
<tr>
<td headers="h1">bitwise AND</td>
<td headers="h2"><code>&amp;</code></td>
</tr>
<tr>
<td headers="h1">bitwise exclusive OR</td>
<td headers="h2"><code>^</code></td>
</tr>
<tr>
<td headers="h1">bitwise inclusive OR</td>
<td headers="h2"><code>|</code></td>
</tr>
<tr>
<td headers="h1">logical AND</td>
<td headers="h2"><code>&amp;&amp;</code></td>
</tr>
<tr>
<td headers="h1">logical OR</td>
<td headers="h2"><code>||</code></td>
</tr>
<tr>
<td headers="h1">ternary</td>
<td headers="h2"><code>? :</code></td>
</tr>
<tr>
<td headers="h1">assignment</td>
<td headers="h2"><code>= += -= *= /= %= &amp;= ^= |= &lt;&lt;= &gt;&gt;= &gt;&gt;&gt;=</code></td>
</tr>
</tbody></table>

## [Questões e exercícios: Operadores](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/questions_operators.html)

Questions

1. Consider the following code snippet.
arrayOfInts[j] > arrayOfInts[j+1]
Which operators does the code contain?
_GREATER THAN (>), PLUS (+)_
2. Consider the following code snippet.
```java
int i = 10;
int n = i++%5;
```
What are the values of i and n after the code is executed? _i = 11, n = 0_
What are the final values of i and n if instead of using the postfix increment operator (i++), you use the prefix version (++i))?
_i = 11, n = 1_

3. To invert the value of a boolean, which operator would you use?
_!_
4. Which operator is used to compare two values, = or == ? _==_
5. Explain the following code sample: result = someCondition ? value1 : value2;
_It is an if: if somecondition, result will receive value1, else, it will receive value2._

Exercises

2. In the following program, explain why the value "6" is printed twice in a row:
```java
class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;                     
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);    // "7"
    }
}
```
O código System.out.println(++i) avalia o valor já incrementado (5+1), já o código System.out.println(i++); avalia para o valor atual (6) e depois incrementa (7).

[Check your answers](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/answers_operators.html)

## Expressões, Statements e Blocos

- Expressões: Construção feita de variáveis, operadores e invocação de métodos.
- Statements (instruções): o equivalente às sentenças em linguagem natural. Termina sempre com um semicolon (;). 
- Blocos: Grupos de statements separados por chaves {}.

## [Questões e Exercícios - Expressões, Statements e Blocos](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/questions_expressions.html)

Questions
1. Operators may be used in building _EXPRESSIONS_, which compute values.
2. Expressions are the core components of _STATEMENTS_.
3. Statements may be grouped into _BLOCKS_.
4. The following code snippet is an example of a _COMPOUND_ expression.
 1 * 2 * 3
5. Statements are roughly equivalent to sentences in natural languages, but instead of ending with a period, a statement ends with a _SEMICOLON (;)_.
6. A block is a group of zero or more statements between balanced _BRACES {}_ and can be used anywhere a single statement is allowed.

Exercises
Identify the following kinds of expression statements:
```java
- aValue = 8933.234;                    // ASSIGNMENT STATEMENT
- aValue++;                             // INCREMENT STATEMENT
- System.out.println("Hello World!");   // METHOD INVOCATION STATEMENT
- Bicycle myBike = new Bicycle();       // OBJECT CREATION STATEMENT
```

[Check your answers](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/answers_expressions.html)

## Expressões de Controle de Fluxo

### Instrução Switch 

O comando switch utiliza o break para sair do fluxo. Se o break não for usado, ele poderá cair em fall through:

```java
public static void main(String[] args){

	Arraylist<String> futureMonths = new Arraylist<String>();

	int monthNumber = 8;

	switch(monthNumber){
		case 1: futureMonths.add("january");
		case 2: futureMonths.add("february");
		case 3: futureMonths.add("march");
		case 4: futureMonths.add("april");
		case 5: futureMonths.add("may");
		case 6: futureMonths.add("june");
		case 7: futureMonths.add("july");
		case 8: futureMonths.add("august");
		case 9: futureMonths.add("september");
		case 10: futureMonths.add("october");
		case 11: futureMonths.add("november");
		case 12: futureMonths.add("december");
			break;
		default: 
			break;
	}

	if(futureMonths.isEmpty()){
		System.out.println("Número de mês inválido\n");
	} else {
		for (String month : futureMonths){
			System.out.println(month); // mostrará august e todos os meses após august
		}
	}
}
```

A saída será:
```
august
september
october
november
december
```

###  Instruções Branching

O comando break pode ser usado para para controles de fluxo rotulados (labeled) ou não-rotulados (unlabeled).

Observe o exemplo que faz parar o controle de fluxo rotulado "search":
```java
public class BreakWithLabelDemo {
	
	public static void main(String[] args){
		
		int[][] intNumbers = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};

		int num = -1, i = -1, j = -1;

		search:
		for(i = 0; i < intNumbers.length; i++){
			for(j = 0; j < intNumbers[i].length; j++){
				if(intNumbers[i][j] == 5){
					num = intNumbers[i][j]; 
					break search;
				}
			}
		}

		System.out.println("Found " + num + " in position " + i + ", " + j);

	}

}
```

## [Questões e Exercícios - Instruções de Controle de Fluxo](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/questions_flow.html)

Questions
1. The most basic control flow statement supported by the Java programming language is the _IF-THEN_ statement.
2. The _SWITCH_ statement allows for any number of possible execution paths.
3. The _DO-WHILE_ statement is similar to the while statement, but evaluates its expression at the _BOTTOM_ of the loop.
4. How do you write an infinite loop using the for statement?
```java
for(;;){}
```
5. How do you write an infinite loop using the while statement?
```java
while(true){}
```

Exercises

1. Consider the following code snippet.

```java
if (aNumber >= 0)
    if (aNumber == 0)
        System.out.println("first string");
else System.out.println("second string");
System.out.println("third string");
```
a. What output do you think the code will produce if aNumber is 3?
```
second string
third string

The else clause is attached to the second if (probably if-then-else is just one statement).
```

b. Write a test program containing the previous code snippet; make aNumber 3. What is the output of the program? Is it what you predicted? Explain why the output is what it is; in other words, what is the control flow for the code snippet?
c. Using only spaces and line breaks, reformat the code snippet to make the control flow easier to understand.
d. Use braces, { and }, to further clarify the code.
```java
if (aNumber >= 0){
	if (aNumber == 0){
        System.out.println("first string");
	} else {
		System.out.println("second string");
	} 
} 
System.out.println("third string");
```

[Check your answers](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/answers_flow.html)

## <center> [Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html) </center>

## [Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)

### Declarando classes

MyClass é uma subclasse de MySuperClass que implementa YourInterface
```java
class MyClass extends MySuperClass implements YourInterface{
	// field, constructor, and
	// method declarations
}
```

As declarações de classes possuem o seguinte formato:
```java
<modificador> class <NomeDaClasse> extends <NomeDaSuperClasse> implements <NomeDaInterface> {}
```

## [Objetos](https://docs.oracle.com/javase/tutorial/java/javaOO/objects.html)

## [Mais de Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/more.html)

## [Questões e exercícios - Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/QandE/creating-questions.html)

## [Questões e exercícios - Objetos](https://docs.oracle.com/javase/tutorial/java/javaOO/QandE/objects-questions.html)

## [Classes aninhadas](https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html)

## [Questões  exercícios - Classes aninhadas](https://docs.oracle.com/javase/tutorial/java/javaOO/QandE/nested-questions.html)

## [Tipos Enum](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)

## [Questões e exercícios - Tipos Enum](https://docs.oracle.com/javase/tutorial/java/javaOO/QandE/enum-questions.html)




## <center> [Annotations](https://docs.oracle.com/javase/tutorial/java/annotations/index.html) </center>

## <center> [Interfaces and Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/index.html) </center>

## <center> [Numbers and Strings](https://docs.oracle.com/javase/tutorial/java/data/index.html) </center>

## <center> [Generics](https://docs.oracle.com/javase/tutorial/java/generics/index.html) </center>

## <center> [Packages](https://docs.oracle.com/javase/tutorial/java/package/index.html) </center>


# <center> [Essential Java Classes](https://docs.oracle.com/javase/tutorial/essential/index.html) </center>