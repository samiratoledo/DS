##### Herança Java - Samira - 2DSA



A herança no Java é um dos pilares da Programação Orientada a Objetos (POO). Ela permite a criação de novas classes com métodos e atributos já definidos por uma superclasse previamente existente. Porém, essa definição não impede que a subclasse seja modificada, podendo ser adaptada conforme a necessidade.



As classes criadas a partir dessa classe anterior *(superclasse ou classe base)* são chamadas de *subclasses* ou *classes derivadas*. Com isso, é possível criar uma hierarquia, formando classes mais amplas e abrangentes ou mais específicas e detalhadas.



A herança é amplamente utilizada na programação, pois melhora a organização do código, reduz a repetição e facilita a manutenção e o reaproveitamento do sistema.





###### **Exemplo 1: Sistema de Universidade**



Imagine a criação de um sistema para uma universidade, com professores, coordenadores e alunos. Todos eles possuem características em comum, que podem ser definidas em uma superclasse chamada Usuário, contendo atributos como id, CPF, data e nome. A subclasse Aluno herda todos os atributos da superclasse e adiciona o atributo matrícula, que não é necessário para os demais.

Já as subclasses Professor e Coordenador podem possuir o atributo cargo, que não se aplica ao aluno, pois não teria utilidade em seu registro. Com esse exemplo, é possível visualizar a aplicação da herança de forma simples e clara.





###### **Exemplo 2: Sistema de Concessionária**



Na criação de um sistema para uma concessionária, pode-se definir uma superclasse Carro, contendo atributos como modelo, cor e ano. Ao criar subclasses, elas herdarão esses atributos automaticamente, podendo ainda adicionar novas características específicas conforme a necessidade. Isso torna o desenvolvimento mais rápido, organizado e eficiente.







Com isso, entendemos que a herança é um pilar essencial da programação orientada a objetos, especialmente no Java, pois permite reutilizar código, organizar melhor as classes e tornar o sistema mais eficiente.

