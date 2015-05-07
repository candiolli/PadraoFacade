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
public class SistemasFacade {

    protected SistemaDeAudio audio;
    protected SistemaDeInput input;
    protected SistemaDeVideo video;

    public void inicializarSubsistemas() {
        video = new SistemaDeVideo();
        video.configurarCores();
        video.configurarResolucao();

        input = new SistemaDeInput();
        input.configurarJoystick();
        input.configurarTeclado();

        audio = new SistemaDeAudio();
        audio.configurarCanais();
        audio.configurarFrequencia();
        audio.configurarVolume();
    }

    public void reproduzirAudio(String arquivo) {
        audio.reproduzirAudio(arquivo);
    }

    public void renderizarImagem(String imagem) {
        video.renderizarImagem(imagem);
    }

    public void lerInput() {
        input.lerInput();
    }

}
