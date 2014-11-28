package Model;

public enum Acao {

    ANDAR {
                Personagem person;
                String resposta;
                String parede = "Não há nada nesse lado, apenas parede!";
                @Override
                public String executar(String objeto, int numSala) {
                    if (numSala == 1) {
                        switch (objeto) {
                            case "NORTE":
                                if (person.estaNoUsados(objeto)) {
                                    resposta = "Você foi para a sala de controle";
                                    person.irPara(2);
                                    return resposta;
                                } else {
                                    return parede;
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
                                if (person.estaNoUsados(objeto)) {
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
                                if (person.estaNoUsados(objeto)) {
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
                    return null;
                }
            },
    PEGAR {
                Personagem person;
                String resposta;
                @Override
                public String executar(String objeto, int numSala) {
                    if (numSala == 1) {
                        switch (objeto) {
                            case "DECODIFICADOR":
                                person.addInventario(objeto);
                                resposta = "Você pegou o decodificador";
                                return resposta;

                        }
                    } else if (numSala == 3) {
                        switch (objeto) {
                            case "BOMBA":
                                person.addInventario(objeto);
                                resposta = "Você pegou a bomba";
                                return resposta;
                        }
                    } else {
                        resposta = "A ação pergar não é permitida nessa sala";
                        return resposta;
                    }

                    return null;
                }
            },
    USAR {
                Personagem person;
                String resposta;
                @Override
                public String executar(String objeto, int numSala) {
                    if (numSala == 1) {
                        switch (objeto) {
                            case "DECODIFICADOR":
                                if (person.estaNoInventario(objeto)) {
                                    person.addUsados(objeto);
                                    resposta = "Você usou o decodificador com SUCESSO!";
                                    return resposta;
                                }
                        }
                    } else if (numSala == 4) {
                        switch (objeto) {
                            case "NAVE":
                                resposta = "FIM";
                                return resposta;
                        }

                    } else{
                        resposta = "A ação não é permitida nessa sala.";
                        return resposta;
                    }
                    return null;
                }
            },
    APERTAR {
                Personagem person;
                String resposta;
                @Override
                public String executar(String objeto, int numSala) {
                    if (numSala == 2) {
                        switch (objeto) {
                            case "BOTÃO":
                                person.addUsados(objeto);
                                resposta = "Você apertou o botão com SUCESSO!";
                                return resposta;
                        }
                    }else{
                        resposta = "A ação não é permitida nessa sala";
                        return resposta;
                    } 
                    return null;
                }
            },
    PLANTAR {
                Personagem person;
                String resposta;
                @Override
                public String executar(String objeto, int numSala) {
                    if (numSala == 3) {
                        switch (objeto) {
                            case "BOMBA":
                                person.addUsados(objeto);
                                resposta = "Você plantou a bomba com SUCESSO!";
                                return resposta;
                        }
                    }else{
                        resposta = "A ação não é permitida nessa sala";
                        return resposta;
                    } 
                    return null;
                }
            };

    public abstract String executar(String objeto, int numSala);
}
