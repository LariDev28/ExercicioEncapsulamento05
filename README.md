🔒 Exercício sobre Encapsulamento

📚 Sobre o Projeto

Exercício proposto pelo professor Leandro Procopio Alves, docente da disciplina Programação de Soluções Computacionais 
do curso de Ciência da Computação da Universidade Anhembi Morumbi – campus Mooca, com o objetivo de promover a compreensão do conceito de encapsulamento.

🎯 Objetivo

Explorar o conceito de encapsulamento, permitindo:

Proteger os dados de uma classe

Controlar o acesso aos atributos

Utilizar métodos getters e setters

Aplicar boas práticas de orientação a objetos

🧩 Conceitos Trabalhados

Durante o desenvolvimento, foram abordados:

🔐 Encapsulamento

🧱 Modificadores de acesso (private, public)

🔄 Métodos getters e setters

🧠 Organização e proteção de dados

🏗️ Arquitetura do Sistema

O intuito deste projeto é demonstrar como o encapsulamento funciona na prática para organizar informações de maneira segura e simples. Na classe Aluno, os dados são protegidos e acessados apenas através de métodos validados, permitindo que os dados sejam manipulados de forma controlada, essa classe também possui construtores sobrecarregados, permitindo a criação de objetos com diferentes níveis de informação (apenas RA ou RA e nome) garantindo flexibilidade ao código, já a classe principal ExEncapsCinco é responsável por instanciar os objetos e executar o programa, exibindo os dados dos alunos por meio dos métodos de acesso. O uso do modificador private cria uma 'caixa-preta' onde a integridade do RA do aluno é preservada. Isso evita que, em sistemas maiores, o identificador único de um aluno seja alterado acidentalmente por outras partes do software, garantindo a consistência do banco de dados fictício da aplicação. Tudo isso contribui para que a lógica de manipulação de dados esteja sempre centralizada e protegida.

💻 Tecnologias Utilizadas

Java

NetBeans

▶️ Como Executar

Clone o repositório: git clone https://github.com/seu-usuario/seu-repositorio.git

Abra o projeto em sua IDE Java preferida

Compile e execute a classe principal

🧪 Exemplo do Projeto

Entrada Base (no código):

Aluno 1: Apenas RA (125)

Aluno 2: RA (125) e Nome ("Fulano")

Saída no Console:

125

125
Fulano

📌 Aprendizados

Importância de proteger os dados de uma classe

Uso correto de getters e setters

Organização e segurança no código

Aplicação prática de conceitos fundamentais da POO

🧾 Conclusão

A realização deste exercício me possibilitou compreender como o encapsulamento contribui para a segurança e organização do código em Java.

Ao restringir o acesso direto aos atributos e utilizar métodos controlados para manipulação de dados, é possível evitar inconsistências e tornar o sistema mais robusto e confiável, o que é essencial para o desenvolvimento de aplicações bem estruturadas e de fácil manutenção.


