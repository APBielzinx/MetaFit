CREATE TABLE Aluno_Treino (
idAluno CHAR(36) NOT NULL,
idTreino CHAR(36) NOT NULL,
PRIMARY KEY (idAluno, idTreino),
FOREIGN KEY (idAluno) REFERENCES Aluno(idAluno) ON DELETE CASCADE,
FOREIGN KEY (idTreino) REFERENCES Treino(idTreino) ON DELETE CASCADE
);

drop table Aluno_Treino;