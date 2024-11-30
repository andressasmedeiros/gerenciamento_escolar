Telas:
- cadastro de turma: deve permitir cadastrar uma turma. Também deve cadastrar, editar,
remover e listar unidades curriculares. Também deve cadastrar, editar, remover e listar estudantes.
- listagem de turmas: listar as turmas em forma de tabela com um botão pra acessar o cadastro da turma.
  
Entidade: Turma;
  Campos:
- Nome;
- Início;
- Término;
- List<UnidadeCurricular>;
- List<Estudante>;
- Quantidade mínima estudantes;
- Quantidade máxima estudantes;

Entidade: Unidade Curricular;
Campos:
- Nome;
- Carga horária;

Entidade: Estudante;
Campos:
- Nome;
- Data de nascimento;