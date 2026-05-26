Você foi contratado para desenvolver o protótipo de um sistema de inventário para um mercadinho de bairro. O sistema deve permitir que o dono do mercado cadastre produtos, remova itens que saíram de linha, verifique se um item está e++ estoque e exiba a lista organizada. Sua tarefa é implementar a lógica dentro de cada case seguindo os requisitos abaixo:

## 1. Adicionar Produto (Método add)
O sistema deve pedir o nome do produto.
Regra de Negócio: Antes de adicionar, verifique se o produto já existe na lista (use .contains()). Se já existir, exiba "Produto já cadastrado!". Se não, adicione e confirme a operação.

## 2. Listar Produtos (Método size e for-each)
Se a lista estiver vazia, exiba "Estoque vazio".
Se houver itens, ordene a lista em ordem alfabética usando Collections.sort().
Use um laço for-each para exibir cada item com um número ao lado (Ex: 1. Arroz).

## 3. Remover Produto (Método remove)
Peça o nome do produto que deseja remover.
Verifique se o produto existe. Se sim, remova e avise o usuário. Se não, informe que o produto não foi encontrado.

## 4. Buscar Produto (Método indexOf)
Peça o nome de um produto e informe ao usuário se ele está no estoque e em qual posição (índice) ele se encontra atualmente.

## 5. Orientações Finais
Case Insensitive: Para uma experiência melhor, tente converter todas as entradas para maiúsculas (.toUpperCase()) antes de salvar ou buscar. Assim, "arroz" e "ARROZ" serão tratados como o mesmo item.
Manipulação de Memória: Lembre os alunos que o ArrayList gerencia o array interno automaticamente. Quando removemos o item da posição 0, o Java "puxa" todos os outros itens para frente para não deixar buracos.
Dica de Ouro: Se algum aluno terminar rápido, desafie-o a usar o método estoque.remove(indice) em vez de remover pelo nome, pedindo ao usuário o número que aparece na listagem (lembrando de subtrair 1 do número exibido para chegar ao índice real).