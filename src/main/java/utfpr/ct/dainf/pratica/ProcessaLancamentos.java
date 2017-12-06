package utfpr.ct.dainf.pratica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Linguagem Java
 * @author
 */
public class ProcessaLancamentos {
    private BufferedReader reader;

    //TAREFA 2
    public ProcessaLancamentos(File arquivo) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(arquivo));
    }

    //TAREFA 3
    public ProcessaLancamentos(String path) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(path));
    }
    //TAREFA 4
    private String getNextLine() throws IOException {
        String line;
        
        if((line = this.reader.readLine()) != null) {
            return line;
        }
        
        throw new IOException("Não há mais linhas a serem lidas!");
    }
    
    private Lancamento processaLinha(String linha) {
        Lancamento new_record;
        
        int conta = Integer.parseInt(linha.substring(0, 6));
        int dia = Integer.parseInt(linha.substring(12,14));
        int mes = Integer.parseInt(linha.substring(10,12));
        int ano = Integer.parseInt(linha.substring(6, 10));
        Date data = new Date(ano, mes, dia);
        String descricao = linha.substring(14, 74);
        Double valor = Double.parseDouble(linha.substring(74,84) + '.' + linha.substring(84,86));
        
        new_record = new Lancamento(conta, data, descricao, valor);
        
        return new_record;
    }
    
    private Lancamento getNextLancamento() throws IOException {
        throw new UnsupportedOperationException("Não implementado");
    }
    
    public List<Lancamento> getLancamentos() throws IOException {
        throw new UnsupportedOperationException("Não implementado");
    }
    
}
