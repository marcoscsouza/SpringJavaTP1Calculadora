# Relatório Detalhado do Funcionamento do Projeto

## Serviços Implementados

Os serviços implementados são soma, subtração, multiplicação e divisão. Cada serviço está disponível através de endpoints REST com suporte para métodos GET e POST. Testes foram realizados utilizando o Postman.

## Anotações Utilizadas

- **@RestController**: Define a classe como um controlador REST, facilitando a criação de endpoints.
- **@RequestMapping**: Utilizada para definir as rotas e métodos HTTP suportados (GET e POST).
- **@PathVariable**: Permite a captura de variáveis de rota diretamente nos métodos.

A escolha pelo uso de `@RequestMapping` em vez de `@GetMapping` e `@PostMapping` separadamente foi feita para simplificar a definição de múltiplos métodos HTTP em um único ponto.

## Organização do Código

O código foi organizado de forma clara e concisa. Cada método representa uma operação matemática específica, com rotas bem definidas e tratativas para evitar erros, como a divisão por zero.

## Conclusão

O desenvolvimento dos serviços REST foi concluído com sucesso. As escolhas técnicas foram justificadas com base na simplicidade e clareza do código. A organização do repositório segue boas práticas de desenvolvimento, e os testes realizados com o Postman confirmaram o correto funcionamento dos endpoints.
