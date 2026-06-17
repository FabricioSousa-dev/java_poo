
# ☕ Java POO & Banco de Dados

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Windows](https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white)](https://www.microsoft.com/)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)](https://www.postgresql.org/)

Repositório dedicado ao estudo e consolidação de **Programação Orientada a Objetos (POO)** em Java e integração com banco de dados relacionais. Os projetos variam desde exercícios focados em lógica de negócio estrutural até sistemas robustos com persistência de dados.

## 🧠 Conceitos de POO e Arquitetura Aplicados

Este repositório demonstra a aplicação prática de padrões de desenvolvimento corporativos e acadêmicos:

* **Pilares da POO:** Uso extensivo de Encapsulamento, Herança e Polimorfismo para garantir código limpo e reutilizável nas entidades de negócio.
* **Arquitetura em Camadas:** Divisão clara das responsabilidades do sistema em pacotes lógicos:
  * `model`: Classes de domínio (ex: `Autor`, `ContaBancaria`, `Produto`).
  * `view`: Camada de apresentação e classes executáveis (testes).
  * `db`: Camada de persistência e acesso a dados estruturados.
* **Padrão DAO (Data Access Object):** Abstração da lógica de leitura e escrita no banco de dados. Exemplos práticos implementados no repositório: `AutorDao`, `produtosDao`, `AlbumDAO`, e `CachorroDao`.
* **JDBC (Java Database Connectivity):** Uso centralizado da classe `FabricaDeConexoes` para estabelecer comunicação segura e eficiente com o PostgreSQL.

## 🗂️ Estrutura dos Projetos

O repositório contém múltiplos sistemas, que podem ser divididos por complexidade de implementação:

### 🔹 Sistemas Estruturais e Lógicos
Projetos focados em algoritmos, operações matemáticas e regras de negócio em memória (sem persistência permanente):
* `Calculadora`, `geometria`, `Piscina`, `retangulos`, `Carbono`.

### 🔹 Sistemas com Persistência de Dados (JDBC & DAO)
Aplicações completas que realizam operações CRUD (Create, Read, Update, Delete) diretamente no banco de dados relacional:
* `Banco` e `sistemabancario`
* `Biblioteca`
* `Loja`, `Produtos` e `estoque`
* `Musica` e `albuns`
* `canil`
* `RegistroVeiculos`, `veiculos` e `imoveis`

## 🚀 Guia de Execução (Ambiente Windows)

Como os projetos foram desenvolvidos no ecossistema Windows utilizando a IDE Eclipse (contendo a pasta `.metadata`), a forma mais recomendada de testá-los é importando-os diretamente para a sua IDE.

### Pré-requisitos
* [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado e configurado nas Variáveis de Ambiente do Windows.
* **PostgreSQL** instalado e rodando localmente (necessário para os projetos da categoria de Persistência).
* [Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/) (Recomendado).

### Executando via Eclipse IDE
1. Abra o Eclipse em seu ambiente Windows.
2. Vá em `File > Import... > General > Existing Projects into Workspace`.
3. Selecione o diretório raiz clonado deste repositório e clique em `Finish`. O Eclipse reconhecerá as configurações graças à pasta `.metadata`.
4. **Configuração de Banco:** Para projetos com JDBC, acesse a classe `FabricaDeConexoes` dentro do pacote `db` e atualize as credenciais (usuário e senha do Postgres), caso necessário.
5. Navegue até o pacote `view` de um dos projetos, clique com o botão direito na classe principal (ex: `TesteExecutavel.java` ou `Principal.java`) e vá em `Run As > Java Application`.

### Executando via CMD ou PowerShell
Para projetos lógicos menores que não dependem do conector do PostgreSQL:
1. Abra o Prompt de Comando ou PowerShell.
2. Navegue até a pasta `src` do projeto desejado:
cmd
   cd caminho\para\java_poo\NomeDoProjeto\src



3. Compile os arquivos Java:

cmd
   javac view/NomeDaClassePrincipal.java



4. Execute a classe compilada:

cmd
   java view.NomeDaClassePrincipal





*Desenvolvido por Fabricio Sousa.*

