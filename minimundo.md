# 1. Introdução

A **modelagem de dados** é definida como o estudo das informações existentes em um contexto sob observação para a construção de um modelo de representação e entendimento desse cenário. Ela consiste em "minerar" as informações que representam esse contexto, estruturando-as em um conjunto que constitui o modelo lógico de dados.

Abaixo, detalho os principais aspectos que compõem a definição de modelagem de dados segundo as fontes:

# 2. Representação do "Minimundo"

O objetivo central da modelagem é retratar fielmente o **minimundo**, que é a porção da realidade que a gestão de negócios tem interesse em observar, controlar e administrar. Através da modelagem, as necessidades de informação das pessoas são registradas para que os objetivos do ambiente de negócios sejam alcançados.

# 3. Uso da Abstração

A modelagem baseia-se no processo mental de **abstração**, que permite selecionar as propriedades essenciais de um conjunto de objetos ou fatos, ignorando detalhes que não são relevantes para aquele contexto específico. Isso permite criar modelos que omitem detalhes técnicos de armazenamento, focando na lógica do negócio.

# 4. Níveis de Abstração da Estrutura

Para que o banco de dados seja independente dos programas de aplicação, sua estrutura é dividida em três níveis principais, conhecidos como a arquitetura de três esquemas:

- **Esquema Conceitual (Alto Nível):** Descreve a estrutura de toda a base de dados para uma comunidade de usuários, focando em **entidades, atributos e relacionamentos**, sem se preocupar com detalhes de armazenamento físico.
- **Esquema Lógico (Implementação):** Adapta o modelo conceitual para uma tecnologia específica (como o modelo relacional, de rede ou hierárquico), definindo como as tabelas e colunas serão organizadas, mas ainda sem detalhar o software específico.
- **Esquema Interno ou Físico (Baixo Nível):** Descreve os detalhes de **armazenamento físico**, como caminhos de acesso, tamanhos de campos, tipos de dados permitidos pelo SGBD e a localização dos arquivos no disco.
## Para entender melhor

Para entender os **níveis de abstração** da estrutura de um banco de dados, você deve focar na chamada **Arquitetura de Três Esquemas**, que visa separar as aplicações do usuário da base de dados física. Essa divisão é fundamental para garantir a independência de dados e facilitar o entendimento organizacional.

Aqui estão os detalhes sobre o que você precisa saber, as representações e as formas de descrevê-los:
## 4.1. Nível Conceitual (Alto Nível)

- **O que é:** É uma visão global e de alto nível de toda a base de dados, concentrando-se na descrição de **entidades, relacionamentos e restrições**. Ele representa o "**minimundo**" (a parte da realidade de interesse do negócio) de forma independente da implementação tecnológica.
- **Representação por Diagramas:** O método mais comum é o **Modelo Entidade-Relacionamento (ER)**, onde entidades são retângulos, relacionamentos são losangos e atributos são elipses (notação de Peter Chen).
- **Descrição por Texto:** Pode ser feita através de uma **descrição textual** detalhando os objetos e as regras de negócio de forma simples para que o usuário final possa revisar.

## 4.2. Nível Lógico (Nível de Implementação)

- **O que é:** Adapta o modelo conceitual para uma abordagem tecnológica específica, como o **modelo relacional**, de rede ou hierárquico. Ele descreve o formato das estruturas (como tabelas), mas ainda sem considerar detalhes do software específico (SGBD).
- **Representação por Diagramas:** Utiliza notações como a da **Engenharia de Informação (James Martin)** ou de **Gordon Everest (pés de galinha)**, que mostram tabelas com seus nomes de colunas e identificam chaves primárias e estrangeiras.
- **Descrição por Texto:** É comumente descrito via **Esquemas de Relação**, representados no formato _Tabela(Atributo1, Atributo2, ...)_, destacando a chave primária com um sublinhado.

## 4.3. Nível Interno ou Físico (Baixo Nível)

- **O que é:** Descreve os detalhes do **armazenamento físico** dos dados no computador, incluindo caminhos de acesso, tipos e tamanhos de campos, índices e gatilhos (_triggers_).
- **Representação por Diagramas:** O modelo físico detalha as propriedades das colunas dentro das tabelas, especificando o tipo de dado exato permitido pelo SGBD (como INT, VARCHAR ou DATETIME).
- **Descrição por Texto:** A principal forma de descrição é o **Script de Criação** (conjunto de comandos **DDL** em SQL), que define a montagem efetiva da estrutura no dicionário de dados do sistema.

## Mecanismos de Abstração Fundamentais

Para construir essas representações, você utilizará três processos mentais básicos:

1. **Classificação:** Agrupar objetos com propriedades comuns em classes (ex: identificar que "Maria" pertence à classe "Pessoa").
2. **Agregação:** Compor um objeto a partir de suas partes (ex: "Bicicleta" é composta por pneus, pedais e quadro).
3. **Generalização/Especialização:** Identificar subconjuntos de relacionamentos entre classes, criando hierarquias de **supertipos e subtipos** (ex: "Veículo" é uma generalização de "Bicicleta" e "Carro").

# 5. Estabilidade e Independência

Uma característica fundamental da modelagem de dados é que ela foca em elementos que são **mais estáveis que os processos**. Enquanto um processo de negócio pode mudar drasticamente, os dados que ele utiliza tendem a permanecer constantes. Além disso, um bom modelo de dados garante a **independência**, permitindo que a estrutura lógica seja alterada sem afetar a forma como os dados são armazenados fisicamente (e vice-versa).

# 6. Finalidade Prática

Praticamente, a modelagem funciona como um **plano ou fotocópia** para construir o banco de dados físico. Ela deve ser:

- Simples o suficiente para ser validada pelo usuário final.
- Detalhada o bastante para que o administrador de banco de dados (DBA) crie a estrutura física no SGBD.

# 7. O Processo de Modelagem

A atividade de modelar não é apenas desenhar diagramas, mas um processo que envolve cinco aspectos: **observação** (coleta de requisitos), **entendimento dos conceitos**, **representação dos objetos** (usando técnicas como o Modelo Entidade-Relacionamento), **verificação de fidelidade** e **validação** formal com o usuário.
