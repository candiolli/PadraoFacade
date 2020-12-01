/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author silascandiolli
 */
public class Cliente {

    public static void main(String[] args) {
        System.out.println("##### Configurando subsistemas #####");
        SistemasFacade fachada = new SistemasFacade();
        fachada.inicializarSubsistemas();

        System.out.println("##### Utilizando subsistemas #####");
        fachada.renderizarImagem("imagem.png");
        fachada.reproduzirAudio("teste.mp3");
        fachada.lerInput();
        System.out.println("teste");
    }
}
