<h1 align="center">Ticket Number</h1>

<p align="center">Projeto do teste de Java com Spring boot</p>
<p align="center">
<img src="https://img.shields.io/static/v1?label=Java&message=11&color=blue&style=for-the-badge&logo=java">
<img src="https://img.shields.io/static/v1?label=Spring&message=2.5.0&color=blue&style=for-the-badge&logo=spring">
</p>
<p align="center">
 <a href="###Regra%de%negocio">Regra de negocio</a> •
 <a href="#Desafio">Desafio</a> • 
 <a href="#Recursos%Solicitados">Recursos Solicitados</a> •
 <a href="#Extras">Extras</a> •
 <a href="#Testando">Testando</a>

</p>


### Regra de negocio

Serviço que gera ticket de atendimento para um hospital de acordo com a prioridade do paciente. Podendo ser um paciente preferencial ou comum.
Para o paciente preferencial o CodeTicketNumber deve iniciar com as letras PP (preferred patient).
Para o paciente comum o CodeTicketNumber deve iniciar com as letras CP (common patient).

### Desafio

Implementar a partir do projeto base os recursos Rest com a linguagem Java e o framework Spring boot.
Já está configurado com o banco de dados H2 sendo necessária a implementação das classes e interface.

### Recursos Solicitados
Os recursos solicitados abaixo já possuem os métodos aguardando implementação para serem avaliados.
- [x] Buscar todos os ticket's.
- [x] Buscar um ticket por id.
- [x] Cadastrar um novo ticket.
- [x] Deletar um ticket por id.
- [x] Atualizar um ticket por id.
- [x] Buscar um ticket pelo CodeTicketNumber.
- [x] Implementar a regra de negócio dos pacientes preferenciais.

### Extras
Os recursos abaixo são opcionais e sugestões caso queira acrescentar funcionalidades ao projeto.
- [ ] Buscar todos os ticket's ordenados pela prioridade dos pacientes.
- [ ] Buscar todos os ticket's com paginação.
- [ ] Implementar o tratamento de exceções. 
- [ ] Criar a entidade "médico" e retornar todos os pacientes que foram atendidos por ele.

### Testando
O teste será realizado com o aplicativo Postman sendo aguardado o HttpStatus e caso exista o corpo da resposta.
- [x] Buscar todos os ticket's cadastrados no banco de dados.
- [x] Buscar um ticket por id no banco de dados.
- [x] Cadastrar um novo ticket no banco de dados e retornar ao usuário o CodeTicketNumber gerado e seus dados cadastrados.
- [x] Deletar um ticket por id do banco de dados.
- [x] Atualizar as informações de um ticket por id, mas não poderá ser alterado o CodeTicketNumber.
- [x] Buscar um ticket pelo CodeTicketNumber.
- [x] Implementar a regra de negócio dos pacientes preferenciais.

O teste de recursos extras será realizado se forem implementados.
- [ ] Buscar todos os ticket's ordenados pela prioridade dos pacientes preferenciais primeiro.
- [ ] Buscar todos os ticket's com paginação.
- [ ] Provocar a situação de exceção para validação do tratamento.
- [ ] Criar a entidade "médico" e seu CRUD.
- [ ] Com a entidade médico criada, desenvolver o recurso de atendimento do paciente.
- [ ] Retornar todos os pacientes que foram atendidos por este médico.
