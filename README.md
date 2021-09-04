
<h3>Adaptações:</h3>
1 - Ide: IntelliJ<br>
2 - spring.datasource.url= jdbc:mysql://localhost:3306/twclientes?useTimezone=true&serverTimezone=UTC&createDatabaseIfNotExist=true<br>
Utilizei a propriedade acima para criar o banco de dados caso não exista e também já defini o Timezone.<br>
3 - Não criei outro user no banco de dados. Mas recomendo que façam como o instrutor ensina!<br>
4 - Implementei o Lombok para facilitar os gettters, setters, constructors e etc.<br>
5 - Utilizei a anotação @RestController no lugar da anotação @Controller.<br>
6 - Separei as responsabilidades do serviço utilizando o pattern "service". Sendo assim, implementei a camada service e a anotação @Service nas classes responsáveis pela lógica do serviço.<br>
7 - Criei 2 diretórios: response.dto e request.form<br>
8 - Criei a classe ClienteDto para controlar o que será exibido sobre o cliente<br>
9 - Formatei a data de nascimento utilizando o ${#temporals.format(cliente.dataNascimento, 'dd/MM/yyyy')}
10 - Para implementar a funcionalidade de detalhar, utilizei o método findById() no lugar do getOne() <br>
11 - Extrai o bloco que faz a verificação se deterrminado cliente existe associando a um id.
Com isso, fiz um tratamento de erro bem genérico.
12 - Alterei um pouco a disposição dos inputs, colocando "data de nascimento" e "profissão" um ao lado do outro.




