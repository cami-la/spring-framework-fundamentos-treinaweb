
<h3>Adaptações:</h3>
<ol>
  <li>  Ide: IntelliJ </li>
  <li> Utilizei a propriedade abaixo para criar o banco de dados caso não exista e também já defini o Timezone.<br>
    <code>spring.datasource.url= jdbc:mysql://localhost:3306/twclientes?useTimezone=true&serverTimezone=UTC&createDatabaseIfNotExist=true</code><br></li>
  <li> Não criei outro user no banco de dados. Porém, recomendo que façam como o instrutor ensina!</li>
  <li> Implementei o Lombok para facilitar os gettters, setters, constructors e etc.</li>
  <li>Separei as responsabilidades do serviço utilizando o pattern "service". Sendo assim, implementei a camada service e a anotação @Service na classe responsável pela lógica do serviço (ClienteService).</li>
  <li>Criei 2 diretórios: response.dto e request.form</li>
  <li>Criei a classe ClienteDto para controlar o que será exibido sobre o usuário.</li>
  <li>Formatei a data de nascimento utilizando o ${#temporals.format(cliente.dataNascimento, 'dd/MM/yyyy')}</li>
  <li>Para implementar a funcionalidade de detalhar utilizei o método findById() no lugar do getOne() (a qual se eu não me engane, está deprecated). Foi muito didático da parte do instrutor utilizar o getOne() para não dificultar a lógica precisando explicar o retorno do Optional<>.</li>
  <li>Extrai o bloco que faz a verificação se deterrminado cliente existe associando a um id. Com isso, fiz um tratamento de erro bastante genérico.</li>
  <li>Alterei um pouco a disposição dos inputs colocando "data de nascimento" e "profissão" um ao lado do outro.</li>
  <li>Criei a classe ClienteForm para centralizar o request do form.</li>
</ol>
<em>P.s: Talvez tenha esquecido alguma outra alteração. Essas adaptações acima, são as que julgo mais relevantes.</em>



