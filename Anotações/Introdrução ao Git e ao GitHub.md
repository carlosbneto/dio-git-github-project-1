### INTRODUÇÃO AO GIT

- Vantagens de Aprender o GIT e o GitHub juntos:

  1- Controle de Versão

  2- Armazenamento em nuvem

  3- Trabalho em equipe

  4- Melhorar o seu código

  5- Reconhecimento

  ------

## Realizando a instalação do GIT

https://git-scm.com/download/win

### NAVEGAÇÃO VIA COMMAND LINE INTERFACE E INSTALAÇÃO

GUI (forma responsiva) X CLI (command line interface)

O GIT não tem uma interface gráfica;

### Comando Básico de Navegação CLI

- dir (comando de listar pastas no diretório)
- cd (comando de ir para pasta especifica do sistema)

cls - limpa a área de trabalho

TAB - tem função de auto completar

- mkdir (criar uma pasta no terminal)

(silencio é sucesso, o pront não vai te dizer que deu sucesso.)

- echo hello (imprimi um informação na tela)
- echo hello > hello.txt (redirecionou o fluxo e criou um novo arquivo)
- del (remove arquivos)
- rmdir workspace /S /Q (apaga o repositório).

------

## Entendendo como o Git funciona por baixo dos panos

### Tópicos fundamentais para entender o funcionamento do Git

### SHA1

Secure Hash Algotithm -  função de criptografia de 40 dígitos - eficiente para identificar os arquivos de forma rápida e segura - criando chaves de segurança.

### Objetos fundamentais

**BLOBS** -  objeto tem o tipo do objeto, o tamanho desse arquivo\0  Ola Mundo

o git armazena metadados do git (dados acima)

**Tree** - as Tree armazenam Blobs - que armazenam blob e o nome do arquivo.

responsável por montar toda a estrutura dos arquivos

Uma Tree pode apontar para outras Tree - tendo um sha1 próprio.

**COMMIT** - vai levar a(as) tree, parente, autor, mensagem, timestamp. - a commit também vai ter alteração sha1.

- monta uma linha do tempo com o código que está sendo montado.

### Sistema distribuído Seguro -

GitHub - estado final do seu código ( )

Os autores mainteners, também vão ter versões seguras do código mesmo que tenha uma queda mundial, devido a terceira guerra mundial.

### Chaves SSH e Tokens

- Autenticações no github
- CHAVE SSH é uma forma segura de conexão privada; ter uma assinatura da máquina, já vai tá configurada.
  - SSH - configurando numa máquina privada, windows.

## Primeiros comandos com Git

### Iniciando o Git e criando um commit

Primeiros comandos com o Git

- Iniciar o Git (no promt de comando?)

  -git  init

  inicializa o repositorio, dentro daquele diretório.

  -git add

  -git commit  -m "commit inicial"

Markdown

Uma forma mais humana de escrever html

### Tracked

Untracked - acaba de criar - git não sabia que existia

Unmodified - Sem modificação

Modified - Modificação

Stage - área de espera para a visualização, vira um commit e transforma para um arquivo não Unmodified.