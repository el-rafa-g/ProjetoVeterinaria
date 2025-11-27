package Herancas;

import Interfaces.Clinica;

public abstract class Servico implements Clinica {

    @Override
    public abstract void cadastrarAnimal();

    @Override
    public abstract void enviarNotificacao();

    @Override
    public abstract  void cadastrarMedico();
}
