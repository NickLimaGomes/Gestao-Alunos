# sistema de gestão de alunos

um sistema básico de cadastro e listagem de alunos e cursos, desenvolvido com **spring boot**, **spring data jpa**, **thymeleaf** e **banco h2**.  
permite criar alunos, associar a um curso e visualizar tudo em listas organizadas.

---

## 🚀 tecnologias utilizadas

- java 17+
- spring boot  
  - spring web  
  - spring data jpa  
  - thymeleaf  
- banco h2 (em memória)  
- bootstrap 5 (interface)

---

## 📁 estrutura do projeto

```
src/main/java/com/gestaoalunos
 ├── controller
 │    └── alunoController.java
 │    └── cursoController.java
 ├── model
 │    └── aluno.java
 │    └── curso.java
 └── repository
      └── alunoRepository.java
      └── cursoRepository.java

src/main/resources
 ├── templates
 │    ├── alunos
 │    │    ├── formulario.html
 │    │    └── lista.html
 │    ├── cursos
 │    │    ├── formulario.html
 │    │    └── lista.html
 │    └── index.html
 └── application.properties
```

---

## 🧩 funcionalidades

- cadastrar alunos  
- listar alunos cadastrados  
- cadastrar cursos  
- listar cursos cadastrados  
- associar aluno → curso  
- persistência automática usando jpa  
- páginas html dinâmicas com thymeleaf  

---

## 🗄️ banco de dados h2

o h2 é em memória e sobe automaticamente quando o projeto é iniciado.

**console h2:**  
http://localhost:8080/h2-console

**config padrão:**  
- jdbc url: `jdbc:h2:mem:testdb`  
- usuário: `sa`  
- senha: *(vazio)*  

---

## ▶️ como executar

1. clone o repositório:
```
git clone https://github.com/seu-usuario/seu-repo.git
```

2. abra na sua ide (eclipse, intellij, sts)

3. execute a classe principal do spring boot

4. acesse no navegador:
```
http://localhost:8080
```

---

## 🧪 telas principais

- **home**  
- **lista de alunos**  
- **formulário de novo aluno**  
- **lista de cursos**  
- **formulário de novo curso**  

todas as páginas usam thymeleaf para renderizar os dados enviados pelos controllers.

---

## 📌 observações

este projeto é didático e focado em:
- mvc no spring  
- uso do jpa com relacionamentos  
- thymeleaf + bootstrap  
- organização básica do código  


prontinho 💛
