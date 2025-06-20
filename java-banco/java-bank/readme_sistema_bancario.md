# Sistema Bancário em Java

Este é um sistema bancário simples desenvolvido em Java, com foco em orientação a objetos. O sistema permite criar contas, realizar depósitos, saques, transferências e outras operações bancárias.

---

## Funcionalidades

- **Criação de Contas**: Crie contas correntes ou poupanças.
- **Depósito**: Adicione dinheiro à conta.
- **Saque**: Retire dinheiro da conta.
- **Transferência**: Transfira dinheiro entre contas via PIX.
- **Investimento**: Registre investimentos diretamente da conta.
- **Histórico de Transações**: Acompanhe as operações realizadas.

## Tecnologias Utilizadas

- **Linguagem**: Java
- **Ferramentas**:
  - VSCode (com extensões para Java e Lombok)
  - Lombok (para reduzir boilerplate code)
  - Enumerações e Records (para melhor organização de dados)
 
  ---

## Estrutura do Projeto

```plaintext
sistema-bancario/
├── src/
│   ├── entities/          # Classes de entidades (Conta, ContaCorrente, ContaPoupanca)
│   ├── enums/             # Tipos enumerados (TipoTransacao)
│   ├── repositories/      # Repositórios para persistência em memória
│   ├── services/          # Serviços de lógica de negócios
│   └── Main.java          # Ponto de entrada do programa
├── README.md              # Documentação do projeto
└── .gitignore             # Arquivos ignorados pelo Git
```

---

## Como Executar

1. Abra o projeto no VSCode.
2. Compile o projeto:

```bash
javac -d out src/*.java src/*/*.java
```

3. Execute o programa:

```bash
java -cp out Main
```

---

## Exemplos de Uso

### Criar uma Conta

1. Escolha a opção `1` no menu.  
2. Insira os detalhes da conta:

```plaintext
Digite o número da conta: 12345  
Digite o nome do titular: João Silva  
Tipo de conta (1 - Corrente, 2 - Poupança): 1
```

A conta será criada com sucesso.

---

### Realizar um Depósito

1. Escolha a opção `2` no menu.  
2. Insira o número da conta e o valor:

```plaintext
Número da conta: 12345  
Valor do depósito: 500.00
```

O saldo será atualizado.

---

### Realizar uma Transferência

1. Escolha a opção `4` no menu.  
2. Insira os detalhes da transferência:

```plaintext
Número da conta de origem: 12345  
Número da conta de destino: 67890  
Valor da transferência: 200.00
```

O saldo será atualizado nas duas contas.

---

## Contribuições

Contribuições são bem-vindas! Se você deseja melhorar o projeto, siga as etapas abaixo:

1. Faça um fork do repositório.
2. Crie uma branch para sua feature:

```bash
git checkout -b feature/nova-funcionalidade
```

3. Envie suas alterações:

```bash
git commit -m 'Adiciona nova funcionalidade'
```

4. Faça um push para a branch:

```bash
git push origin feature/nova-funcionalidade
```

5. Abra um Pull Request.

---

## Licença

Este projeto está sob a licença MIT. Consulte o arquivo `LICENSE` para mais informações.

