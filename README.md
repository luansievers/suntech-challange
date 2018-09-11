`Utilizado Java 1.8`  
## Setup  
O projeto foi feito com Maven, portanto a importação em qualquer IDE se dá pela importação de Maven Project.  
  
**No IntelliJ IDEA**

 - *Import Project*
 - Selecionar a pasta do projeto
 - Selecionar *Import project from external model*
 - Selecionar *Maven* e clique em **next**
 - Na próxima aba as configurações *default* podem permanecer do jeito que estão, clique em **next** até a ultima aba para finalizar a importação

**Lombok**
O projeto utiliza o plugin Lombok. A instalação do plugin deve ser realizada em ordem do funcionamento do projeto.
[Lombok Project Website](https://projectlombok.org/) 

## Criação
O projeto foi inicializado com o site [SPRING INITIALIZR](https://start.spring.io/), que abstrai uma grande parte da inicialização do projeto com a parte de seleção de dependências iniciais já suportadas pelo Spring.
Os pacotes principais criados *controller, mapper, model e service*, foram reproduzidos conforme o modelo de MVC e melhores práticas conforme os mini cursos de aprendizado do spring boot, inclusive a divisão entre os pacotes *java, resources e webapp*

## Melhorias
Acredito que na parte de *front-end* poderia ser feita uma seleção de colunas visíveis e ainda uma paginação com limite de 10 a 20 por página da tabela.
Na parte de *back-end* eu não saberia dizer a necessidade de se criar mais filtros em um futuro, por isso fiz de modo a ter pronto esta opção de filtro, sendo necessário apenas ajustar o *front-end* e o sql no *XML* do *mapper.*