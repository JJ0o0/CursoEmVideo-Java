1 - Dadas as linhas a seguir:

	int x = 8, y = 3;
	int w = x / y;
	String z = (w % 2 == 0) ? "frasel" : "frase2";

	System.out.println(z);

O que acontecerá se esse código for executado?

- a) Um erro de tipo na variável w.
- b) Um erro de atribuição na variável z.
- c) Será impresso "frasel".
- d) Será impresso "frase2".

Resposta: c)


2 - Analise o código a seguir e indique o que será impresso na tela:

	String parte1 = "Curso";
	String parte2 = "Video" ;
	String parte3 = parte1 + parte2;
	String parte4 = "CursoVideo";

System.out.println(parte3 == parte4);
System.out.println(parte3.equals(parte4));

- a) CursoVideo
- b) false true
- c) true true
- d) true false

Resposta: b)


3 - Analise o código a seguir e indique o que será impresso na tela:

	boolean val1 = (4 >= 5), val2 = (4 < 4), val3 = (val1 == val2);
	boolean val4 = val1 ^ val3;
	boolean val5 = !val2 && val4;
	System.out.println(val4 + " " + val5);

- a) true true
- b) false true
- c) false false
- d) true false

Resposta: a)

PRÁTICA: Fazer um jogo de adivinhar um número.