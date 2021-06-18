package Lista3.Q2;

/*
 * a. ( ) Ao criar um objeto da classe Motorista, ele não terá acesso ao valor
 * do atributo nome da classe Pessoa. 
 * b. ( ) A classe Engenheiro tem acesso ao
 * atributo cnh. 
 * c. ( ) A classe Engenheiro estende a classe Funcionario. 
 * d. ( ) A classe Médico pode acessar os atributos das subclasses de mesma hierarquia
 * 
 * RESPOSTA: a. F -> Todos os modificadores de acesso do diagrama são "public" e a classe Motorista é subclasse
                de Funcionario, que é subclasse de Pessoa.
      		b. F -> Não há relação de herança entre as classes Engenheiro e Motorista. 
      		c. V      
      		d. F -> A classe Médico só pode acessar os atributos e os métodos das classes que houverem relação
                de herança com a mesma.
 */