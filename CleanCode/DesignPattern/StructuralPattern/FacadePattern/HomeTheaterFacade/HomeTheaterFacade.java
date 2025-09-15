package StructuralPattern.FacadePattern.HomeTheaterFacade;

import StructuralPattern.FacadePattern.Subsystem.DVDPlayer;
import StructuralPattern.FacadePattern.Subsystem.Lights;
import StructuralPattern.FacadePattern.Subsystem.Projector;
import StructuralPattern.FacadePattern.Subsystem.SoundSystem;

public class HomeTheaterFacade {
        private DVDPlayer dvdPlayer;
        private Projector projector;
        private SoundSystem soundSystem;
        private Lights lights;

        public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, Lights lights){
                this.dvdPlayer = dvdPlayer;
                this.projector = projector;
                this.soundSystem = soundSystem;
                this.lights = lights;
        }

    public void watchMovie(String movie) {
        System.out.println("\n--- Starting Movie Night ---");
        lights.dim(10);
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(8);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("\n--- Shutting Down Movie Night ---");
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
        lights.on();
    }

}
