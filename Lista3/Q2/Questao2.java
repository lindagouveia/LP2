package Lista3.Q2;

/*
 * a. ( ) Ao criar um objeto da classe Motorista, ele n�o ter� acesso ao valor
 * do atributo nome da classe Pessoa. 
 * b. ( ) A classe Engenheiro tem acesso ao
 * atributo cnh. 
 * c. ( ) A classe Engenheiro estende a classe Funcionario. 
 * d. ( ) A classe M�dico pode acessar os atributos das subclasses de mesma hierarquia
 * 
 * RESPOSTA: a. F -> Todos os modificadores de acesso do diagrama s�o "public" e a classe Motorista � subclasse
                de Funcionario, que � subclasse de Pessoa.
      		b. F -> N�o h� rela��o de heran�a entre as classes Engenheiro e Motorista. 
      		c. V      
      		d. F -> A classe M�dico s� pode acessar os atributos e os m�todos das classes que houverem rela��o
                de heran�a com a mesma.
 */