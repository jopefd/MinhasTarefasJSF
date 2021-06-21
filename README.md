# O que é MinhasTarefasJSF? 📝

As **MinhasTarefasJSF** é a minha primeira aplicação web em Java: um sistema simples de gestão de tarefas! Utilizei o framework JSF, o servidor web Apache Tomcat, o banco de dados PostgreSQL e a IDE Eclipse Oxygen.

## Versões utilizadas e downloads ⬇️

* [Java SE 8](https://www.oracle.com/br/java/technologies/javase-downloads.html)
* [JavaServer Faces 2.2.8](https://maven.java.net/content/repositories/releases/org/glassfish/javax.faces/2.2.8/)
* [PostgreSQL 13.3](https://www.postgresql.org/ftp/source/)
* [PostgreSQL JDBC Driver 42.2.22](https://jdbc.postgresql.org/download.html#others)
* [Apache Tomcat 8.5](https://tomcat.apache.org/download-80.cgi)
* [Eclipse Oxygen 2](http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/oxygen2)

## Implementações ⚒️

* [ ] Criar uma aplicação Java Web utilizando JavaServer Faces (JSF)
    + [x] Página de cadastro de uma tarefa
    + [x] Página de confirmação de uma tarefa cadastrada
    + [ ] Página de listagem das tarefas cadastradas
    + [ ] Página de confirmação de uma tarefa editada, excluída ou concluída
* [ ] Utilizar persistência em um banco de dados PostgreSQL
    + [x] Criar um banco de dados
    + [x] Conectar-se ao banco de dados
    + [ ] Cadastrar uma nova tarefa no banco de dados
    + [ ] Listar uma ou mais tarefas cadastradas
* [ ] Utilizar JPA
* [ ] Utilizar testes de unidades
* [ ] Publicar projeto no Heroku ou outro ambiente cloud

Como pode ser visto na lista acima, este projeto ainda não está finalizado. Algumas das funcionalidades dependem da integração com o banco de dados; destaco, principalmente, a listagem das tarefas. Consegui criar e conectar a aplicação ao banco de dados, mas encontrei alguns problemas com a persistência; estou tentando identificar e corrigir os erros. 

# Como testar? 🚀

Certifique-se que as versões dos programas instalados no seu computador sejam as mesmas que as utilizadas para este projeto. Em seguida:

1. Adicione a pasta do projeto (MinhasTarefas) ao Tomcat
2. Inicie o servidor
3. Acesse o link `http://localhost:8080/MinhasTarefas/form.jsf` através do seu navegador

Pronto! Agora é só cadastrar alguma tarefa! Você deve ver as seguintes telas:

![telas de cadastro de uma tarefa: uma com a entrada de dados, outra com a confirmação do cadastro](./Screenshot%20from%202021-06-20%2022-15-44.png)
