package Model;

public enum Acao {

    ANDAR {
                Personagem person;
                String resposta;
                String parede = "Não há nada nesse lado, apenas parede!";

                @Override
                public String executar(String objeto, int numSala, Personagem person) {
                    if (numSala == 1) {
                        switch (objeto) {
                            case "NORTE":
                                if (person.estaNoUsados("DECODIFICADOR")) {
                                    resposta = "Você foi para a sala de controle";
                                    person.irPara(2);
                                    return resposta;
                                } else {
                                    return "Você não usou o DECODIFICADOR!";
                                }
                            case "SUL":
                                return parede;
                            case "LESTE":
                                return parede;
                            case "OESTE":
                                return parede;
                        }
                    } else if (numSala == 2) {
                        switch (objeto) {
                            case "NORTE":
                                return parede;
                            case "SUL":
                                resposta = "Você voltou para a cela";
                                person.irPara(1);
                                return resposta;
                            case "LESTE":
                                if (person.estaNoUsados("BOTAO")) {
                                    resposta = "Você foi para a sala de armas";
                                    person.irPara(3);
                                    return resposta;
                                } else {
                                    return parede;
                                }
                            case "OESTE":
                                return parede;
                        }
                    } else if (numSala == 3) {
                        switch (objeto) {
                            case "NORTE":
                                return parede;
                            case "SUL":
                                if (person.estaNoUsados("BOMBA")) {
                                    resposta = "Você foi para a o pátio de naves";
                                    person.irPara(4);
                                    return resposta;
                                } else {
                                    return parede;
                                }
                            case "LESTE":
                                return parede;
                            case "OESTE":
                                resposta = "Você voltou para a sala de controle";
                                person.irPara(2);
                                return resposta;
                        }
                    } else if (numSala == 4) {
                        switch (objeto) {
                            case "NORTE":
                                resposta = "Você voltou para a sala de armas";
                                person.irPara(3);
                                return resposta;
                            case "SUL":
                                return parede;

                            case "LESTE":
                                return parede;
                            case "OESTE":
                                return parede;
                        }
                    }
                    resposta = "A ação não é permitida nessa sala";
                    return resposta;
                }
            },
    PEGAR {
                Personagem person;
                String resposta;

                @Override
                public String executar(String objeto, int numSala, Personagem person) {
                    if (numSala == 1) {
                        switch (objeto) {
                            case "DECODIFICADOR":
                                person.addInventario(objeto);
                                resposta = "Você pegou o decodificador!\nJá pode usá-lo.";
                                return resposta;

                        }
                    } else if (numSala == 2) {
                        switch (objeto) {
                            case "CHAVE":
                                person.addInventario(objeto);
                                resposta = "Você pegou a chave";
                                return resposta;
                        }
                    } else if (numSala == 3) {
                        switch (objeto) {
                            case "BOMBA":
                                person.addInventario(objeto);
                                resposta = "Você pegou a bomba";
                                return resposta;
                        }
                    }
                    resposta = "A ação não é permitida nessa sala";
                    return resposta;
                }
            },
    USAR {
                Personagem person;
                String resposta;

                @Override
                public String executar(String objeto, int numSala, Personagem person) {
                    if (numSala == 1) {
                        switch (objeto) {
                            case "DECODIFICADOR":
                                if (person.estaNoInventario(objeto)) {
                                    person.addUsados(objeto);
                                    resposta = "Você usou o decodificador e a porta abriu! "
                                    + "Você já pode ANDAR para a próxima sala...";
                                    return resposta;
                                } else {
                                    resposta = "Você PEGOU o DECODIFICADOR?";
                                    return resposta;
                                }
                        }
                    } else if (numSala == 4) {
                        switch (objeto) {
                            case "NAVE":
                                if (person.estaNoUsados("CHAVE")) {
                                    resposta = "FIM";
                                    return resposta;
                                }
                        }
                    }
                    resposta = "A ação não é permitida nessa sala.";
                    return resposta;
                }
            },
    APERTAR {
                Personagem person;
                String resposta;

                @Override
                public String executar(String objeto, int numSala, Personagem person) {
                    if (numSala == 2) {
                        switch (objeto) {
                            case "BOTAO":
                                person.addUsados(objeto);
                                resposta = "Você apertou o botão com SUCESSO!";
                                return resposta;
                        }
                    }
                    resposta = "A ação não é permitida nessa sala";
                    return resposta;
                }
            },
    PLANTAR {
                Personagem person;
                String resposta;

                @Override
                public String executar(String objeto, int numSala, Personagem person) {
                    if (numSala == 3) {
                        switch (objeto) {
                            case "BOMBA":
                                person.addUsados(objeto);
                                resposta = "Você plantou a bomba com SUCESSO!";
                                return resposta;
                        }
                    }
                    resposta = "A ação não é permitida nessa sala";
                    return resposta;
                }
            },
    ENTRAR {
                Personagem person;
                String resposta;

                @Override
                public String executar(String objeto, int numSala, Personagem person) {
                    if (numSala == 4) {
                        switch (objeto) {
                            case "NAVE":
                                person.addUsados(objeto);
                                resposta = "Você entrou na nave!";
                                return resposta;
                        }
                    }
                    resposta = "A ação não é permitida nessa sala";
                    return resposta;
                }
            },
    LIGAR {
                Personagem person;
                String resposta;

                @Override
                public String executar(String objeto, int numSala, Personagem person) {
                    if (numSala == 4) {
                        switch (objeto) {
                            case "NAVE":
                                if (person.estaNoInventario("CHAVE")) {
                                    person.addUsados("CHAVE");
                                    resposta = "A nave ligou!";
                                    return resposta;
                                } else {
                                    if(person.getPreso() == 0){
                                        resposta = "REINICIO";
                                        person.resetAttr();
                                        person.setPreso();
                                        person.irPara(1);
                                        return resposta;
                                    }
                                    resposta = "FIM3";
                                    return resposta;
                                }
                        }
                    }
                    resposta = "A ação não é permitida nessa sala";
                    return resposta;
                }
            },
    SAIR {
                Personagem person;
                String resposta;

                @Override
                public String executar(String objeto, int numSala, Personagem person) {
                    resposta = "FIM2";

                    return resposta;
                }
            };

    public abstract String executar(String objeto, int numSala, Personagem person);
}
