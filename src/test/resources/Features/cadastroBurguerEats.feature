# language: pt

@cadastroBurguerEats
Funcionalidade: Cadastrar parceiros
  Eu como usuário do Burger Eats
  Quero me cadastrar
  Para realizar as entregas no Burger Eats

  @cadastro
  Cenario: Cadastrar parceiro
  Dado que eu esteja no site BurguerEats
    Quando eu clicar no botão Cadastre-se para fazer entregas
    E preencher todos os dados do formulário
    Então quero que o cadastro seja realizado com sucesso