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
    
    private String getNextLine() throws IOException {
        String line;
        
        if((line = this.reader.readLine()) != null) {
            return line;
        }
        
        throw new IOException("Não há mais linhas a serem lidas!");
    }
    
    private Lancamento processaLinha(String linha) {
        throw new UnsupportedOperationException("Não implementado");
    }
    
    private Lancamento getNextLancamento() throws IOException {
        throw new UnsupportedOperationException("Não implementado");
    }
    
    public List<Lancamento> getLancamentos() throws IOException {
        throw new UnsupportedOperationException("Não implementado");
    }
    
}
