package Herancas;

public class Cadastro extends Servico {

@Override
    public void cadastrarAnimal() {

        // TIPO DO ANIMAL (EXÓTICO OU NÃO)

        int exoticoAnimal = -1;
        while (exoticoAnimal != 0 && exoticoAnimal != 1) {
            exoticoAnimal = JOptionPane.showOptionDialog(
                    null,
                    "Que tipo de animal deseja cadastrar?",
                    "Cadastro de Animal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            if (exoticoAnimal == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Escolha uma opção.");
            }
        }

        setAnimalExotico(exoticoAnimal == 0);


        // NOME DO ANIMAL
        String animalNome;
        while (true) {
            animalNome = JOptionPane.showInputDialog("Digite o nome do seu animal: ");

            if (animalNome == null || animalNome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome inválido! Digite novamente.");
            } else {
                break;
            }
        }

        setNomeAnimal(animalNome);


        // IDADE DO ANIMAL
        int salvarIdade = 0;
        while (true) {
            String animalIdade = JOptionPane.showInputDialog("Digite a idade do seu animal: ");

            try {
                salvarIdade = Integer.parseInt(animalIdade);
                if (salvarIdade < 0) {
                    JOptionPane.showMessageDialog(null, "Idade não pode ser negativa!");
                    continue;
                }
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido!");
            }
        }

        setIdadeAnimal(salvarIdade);


        // PORTE DO ANIMAL (P, M ou G)
        String animalPorte;
        while (true) {
            animalPorte = JOptionPane.showInputDialog("Digite o porte do seu animal (P, M ou G): ");

            if (animalPorte == null || animalPorte.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
                continue;
            }

            animalPorte = animalPorte.toUpperCase();

            if (animalPorte.equals("P") || animalPorte.equals("M") || animalPorte.equals("G")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Digite apenas P, M ou G.");
            }
        }

        setPorteAnimal(animalPorte);


        // DOSES DE VACINA


        int salvarDoses = 0;
        while (true) {
            String animalDoses = JOptionPane.showInputDialog("Quantas doses da vacina seu animal tomou: ");

            try {
                salvarDoses = Integer.parseInt(animalDoses);
                if (salvarDoses < 0) {
                    JOptionPane.showMessageDialog(null, "Número inválido! Não pode ser negativo.");
                    continue;
                }
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digite um número inteiro válido!");
            }
        }

        setNumeroDosesVacina(salvarDoses);
    }


    @Override
    public void enviarNotificacao() {

    }

    @Override
    public void cadastrarMedico() {

    }
}

