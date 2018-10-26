package cadastro;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {

    Scanner scan = new Scanner(System.in);
    File diretorio;
    File arquivo;

    public Arquivo() throws IOException {
        diretorio = new File("/home/ads/Documentos/");
        arquivo = new File(diretorio, "Cadastro.txt");
    }
}
