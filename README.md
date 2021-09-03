
<h3>Detalhes:</h3>
1 - spring.datasource.url= jdbc:mysql://localhost:3306/twclientes?useTimezone=true&serverTimezone=UTC&createDatabaseIfNotExist=true<br>
Utilizei a propriedade acima para criar o banco de dados caso não exista e também já defini o Timezone.<br>
2 - Não criei outro user no banco de dados. Mas recomendo que façam como o instrutor ensina!<br>
3 - Implementei o Lombok para facilitar os gettters, setters, constructors e etc.<br>
4 - Utilizei a anotação @RestController no lugar da anotação @Controller.<br>
5 - Separei as responsabilidades do serviço utilizando o pattern "service". Sendo assim, implementei a camada service e a anotação @Service nas classes responsáveis pela lógica do serviço.<br>


