
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import utfpr.ct.dainf.pratica.Lancamento;
import utfpr.ct.dainf.pratica.ProcessaLancamentos;

/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial.
 * @author 
 */
public class Pratica {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String path;
        Scanner scanner = new Scanner(System.in);
        ProcessaLancamentos lancamentos;
        List<Lancamento> lancamento;
        
        System.out.println("Informe o caminho para o arquivo: ");
        path = scanner.next();
        
        lancamentos = new ProcessaLancamentos(path);
        lancamento = lancamentos.getLancamentos();

    }
    
    public static void exibeLancamentosConta(List<Lancamento> lancamentos, Integer conta) {

    }
 
}