package br.edu.iff.teste.heranca;

/**
 *
 * @author luizcanf
 */
public class AlunoConcomitante extends Aluno {
    
    long matriculaEM;
    String escolaEM;
    boolean apresentouCertificadoEM;
    
    
    @Override
    public boolean podeSolicitarDiploma() {
        if (apresentouCertificadoEM && DisciplinasConcluidas && DocumentaçãoCompleta) {
            return true;
        } else {
            return false;
        }
    }
}
