package StructuralPattern.FacadePattern;

import StructuralPattern.FacadePattern.HomeTheaterFacade.HomeTheaterFacade;
import StructuralPattern.FacadePattern.Subsystem.DVDPlayer;
import StructuralPattern.FacadePattern.Subsystem.Lights;
import StructuralPattern.FacadePattern.Subsystem.Projector;
import StructuralPattern.FacadePattern.Subsystem.SoundSystem;

public class Client {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, lights);
        homeTheater.watchMovie("The notebook");
        homeTheater.endMovie();


    }
}
