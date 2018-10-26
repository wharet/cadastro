/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cadastro {

    public Cadastro cadastro;
    public int Menu;
    public String Nome;
    public String Login;
    public int Senha;
    public File arquivo;

    Scanner scan = new Scanner(System.in);

    public void CriaMenu() throws IOException {

        System.out.println("Digite uma das opções"
                + "\n 1) - Cadastrar"
                + "\n 2) - Login"

        );
        Menu = scan.nextInt();
        GetExecucao();
    }

    public void GetExecucao() throws IOException {
        switch (Menu) {
            case 1:
                Cadastrar();
                break;
            case 2:
                LoginCadastro();
                break;
            case 0:
                System.out.println("Essa opção não existe");
                this.CriaMenu();
                break;
            default:
                System.out.println("Digite uma das opções do menu");
                this.CriaMenu();
                break;
        }
    }

    public void Cadastrar() throws FileNotFoundException, IOException {
        Cadastro cadastro = new Cadastro();
        System.out.println("Digite seu nome: ");
        cadastro.Nome = scan.next();
        System.out.println("Digite seu login: ");
        cadastro.Login = scan.next();
        System.out.println("Digite sua senha: ");
        cadastro.Senha = scan.nextInt();
        this.EscreveCadastro(cadastro);
    }

    private void EscreveCadastro(Cadastro cadastro)
            throws FileNotFoundException, IOException {
        arquivo.createNewFile();
        FileWriter file = new FileWriter(arquivo, true);
        PrintWriter print = new PrintWriter(file);
        print.print(cadastro.Nome + " | " + cadastro.Login + " | " + cadastro.Senha);
        print.flush();
        print.close();

    }

    public void LoginCadastro() {
        System.out.println("Login: ");

    }

}
